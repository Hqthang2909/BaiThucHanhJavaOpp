import java.util.Scanner;

class HinhTron {
    //thuộc tính
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    void nhapBanKinh() {
        System.out.println("Hãy nhập vào bán kính hình tròn: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }

    void tinhChuVi() {
        cv = 2 * PI * r;
    }

    void tinhDienTich() {
        dt = PI * r * r;
    }

    void inChuVi() {
        System.out.println("Chu Vi Hình Tròn: " + cv);
    }

    void inDienTich() {
        System.out.println("Diện Tích Hình Tròn: " + dt);
    }
}