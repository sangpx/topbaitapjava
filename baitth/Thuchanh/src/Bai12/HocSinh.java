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
public class HocSinh extends Nguoi {
    private String tenlop;

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }
    
    
    public HocSinh() {
    }

    public HocSinh(String hoten, String gioitinh, String tenlop) {
        super(hoten, gioitinh);
        this.tenlop = tenlop;
    }
    
    public void nhaphs(){
        Scanner out = new Scanner(System.in);
        super.nhapnguoi();
        System.out.println("Nhap ten lop: ");
        tenlop = out.nextLine();
    }
    
    public void hienhs(){
        super.hiennguoi();
        System.out.println("Ten lop: " + tenlop);
    }

    @Override
    public String toString() {
        return "HocSinh: " + super.toString() + "\ttenlop= " + tenlop;
    }
    
    
}
