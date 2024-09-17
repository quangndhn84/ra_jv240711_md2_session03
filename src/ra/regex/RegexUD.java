package ra.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexUD {
    public static void main(String[] args) {
        /*
         * Nhập thông tin sinh viên theo yêu cầu sau:
         * - Mã sinh viên gồm 5 ký tự, 2 ký tự đầu là SV và 3 ký tự sau là số
         * - Tuối sinh viên gồm số có 2 chữ số
         * - email: abcd@gmail.com
         * - phone: gồm 10 số bắt đâu là các đầu số 090, 091, 092, 098        *
         * */
        Scanner scanner = new Scanner(System.in);
        String studentIdRegex = "SV[\\d]{3}";
        String studentId;
        System.out.println("Nhập vào mã sinh viên:");
        do {
            studentId = scanner.nextLine();
            if (Pattern.matches(studentIdRegex, studentId)) {
                break;
            } else {
                System.err.println("Mã sinh viên không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);
        String ageRegex = "[0-9]{2}";
        int age;
        System.out.println("Nhập vào tuổi sinh viên:");
        do {
            String ageStr = scanner.nextLine();
            if (Pattern.matches(ageRegex, ageStr)) {
                age = Integer.parseInt(ageStr);
                break;
            } else {
                System.err.println("Tuổi sinh viên không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);

        String emailRegex = "[\\w]{5,}@[\\w]{5}\\.[\\w]{2,3}";
        String email;
        System.out.println("Nhập vào email:");
        do {
            email = scanner.nextLine();
            if (Pattern.matches(emailRegex, email)) {
                break;
            } else {
                System.err.println("Không đúng định dạng email, vui lòng nhập lại");
            }
        } while (true);
        String phoneRegex = "(090|091|092|098)[\\d]{7}";
        System.out.println("Mã sinh viên là: " + studentId);
        System.out.println("Tuổi sinh viên: " + age);
        System.out.println("email: " + email);

    }
}
