/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class QuanLy extends CanBo implements Nguoi {
 public double hspc;

    public QuanLy() {
        super();
    }

    public QuanLy(double hspc) {
        this.hspc = hspc;
    }

    @Override
    public void nhap(){
       Scanner a = new Scanner(System.in);
        System.out.println("Nhap ma CB:  ");
        maCB = a.nextLine();
        System.out.println("Nhap ho ten: ");
        hoten = a.nextLine();
        System.out.println("Nhap he so luong: ");
        hsl = a.nextFloat();
        System.out.println("Nhap he so phu cap: ");
        hspc = a.nextDouble();
    }

    @Override
    public void hien() {
     System.out.println("Ma CB: " + maCB);
     System.out.println("Ho ten: "+ hoten);
     System.out.println("He so luong: "+ hsl);
     System.out.println("He so phu cap: "+ hspc);
     System.out.println("Tien luong: "+ tienluong());
    }
    
    @Override
    public double tienluong() {
     double luong = (hsl + hspc ) * 1350000;
        return luong;
    }

    @Override
    public String toString() {
        return "QuanLy{" + "hspc=" + hspc + '}';
    }
}
