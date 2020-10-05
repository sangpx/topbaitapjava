
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4TH;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
 
    public class danhsach {
    public ArrayList<HocSinh> hocsinh = new ArrayList<>();
    public void nhapds(){
    Scanner spt = new Scanner(System.in);
       System.out.print("Nhap so hoc sinh:");
       int n = spt.nextInt();
       for (int i = 0; i < n; ++i) {
           System.out.println("Nhap học sinh thu "+(i+1));
           HocSinh input = new HocSinh();
           input.nhap();
           hocsinh.add(input);
       }
    }
       public void hiends() {
           System.out.println("=================================================");
           System.out.println("Hien danh sach cac hoc sinh : \n");
           for (int i = 0; i < hocsinh.size(); ++i) {
               hocsinh.get(i).hien();
           }
    }
       public void tinhtong() {
           System.out.print("\nTongtien ban tru cua cac hoc sinh : ");
           float tong = 0;
           for (int i = 0; i < hocsinh.size(); ++i) {
               if (hocsinh.get(i).Tinhtien() > 0) {
                   tong += hocsinh.get(i).Tinhtien();
               }
           }
           System.out.println(tong);
    }
       public void sapxep(){
           System.out.println("=================================================");
           System.out.println("Sap xep sanh sach tang dan theo tien an ban tru:\n");
           Collections.sort(hocsinh, new Tinhtien());
           for (int i = 0; i < hocsinh.size(); ++i)
           hocsinh.get(i).hien();
    }
      public void xuatbuoiantren20(){
          System.out.println("==================================================");
          System.out.println("Danh sach cac hoc sinh co so buoi an tren 20 la :\n");
          for (int i = 0; i < hocsinh.size(); ++i) {
          if(hocsinh.get(i).getBuoi()>20)
              hocsinh.get(i).hien();
          }
      }
} 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     /*ArrayList<HocSinh> listHocSinh  =  new ArrayList();
     public danhsach(){
         
     }
     
     public void Nhap(){
         Scanner input = new Scanner(System.in);
         System.out.println("Nhap so hoc sinh: ");
         int n = input.nextInt();
         System.out.println("Nhap thong tin hoc sinh: ");
         for(int i=0; i<n; i++){
             HocSinh hocsinh = new HocSinh();
             System.out.println("Nhap hoc sinh thu: " +(i+1));
             hocsinh.nhap();
             listHocSinh.add(hocsinh);
         }
     }
     
     public void HienDanhSach(){
        System.out.println("============================");
        System.out.println("In danh sach hoc sinh:  ");
         for(HocSinh hs : listHocSinh){
            hs.Hien();
         }
     }
     
     public void tong(){
         float tongtien = 0;
         for(HocSinh hocsinh: listHocSinh){
             tongtien = tongtien + hocsinh.tinhtien();
         }
     System.out.println("Tong tien ban tru cua hoc sinh: " + tongtien);
     }    
     
     public void Sapxep(){
         Collections.sort(listHocSinh, new Tinhtien());
         System.out.println("Sap xep theo danh sach tang dan tien ban tru: ");
         
        
     }
     
     public void Hienhocsinhantren20(){
          for (HocSinh hs : listHocSinh) {
                   if(hs.getBuoi()>20){
                      // System.out.println(listHocSinh);
               }
         }
     }*/

   
    

    

