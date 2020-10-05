/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;
import java.util.Scanner;

    public class Diem {
       private float x;
       private float y;
       
       public Diem(){
           
       }

    public Diem(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }

      public void Nhap(){
          System.out.println("Nhap x: ");
          x = new Scanner(System.in).nextFloat();
          System.out.println("Nhap y: ");
          y = new Scanner(System.in).nextFloat();
      }
      
      public void Xuat(){
          System.out.println("Hien x: " + x);
          System.out.println("Hien y: " + y);
      }

    @Override
    public String toString() {
        return "Diem: " + "x= " + x + ", y= " + y + '}';
    }
      
}
