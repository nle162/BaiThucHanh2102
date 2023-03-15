import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can kiem tra: ");
        n = scanner.nextInt();
        // thực hiện câu lệnh if else để kiểm tra điều kiện
        if (n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");
        }
        scanner.close();
    }
}
