package hocjavathayLong;

public class baitapday3_2 {
    public static void main(String[] args) {
        //tim so lon nhat trong mang va vi tri cua no
        int[] so = {1,2,3,4,5,6};
        int max = so[0];
        int vitri = 0;
        for(int i = 1; i < so.length; i++){
            if(so[i] > max){
                max = so[i];
                vitri = i;
            }
            System.out.println("Giá trị lớn nhất trong mảng là " + max + ", ở vị trí " + vitri);
        }
    }

}