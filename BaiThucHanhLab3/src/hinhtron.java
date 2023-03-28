import java.util.Scanner;
public class hinhtron{

    
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    void nhapBankinh(){
        System.out.println("Nhap ban kinh hinh tron");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
        scanner.close();
    }
    void tinhChuvi(){
        cv = 2 * PI *r;
    }
    void tinhDientich(){
        dt = PI * r * r;
    }
    void inChuvi(){
        System.out.println("Chu vi hinh tron: " + cv);
    }
    void inDientich(){
        System.out.println("Dien tich hinh tron: " + dt);
    }
    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
        ht.nhapBankinh();
        ht.tinhChuvi();
        ht.inChuvi();
        ht.tinhDientich();
        ht.inDientich();
    }

}



