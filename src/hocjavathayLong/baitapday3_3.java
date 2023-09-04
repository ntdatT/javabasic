package hocjavathayLong;

import java.util.Scanner;

public class baitapday3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuoc cua mang: ");
        int size = sc.nextInt(); // hung gia tri kich thuoc mang la size
        // tao mang
        int[] mang = new int[size];
        // nhap cac phan tu cua mang
        System.out.println("nhap cac phan tu cua mang: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }
        // phan tu lon nhat trong mang
        int max = mang[0];
        int index = 0;
        for(int i = 1; i < mang.length; i++){
            if ( mang[i]> max){
                max = mang[i];
                index = i;
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là " + max + ", ở vị trí " + index);
        }

}




