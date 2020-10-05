/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyLAIXE;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tuyen implements Serializable {
    private String matuyen;
    private int khoangcach;
    private int sodiemdung;

    public Tuyen() {
    }

    public Tuyen(String matuyen, int khoangcach, int sodiemdung) {
        this.matuyen = matuyen;
        this.khoangcach = khoangcach;
        this.sodiemdung = sodiemdung;
    }

    public String getMatuyen() {
        return matuyen;
    }

    public void setMatuyen(String matuyen) {
        this.matuyen = matuyen;
    }

    public int getKhoangcach() {
        return khoangcach;
    }

    public void setKhoangcach(int khoangcach) {
        this.khoangcach = khoangcach;
    }

    public int getSodiemdung() {
        return sodiemdung;
    }

    public void setSodiemdung(int sodiemdung) {
        this.sodiemdung = sodiemdung;
    }
    
    @Override
    public String toString() {
        return "Tuyen{" + "matuyen=" + matuyen + ", khoangcach=" + khoangcach + ", sodiemdung=" + sodiemdung + '}';
    }
    
    
}
