/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Nguoi implements Serializable {
    private String hoten;
    private int namsinh;
    private String gioitinh;

    public Nguoi(String hoten, int namsinh, String gioitinh) {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
    }

    public Nguoi() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    
    public void nhapnguoi(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten: " );
        hoten = input.nextLine();
        System.out.println("Nhap nam sinh: ");
        namsinh = input.nextInt();
        input.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioitinh = input.nextLine();
    }
    
    public void hiennguoi(){
        System.out.println("Ho ten: " + hoten);
        System.out.println("Nam sinh: " + namsinh);
        System.out.println("Gioi tinh: " + gioitinh);
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoten=" + hoten + ", namsinh=" + namsinh + ", gioitinh=" + gioitinh + '}';
    }
    
    
}
