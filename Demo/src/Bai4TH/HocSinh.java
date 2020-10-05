/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4TH;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
 public class HocSinh {
    private String msv;
    private String hoten;
    private int lop;
    private int buoi;
   
    public HocSinh(){
    
    }

    public HocSinh(String msv, String hoten, int lop, int buoi) {
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.buoi = buoi;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getBuoi() {
        return buoi;
    }

    public void setBuoi(int buoi) {
        this.buoi = buoi;
    }
    
     public void nhap(){
       System.out.println("Nhap Ma Sinh Vien: ");
       msv = new Scanner(System.in).nextLine();
       System.out.println("Nhap ho ten sv: ");
       hoten = new Scanner(System.in).nextLine();
       System.out.println("Nhap ten lop: ");
       lop = new Scanner(System.in).nextInt();
       System.out.println("Nhap so buoi an ban tru: ");
       buoi = new Scanner(System.in).nextInt();  
   }
    
    @Override
     public String toString() {
        return "HocSinh{" + "msv=" + msv + ", hoten=" + hoten + ", lop=" + lop + ", buoi=" + buoi + '}';
    }
   
     public void hien() {
       System.out.println("" + toString());
   }
    
    public int Tinhtien(){
        return buoi *30000;
    }

 }

