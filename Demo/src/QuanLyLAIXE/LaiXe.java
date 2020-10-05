package QuanLyLAIXE;

import java.io.Serializable;
import java.util.Scanner;


public class LaiXe implements Serializable {
    private String maLX;
    private String hoten;
    private String diachi;
    private String trinhdo;

    public LaiXe() {
    }

    public LaiXe(String maLX, String hoten, String diachi, String trinhdo) {
        this.maLX = maLX;
        this.hoten = hoten;
        this.diachi = diachi;
        this.trinhdo = trinhdo;
    }

    public String getMaLX() {
        return maLX;
    }

    public void setMaLX(String maLX) {
        this.maLX = maLX;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }
    
    @Override
    public String toString() {
        return "LaiXe{" + "maLX=" + maLX + ", hoten=" + hoten + ", diachi=" + diachi + ", trinhdo=" + trinhdo + '}';
    }
}
