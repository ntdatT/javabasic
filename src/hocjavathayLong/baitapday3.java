package hocjavathayLong;

import java.util.Scanner;

public class baitapday3 {
    public static void main(String[] args) {
// bai 1 va bai 4: tinh giai thua cua moot so nguyen do nguoi dung nhap vao
// n! = 1 × 2 × 3 × ... × n
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

// bai 2 in ra cac so chan chi het cho 5 tu 1 den 10
        for (int i = 1; i <= 10; i++) {
            int a;
            a = i % 5;
            if (a == 0) {
                System.out.println(i);
            }
        }
// bai 3 tinh so BMI theo du lieu nguoi dung nhap vao
// BMI = cân nặng (kg) / chiều cao² (m²)
        double b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("xin nhap can nang(kg): ");
        b = sc.nextDouble();
        System.out.println("xin nhap chieu cao(m): ");
        c = sc.nextDouble();
        d = b / (c * c);
        System.out.println("So MBI cua ban la: " + d);
//bai 4: tinh giai thua 1 so nhap vao
        int e,g = 1;
        System.out.println("xin nhap so de tinh giai thua: " );
        e = sc.nextInt();
        for (int f = 1; f <= e; f++) {
            g *= f;
        }
        System.out.println("giai thua la: " +g);
    }

    }
