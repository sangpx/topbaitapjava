package TH1;
import java.util.Scanner;

public class Mang1chieu {
    public static void Nhapmang(int a[]){
        Scanner input = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            System.out.print("a[" + i + "]: " );
            a[i] = input.nextInt();
            System.out.print(" ");
        } 
    }
    public static void Hienmang(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print("\t" +a[i]);
        }
    }
    public static void tinhtongle(int a[]){
       int  tong = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2!=0){
                tong = tong + a[i];
            }
        }
        System.out.print("Tong cac phan tu la: " +tong);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[];
        int n;
        int tong=0;
        System.out.print("Nhap so phan tu mang: ");
         n = s.nextInt();
         a = new int [n];
         System.out.println("Nhap mang: ");
         Nhapmang(a);
         System.out.print("Hien mang: ");
         Hienmang(a); 
        // tinhtongle();

    }
}
