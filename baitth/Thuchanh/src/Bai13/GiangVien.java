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
public class GiangVien  extends CanBo implements Nguoi {
    public String tenKhoa;
    public String nhomMon;

    public GiangVien() {
        super();
    }

    public GiangVien(String tenKhoa, String nhomMon) {
        this.tenKhoa = tenKhoa;
        this.nhomMon = nhomMon;
    }
    
    @Override
    public void nhap() {
      Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten Khoa: ");
        tenKhoa = in.nextLine();
        System.out.println("Nhap ten nhom mon: ");
        nhomMon = in.nextLine();
        System.out.println("Nhap ma CB: ");
        maCB = in.nextLine();
        System.out.println("Nhap ho ten: ");
        hoten = in.nextLine();
        System.out.println("Nhap he so luong: ");
        hsl = in.nextFloat();
    }

    @Override
    public void hien() {
        System.out.println("Ma CB: " + maCB);
        System.out.println("Ho ten: " + hoten);
        System.out.println("He So Luong: " + hsl);
        
        System.out.println("Ten Khoa: " + tenKhoa);
        System.out.println("Ten nhom Mon: " + nhomMon);
        System.out.println("Tinh luong: " + tienluong());
    }
    
    @Override
      public double tienluong(){
        double luong = hsl * 1350000 * 1.2;
        return luong;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "tenKhoa=" + tenKhoa + ", nhomMon=" + nhomMon + '}';
    } 
}
