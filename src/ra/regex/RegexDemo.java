package ra.regex;

import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        System.out.println("So khớp chuỗi đầu vào Java với chuỗi mẫu là Java: " + Pattern.matches("Java", "JAva"));
        System.out.println(". đại diện cho ký tự bất kỳ: " + Pattern.matches("J..a", "J%aa"));
        System.out.println("(ab|cd): hoặc là ab hoặc cd: "+Pattern.matches("J(av|bb)a","Jbba"));
        System.out.println("[abc] là 1 trong 3 ký tự a hoặc b hoặc c: "+Pattern.matches("Ja[vzy]a","Java"));
    }
}
