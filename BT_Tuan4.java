import java.util.ArrayList;
import java.util.Scanner;
public class BT_Tuan4 {
    public static void Bai1(Scanner sc){
        System.out.print("Nhap so nguyen tu ban phim ");
        int x=sc.nextInt();

        if(x<0)
            System.out.println(x+" la so am");
        else 
            if (x==0)
                System.out.println(x+" la so 0");
            else 
                System.out.println(x+" la so duong");
    }

    public static void Bai2(Scanner sc){
        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.print("Nhap c: ");
        int c = sc.nextInt();

        System.out.println("So lon nhat la: "+(a>b?(a>c?a:c):(b>c?b:c)));
    }
    
    public static void Bai3(Scanner sc) {
       System.out.print("nhap so thu 1:");
        int a = sc.nextInt();

        System.out.print("nhap so thu 2:");
        int b = sc.nextInt();
        
        System.out.print("Nhap phep tinh: ");
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
                System.out.println("Khong the chia 0");
            break;
            default:
                System.out.println("Phep tinh khong hop le!!!!");
                break;
        }        
    }
    
    public static void Bai4(Scanner sc){
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int s=0;

        for(int i=1;i<=n;i++)
            s+=i;
        
        System.out.println("Tong tu 1 den "+n+" la: "+s);
    }
    
    public static void Bai5(Scanner sc) {
        System.out.print("Moi ban nhap mot so nguyen : ");
        int n=sc.nextInt();
        int dem=0;

        for(int i=1;i<=n;i++)
            if (n%i==0)
                dem++;

        if (dem==2)
            System.out.println(n+" la so nguyen to");
        else
            System.out.println(n+" khong phai la so nguyen to");
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

    public static void Bai8(Scanner sc) {
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<n;i++ ){
            System.out.print("a["+i+"]= ");
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int so=arr[0];
        for(int i = 0; i<n; i++){
            int count = 1;
            for(int j = i+1; j<n; j++)
                if (arr[j] == arr[i])
                    count++;
            if (count>max) {
                max = count;
                so = arr[i];
            }    
            }
            System.out.println("So xuat hien nhieu nhat la: "+so);
        }

    public static void Bai9(Scanner sc){
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            System.out.print("Nhap a["+(i+1)+"]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("Cac phan tu cua mang la: ");
        for(int i : a)
            System.out.print(i+" ");
    }
    
    public static void Bai10(Scanner sc){
        ArrayList<Integer> list= new ArrayList<>();
        System.out.print("Nhap so luong phan tu: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.print("So thu "+(i+1)+" la: ");
            int x=sc.nextInt();
            list.add(x);
        }
        System.out.println("Day so la: ");
        for (int num:list)
            System.out.print(num+"  ");
        System.out.println();
        System.out.println("Nhap vi tri muon chen vao ");
        int k=sc.nextInt();
        System.out.println("Nhap gia tri muon chen vao ");
        int x=sc.nextInt();
        list.add(k-1,x);
        System.out.println("Day so sau khi chen la: ");
        for (int num:list)
            System.out.print(num+"  ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bai 1:");
        Bai1(sc);

        System.out.println("\nBai 2:");
        Bai2(sc);

        System.out.println("\nBai 3:");
        Bai3(sc);

        System.out.println("\nBai 4:");
        Bai4(sc);

        System.out.println("\nBai 5:");
        Bai5(sc);

        System.out.println("\nBai 6:");
        Bai6(sc);

        System.out.println("\nBai 7:");
        Bai7(sc);

        System.out.println("\nBai 8:");
        Bai8(sc);
        
        System.out.println("\nBai 9:");
    
        Bai9(sc);

        System.out.println("\nBai 10:");
        Bai10(sc);
        
        sc.close();
    }
}