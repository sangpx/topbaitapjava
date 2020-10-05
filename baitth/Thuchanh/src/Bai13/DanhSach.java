/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class DanhSach {
    ArrayList<Nguoi> listNguoi = new ArrayList();
    
    public DanhSach(){
    }
    
    public void nhapds(){
        Scanner input = new Scanner(System.in);
        System.out.println("Doi tuong can them: ");
        System.out.println("1. Chuyen vien");
        System.out.println("2. Giang Vien");
        System.out.println("3. Quan ly");
        System.out.println("Nhap de lua chon: ");
        int chon = input.nextInt();
        switch (chon){
            case 1: 
                ChuyenVien a = new ChuyenVien();
                a.nhap();
                listNguoi.add(a);
                break;
            case 2: 
                GiangVien b = new GiangVien();
                b.nhap();
                listNguoi.add(b);
                break;
            case 3: 
                QuanLy c = new QuanLy();
                c.nhap();
                listNguoi.add(c);
                break;
            default: 
                 break;
        }
    }
  
   public void hiends(){
      for(Nguoi ng : listNguoi){
          ng.hien();
        } 
    }
}


















/*      int n, k;
        System.out.println("Nhap so can bo: ");
        n = input.nextInt();
        for(int i =0; i<n; i++){
            System.out.println("Nhap can bo: (1- CV, 2- GV, 3- QL)");
            k = input.nextInt();
            if(k == 1 ){
                ChuyenVien a = new ChuyenVien();
                a.nhap();
                listNguoi.add(a);
            }   
            else if( k ==2 ){
                GiangVien a = new GiangVien();
                a.nhap();
                listNguoi.add(a);
            }
            
            else if( k == 3){
                QuanLy a = new QuanLy();
                a.nhap();
                listNguoi.add(a);
                
            }
            
            else i--;   
        }*/
