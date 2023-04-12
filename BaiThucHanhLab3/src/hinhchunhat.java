package hinhhoc;

import java.util.Scanner;

public class hinhchunhat {
    float dai;
    float rong;
    float cvhcn, dthcn;
    public void xuatTen() {
        String ten = "Hình Chữ Nhật";
        }

    void nhapChieuDai(){
        System.out.println("nhap chieu dai: ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }

    void nhapChieuRong() {
        System.out.println("nhap chieu rong: ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }

    public float tinhChuvi() {
        cvhcn = (dai + rong) * 2;
        return cvhcn;
    }

    public float tinhDientich() {
        dthcn = dai * rong;
        return dthcn;  
    }

    void inChuVi(){
        System.out.println("Chu vi hinh chu nhat nhat la: " + cvhcn);
    }

    void inDienTich(){
        System.out.println("Dien tich hinh chu nhat la: " + dthcn);
    }

    public static void main(String[] args) {
        hinhchunhat hcn = new hinhchunhat();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuvi();
        hcn.tinhDientich();
        hcn.inChuVi();
        hcn.inDienTich();

    }
    
}
