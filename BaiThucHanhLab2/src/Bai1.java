import java.util.Scanner;
import java.text.DecimalFormat;

public class Bai1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.println("Nhap vao a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao b: ");
        int b = scanner.nextInt(); 
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
         
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
         
        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);
         
        float thuong = (float) a / b;
        
        System.out.println(a + " / " + b + " = " + thuong);
                decimalFormat.format(thuong);  
         
        int phanDu = a % b;
        System.out.println(a + " % " + b + " = " + phanDu); 
        scanner.close();  
        }
}
