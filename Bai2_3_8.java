package nhom1tuan4;

import java.util.Scanner;

public class Bai2_3_8 {
    public static void bai2(Scanner sc) {
        System.out.println("nhap a:");
        int a = sc.nextInt();

        System.out.println("Nhap b:");
        int b = sc.nextInt();

        System.out.println("Nhap c:");
        int c = sc.nextInt();

        int max = (a>b ? (a>c? a : c) : (b>c? b : c));
        System.out.println("So lon nhat la: "+max);
    }
    public static void bai3(Scanner sc) {
       System.out.println("nhap so thu 1:");
        int a = sc.nextInt();

        System.out.println("nhap so thu 2:");
        int b = sc.nextInt();
        
        System.out.println("Nhap phep tinh: ");
        Character pheptoan = sc.next().charAt(0);
        switch (pheptoan) {
            case '+':
            System.out.println("Tong hai so la: "+(a+b));
            break;
            case '-':
            System.out.println("Hieu hai so la: "+(a-b));
            break;
            case '*':
            System.out.println("Tich hai so la: "+(a*b));
            break;
            case '/':
            if (b!=0) 
                System.out.println("Thuong cua hai so la:"+((double)a/b));
            else
                System.out.println("khong the chia 0");
            default:
                System.out.println("Phep tinh khong hop le!!!!");
                break;
        } 
        
    }
    public static void bai8(Scanner sc) {
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Nhap ca phan tu:");
        for(int i = 0; i<n;i++ ){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int so = 0;
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = i+1;j <n;j++){
                if (arr[i] == arr[j])
                    count++;
            }
            if (count>max) {
                max = count;
                so = arr[i];
            }    
            }
            System.out.println("so lxuat hien nhieu nhat la: "+so);
        }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    bai2(sc);
    bai3(sc);
    bai8(sc);
    sc.close();
}
        
}


    

