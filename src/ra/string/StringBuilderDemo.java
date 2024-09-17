package ra.string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Rikkei Academy");
        System.out.println("Chuỗi builder là: " + stringBuilder);
        System.out.println("Nỗi chuỗi: " + stringBuilder.append(" - Học viện CNTT"));
        System.out.println("Chèn chuỗi: " + stringBuilder.insert(26, "đào tạo "));
        System.out.println("Xóa các ký tự trong chuỗi: " + stringBuilder.delete(0, 6));
        System.out.println("Đảo ngược chuỗi: " + stringBuilder.reverse());
    }
}
