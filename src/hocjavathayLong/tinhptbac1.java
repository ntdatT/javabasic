package hocjavathayLong;

import java.sql.SQLOutput;
import java.util.Scanner;

public class tinhptbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("xin nhap a: ");
        String a = sc.nextLine(); // hứng giá trị được nhập vào
        System.out.println("a la:"+ a);
        System.out.println("xin nhap b: ");
        String b = sc.nextLine(); // hứng giá trị được nhập vào
        System.out.println("b la: "+ b);
        System.out.println("xin nhap c: ");
        String c = sc.nextLine(); // hứng giá trị được nhập vào
        System.out.println("c la: "+ c);
        if (Integer.parseInt(a) == 0){
            System.out.println("a khong the bang 0");
        }
        else{
            int x = (Integer.parseInt(c) - Integer.parseInt(b))/Integer.parseInt(a);
            System.out.println("x = " +x);

        }
    }
}
