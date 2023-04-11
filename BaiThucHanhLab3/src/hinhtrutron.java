import java.util.Scanner;

public class hinhtrutron {
    final float PI = 3.14f;
    float r;
    float h;
    float tt, dtxq, dttp;

    void nhapBankinh() {
        System.out.println("nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }

    void nhapChieuCao() {
        System.out.println("nhap chieu cao");
        Scanner sc = new Scanner(System.in);
        h = sc.nextFloat();
    }

    public float tinhdtxq() {
        dtxq = 2 * PI * r * h;
        return dtxq;
    }

    public float tinhdttp() {
        dttp = 2 * PI * r * (r + h);
        return dttp;
    }

    public float tinhtt() {
        tt = PI * r * r * h;
        return tt;
    }

    void indtxq() {
        System.out.println("Dien tich xung quanh hinh tru tron la: " + dtxq);
    }

    void indttp() {
        System.out.println("Dien tich toan phan hinh tru tron la: " + dttp);
    }

    void intt() {
        System.out.println("The tich hinh tru tron la: " + tt);
    }

    public static void main(String[] args) {
        hinhtrutron htt = new hinhtrutron();
        htt.nhapBankinh();
        htt.nhapChieuCao();
        htt.tinhdttp();
        htt.indttp();
        htt.tinhdtxq();
        htt.indtxq();
        htt.tinhtt();
        htt.intt();
    }
}


