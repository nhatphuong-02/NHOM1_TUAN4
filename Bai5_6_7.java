import java.util.Scanner;

import Tuhoc.string1;

public class Bai5_6_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bai5(sc);
        Bai6(sc);
        Bai7(sc);
    }

    public static void Bai5(Scanner sc) {
        System.out.print("Moi ban nhap mot so nguyen : ");
        int n=sc.nextInt();
        int dem=0;
        for(int i=1;i<=n;i++)
            if (n%i==0) {
                dem++;
            }
        if (dem==2) {
            System.out.println(n+" la so ngto");
        }else
            System.out.println(n+" khong phai la so ngto");
        System.out.println("\n");
    }
    
    public static void Bai6(Scanner sc) {
            System.out.print("Moi ban nhap hai so: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int x=a;
            int y=b;
            while (y!=0) {
                int r=x%y;
                x=y;
                y=r;
            }
            int UCLN = x;
            int BCNN = (a*b)/UCLN;

            System.out.println("UCLN la: "+UCLN);
            System.out.println("BCNN la: "+BCNN);
        System.out.println("\n");     
    }
    

    public static void Bai7(Scanner sc) {

        System.out.print("Nhap so phan tu: ");
        int n=sc.nextInt();

        int[] arr= new int[n];

        for(int i=0;i<n;i++) {
            System.out.print("arr["+(i+1)+"] = ");
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }

        System.out.println("Tong cac so trong mang: " +sum);
    }
}
