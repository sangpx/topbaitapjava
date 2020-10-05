/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MatHang {
    private String tenhang;
    private int mahang;
    private String nuocsx;

    public MatHang() {
    }

    public MatHang(String tenhang, int mahang, String nuocsx) {
        this.tenhang = tenhang;
        this.mahang = mahang;
        this.nuocsx = nuocsx;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public int getMahang() {
        return mahang;
    }

    public void setMahang(int mahang) {
        this.mahang = mahang;
    }

    public String getNuocsx() {
        return nuocsx;
    }

    public void setNuocsx(String nuocsx) {
        this.nuocsx = nuocsx;
    }
    
    public void nhapmathang(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        mahang = input.nextInt();
        input.nextLine();
        System.out.println("Nhap ten hang: ");
        tenhang = input.nextLine();
        System.out.println("Nhap nuoc san xuat: ");
        nuocsx = input.nextLine();
    }
    
    public void hienmathang(){
        System.out.println("Ma hang: " + mahang);
        System.out.println("Ten hang: " + tenhang);
        System.out.println("Nuoc san xuat: " + nuocsx);
    }

    @Override
    public String toString() {
        return "MatHang: " + "  tenhang= " + tenhang + "  mahang= " + mahang + "  nuocsx= " + nuocsx;
    }  
}
