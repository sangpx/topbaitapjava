/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class HocSinh extends Nguoi implements IHoatDong {
    private String tenlop;

    public HocSinh() {
        super();
    }

    public HocSinh(String hoten, int namsinh, String gioitinh, String tenlop) {
        super(hoten, namsinh, gioitinh);
        this.tenlop = tenlop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }
    
    public void nhaphocsinh(){
        super.nhapnguoi();
        System.out.println("Nhap ten lop: ");
        tenlop = new Scanner(System.in).nextLine();
    }
    
    public void hienhocsinh(){
        super.hiennguoi();
        System.out.println("Ten lop: " + tenlop);
    }

    @Override
    public String toString() {
        return "HocSinh{" + super.toString() + "tenlop=" + tenlop + '}';
    }

    
    @Override
    public String gioithieu() {
        return super.toString() + "\t" + tenlop;
    }
}
