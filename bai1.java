import java.util.Scanner;
public class bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen tu ban phim ");
        int x=sc.nextInt();
        if(x<0){
            System.out.println(x+" La so am");
        }else 
            if (x==0){
                System.out.println(x+"  La so 0");
            }else 
                System.out.println(x+"  La so duong");
        sc.close();       
    }
}