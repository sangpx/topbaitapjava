/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Nguoi {
    private String hoten;
    private String gioitinh;

    public Nguoi() {
    }

    public Nguoi(String hoten, String gioitinh) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    
    
    public void nhapnguoi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten nguoi: ");
        hoten = input.nextLine();
        System.out.println("Nhap gioi tinh nguoi do: ");
        gioitinh = input.nextLine();
    }
    
    public void hiennguoi(){
        System.out.println("Ho ten: " + hoten);
        System.out.println("Gioi tinh: " + gioitinh);
    }

    @Override
    public String toString() {
        return "Nguoi: " + "\thoten= " + hoten + "\tgioitinh= " + gioitinh;
    }
    
    
}
