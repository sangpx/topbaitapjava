/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

/**
 *
 * @author ASUS
 */
abstract class CanBo {
    public String maCB;
    public String hoten;
    public float hsl;
    public double tienluong;

    public CanBo() {
    }

    public CanBo(String maCB, String hoten, float hsl, double tienluong) {
        this.maCB = maCB;
        this.hoten = hoten;
        this.hsl = hsl;
        this.tienluong = tienluong;
    }
    
 abstract double tienluong();
}
