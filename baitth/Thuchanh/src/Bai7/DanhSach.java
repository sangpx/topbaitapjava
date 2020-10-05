package Bai7;
 import java.util.Scanner;
 import java.util.ArrayList;

    public class DanhSach {
    ArrayList<DoanThang> listDT;
    
    
    public void DanhSach(){
        listDT = new ArrayList();
    }
    
    public void nhapds(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so doan thang: ");
        int n = input.nextInt();
        listDT = new ArrayList<DoanThang>(n);
        for(int i=0; i<n; i++){
            DoanThang doanthang = new DoanThang();
            System.out.println("Doan Thang thu: " + (i+1));
            doanthang.nhap();
            listDT.add(doanthang);
        }
    }
    
    public void xuatds(){
        System.out.println("===============================");
        System.out.println("In danh sach doan thang: ");
        for(DoanThang doanthang: listDT){
            doanthang.xuat();
        }
    }
    
    public void dodaimax(){
         float max = 0;
         DoanThang dtmax = new DoanThang();
         for(DoanThang dt : listDT){
             if(dt.tinhchieudai() > max){
                 dtmax = dt;
             }
         }
          System.out.println("===================================");
          System.out.println("Doan thang co do dai lon nhat la: ");
                 dtmax.xuat();
        
    }
    
    public void tongdt(){
        float tong = 0;
        for(DoanThang doanthang : listDT){
            tong = tong + doanthang.tinhchieudai();
         }
        System.out.println("==========================================");
        System.out.println("Tong cua tat ca cac doan thang la: " + tong);
    }
}
