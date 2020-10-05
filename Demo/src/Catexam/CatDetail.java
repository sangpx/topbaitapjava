/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catexam;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CatDetail implements Cat {
    private String loai;
    private String mau;
    private String noisong;

    public CatDetail() {
    }

    public CatDetail(String loai, String mau, String noisong) {
        this.loai = loai;
        this.mau = mau;
        this.noisong = noisong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNoisong() {
        return noisong;
    }

    public void setNoisong(String noisong) {
        this.noisong = noisong;
    }
    
    
    
    @Override
    public void nhap() {
       Scanner input = new Scanner(System.in);
        System.out.println("Nhap loai: ");
        loai = input.nextLine();
        System.out.println("Nhap mau sac: ");
        mau = input.nextLine();
        System.out.println("Nhap noi song: ");
        noisong = input.nextLine();
    }

    @Override
    public String toString() {
        return "CatDetail{" + "ten=" + ten + ",loai=" + loai + ", mau=" + mau + ", noisong=" + noisong + '}';
    }
    
    @Override
    public void hien() {
        System.out.println(toString());
    }
    
}
