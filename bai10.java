import java.util.Scanner;
import java.util.ArrayList;
public class bai10 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
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
    sc.close();
    }
}