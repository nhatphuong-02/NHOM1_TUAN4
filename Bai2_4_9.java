import java.util.Scanner;

public class Bai2_4_9 {
    public static void Bai2(Scanner sc){
        System.out.println("Nhap a: ");
        int a = sc.nextInt();

        System.out.println("Nhap b: ");
        int b = sc.nextInt();

        System.out.println("Nhap c: ");
        int c = sc.nextInt();

        System.out.println("So lon nhat la: "+(a>b?(a>c?a:c):(b>c?b:c)));
    }
    public static void Bai4(Scanner sc){
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int s=0;

        for(int i=1;i<=n;i++)
            s+=i;
        
        System.out.println("Tong tu 1 den "+n+" la: "+s);
    }
    public static void Bai9(Scanner sc,int[] a){
        for(int i=0; i<a.length; i++){
            System.out.println("Nhap a["+(i+1)+"]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("Cac phan tu cua mang la: ");
        for(int i : a)
            System.out.print(+i+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bai 2:");
        Bai2(sc);

        System.out.println("\nBai 4:");
        Bai4(sc);
        
        System.out.println("\nBai 9:");
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        Bai9(sc, a);
        sc.close();
    }
}