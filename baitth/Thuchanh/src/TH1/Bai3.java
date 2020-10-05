package TH1;
import java.util.Scanner;
import java.lang.Math;
  public class Bai3{
      public static void main(String[] args) {
          Scanner dientich = new Scanner(System.in);
          System.out.print("Nhap canh 1: ");
          int a = dientich.nextInt();
          System.out.print("Nhap canh 2: ");
          int b = dientich.nextInt();
          System.out.print("Nhap canh 3: ");
          int c = dientich.nextInt();
          int p = a + b + c;
          double s;
          s = (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
          System.out.print("Dien tich tam giac la: " + s);
      }
  }