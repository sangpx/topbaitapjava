
package Bai6va9;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CongNhan {
    
    public static final float lcb = 1150;
    private float hsl;
    private String hoten;
    private float pc;
    
    public CongNhan(){
        
    }

    public CongNhan(float hsl, String hoten, float pc) {
        this.hsl = hsl;
        this.hoten = hoten;
        this.pc = pc;
    }


    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getPc() {
        return pc;
        }

    public void setPc(float pc) {
        this.pc = pc;
        }
    
    public float tinhLuong(){
       return hsl * lcb;
    }
    
    public float tinhLuongpc(){
        return lcb * hsl * (1 + pc);
        }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap he so luong: ");
        hsl = sc.nextFloat();
        System.out.println("Nhap muc phu cap P: ");
        pc = sc.nextFloat();
    }
    
    public void Xuat(){
        System.out.println("Ho ten cong nhan: " + hoten);
        System.out.println("He so luong cua cong nhan: " + hsl);
        System.out.println("Luong: " + tinhLuong());
        System.out.println("Luong phu cap: " + tinhLuongpc());
    }

    @Override
    public String toString() {
        return "CongNhan: " + " hsl=" + hsl + ", hoten=" 
                + hoten + "\t Luong= " + tinhLuong() + "\tLuong phu cap= " + tinhLuongpc();
    }
    
    
}
