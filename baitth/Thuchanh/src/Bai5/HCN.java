/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class HCN {
    private float chieudai;
    private float chieurong;
   

    public float getChieudai() {
        return chieudai;
    }

    public float getChieurong() {
        return chieurong;
    }


    public void setChieudai(float chieudai) {
        this.chieudai = chieudai;
        
    }

    public void setChieurong(float chieurong) {
        this.chieurong = chieurong;
    }
    public float dientich()
    {
        float dientich = chieudai*chieurong;
        return dientich;
    }
    
    public float chuvi(){
        float chuvi = (chieudai + chieurong) *2;
        return chuvi;
    }
     
    public void nhap(){
        System.out.println("Nhap chieu dai: ");
        chieudai = new Scanner(System.in).nextFloat();
        System.out.println("Nhap chieu rong: ");
        chieurong = new Scanner(System.in).nextFloat();
    }
   
    @Override
    public  String toString()
    {
        return "chiều dài:"+chieudai + "  chiều rộng:" +chieurong+"\tdiện tích:"+ dientich() + "\tchu vi:" + chuvi();
  
    }
}
