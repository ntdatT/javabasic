import java.sql.SQLOutput;
import java.util.Scanner;

public class baitapday2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        String chieudai = sc.nextLine(); // hứng giá trị được nhập vào
        System.out.println("chieu dai la:"+ chieudai);
        System.out.println("nhap chieu rong: ");
        String chieurong = sc.nextLine(); // hứng giá trị được nhập vào
        System.out.println("chieu rong la:"+ chieurong);
        int dientich = Integer.parseInt(chieudai) * Integer.parseInt(chieurong);
        System.out.println("dien tich la: " + dientich);
    }
}