package TH1;
import java.util.Scanner;
public class Baith1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = s.nextInt();
        int a[];
        a =new int[n];
        for(int i=0; i<n; i++){
            System.out.print("a[" +i+ "]= ");
            a[i] = s.nextInt();
        }
        System.out.println("In mang: ");
        for(int i=0; i<n; i++){
            System.out.print("\t" +a[i]);
        }
        int tong=0;
        for(int i=0; i<n; i++){
            tong=tong+a[i];
        }
        System.out.print("\n Tong cua cac phan tu trong mang la:  " +tong);
        System.out.print("\n Cac phan tu le trong mang la: ");
        for(int i=0; i<n; i++){
            if(a[i]%2!=0){
                System.out.print("\t" + a[i]);
            }
        }
        int vt = 0;
        int min = a[0];
        for(int i=0; i<n; i++){
            if(min>a[i]){
                min = a[i];
                vt = i;
            }
        }
        System.out.print("\n Gia tri Min: " +min);
        System.out.print("\n Vi tri cua gia tri Min: " +vt);
    }
}