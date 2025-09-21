import java.util.ArrayList;
import java.util.Scanner;
public class bai9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang :");
        int n=sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            System.out.print("so thu "+(i+1)+" la:");
            int x=sc.nextInt();
            list.add(x);
        }
        for (int num: list)
            System.out.print(num+" ");
        sc.close();
    }
}