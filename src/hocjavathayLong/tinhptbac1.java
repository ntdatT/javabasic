package hocjavathayLong;

import java.util.Scanner;

public class tinhptbac1 {
    public static void main(String[] args) {
        double a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("xin nhap a: ");
        a = sc.nextDouble(); // hứng giá trị được nhập vào
        System.out.println("a la:"+ a);
        System.out.println("xin nhap b: ");
        b = sc.nextDouble(); // hứng giá trị được nhập vào
        System.out.println("b la: "+ b);

        if (a == 0) {
            //neu a = 0
            if (b == 0) {
                //va neu b =0
                System.out.println("phuong trinh vo so nghiem");
            } else {
                // neu b khac 0
                System.out.println("phuong trinh vo nghiem nha!!!!");
            }
        }else{
            x = - b / a;
            System.out.println("x = " +x);

        }
    }
}
