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
public class TuLanh extends MatHang {
    private int dungtich;
    private String mausac;
    private String hangsx;
    private int soluong;
    private float dongia;

    public TuLanh() {
        super();
    }

    public TuLanh(String tenhang, int mahang, String nuocsx, int dungtich, String mausac, String hangsx, int soluong, float dongia) {
        super(tenhang, mahang, nuocsx);
        this.dungtich = dungtich;
        this.mausac = mausac;
        this.hangsx = hangsx;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public int getDungtich() {
        return dungtich;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getHangsx() {
        return hangsx;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
    
    public void nhaptulanh(){
        super.nhapmathang();
        Scanner out = new Scanner(System.in);
        System.out.println("Nhap dung tich: ");
        dungtich = out.nextInt();
        System.out.println("Nhap mau sac: ");
        out.nextLine();
        mausac = out.nextLine();
        System.out.println("Nhap hang san xuat: ");
        hangsx = out.nextLine();
        System.out.println("Nhap so luong: ");
        soluong = out.nextInt();
        System.out.println("Nhap don gia: ");
        dongia = out.nextFloat();
    }
    
    public void hientulanh(){
        super.hienmathang();
        System.out.println("Dung tich tu lanh: " + dungtich);
        System.out.println("Mau sac: " + mausac);
        System.out.println("Hang san xuat: " + hangsx);
        System.out.println("So luong: " + soluong);
        System.out.println("Don gia: " + dongia);
    }
    
    public float thanhtien(){
        return dongia * soluong;
    }

    @Override
    public String toString() {
        return "TuLanh: " + super.toString() + "  dungtich= " + dungtich + "  mausac= " 
                + mausac + "  hangsx= " + hangsx + "  soluong= " + soluong + "  dongia=" + dongia;
    }
}
