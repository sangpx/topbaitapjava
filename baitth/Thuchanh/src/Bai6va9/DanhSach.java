package Bai6va9;
import java.util.Scanner;
import java.util.ArrayList;
 

 public class DanhSach {
    ArrayList<CongNhan> listCongNhan = new ArrayList();
    public void DanhSach(){
        
    }
    
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so cong nhan: ");
        int n = input.nextInt();
        System.out.println("Nhap thong tin cong nhan: ");
        for(int i = 0; i < n; i++){
            CongNhan congnhan = new CongNhan();
            System.out.println("Nhap cong nhan thu " + (i+1) + ":");
            congnhan.Nhap();
            listCongNhan.add(congnhan);
        }
    }
 
    
    public void Hien(){
        for(CongNhan cn : listCongNhan){
            System.out.println(cn.toString());
        }
    }
    
    /*public void xuatluong(){
        Scanner a = new Scanner(System.in);
        System.out.println("Nhap so thuc S: ");
        float S = a.nextFloat();
        System.out.println("==========================================");
        System.out.println("Danh sach ho ten cong nhan co luong > S: ");
        for(CongNhan cn : listCongNhan){
            if(cn.tinhLuong() > S){
                cn.Xuat();
            }
        }
    }*/
    
    public void tongtienchenhlech(){
        float s = 0;
        for(CongNhan cn : listCongNhan){
            s = s + (cn.tinhLuongpc() - cn.tinhLuong());
        }
        System.out.println("Tong tien chenh lech: " + s);
    }
    
}
