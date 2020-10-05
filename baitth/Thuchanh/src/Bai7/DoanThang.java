package Bai7;
import java.lang.Math;

    public class DoanThang {
   private Diem A;
   private Diem B;
   
   public DoanThang(){
       A = new Diem();
       B = new Diem();   
   }

    public DoanThang(float xA, float yA, float xB, float yB){
        A = new Diem(xA, yA);
        B = new Diem(xB, yB);  
   }

    
    public void nhap(){
        System.out.println("Nhap diem A: ");
        A.Nhap();
        System.out.println("Nhap diem B: ");
        B.Nhap();
    }
    
    public float tinhchieudai(){
    return (float) Math.sqrt((A.getX() - B.getX()) * (A.getX() - B.getX()) + (A.getY() - B.getY()) * (A.getY() - B.getY()));
    }
    
    
    public void xuat(){
        System.out.println("DiemA: ");
        A.Xuat();
        System.out.println("DiemB: ");
        B.Xuat();
        System.out.println("\tDo dai doan thang AB: " + tinhchieudai());
    }
}
