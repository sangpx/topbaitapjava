/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author ASUS
 */
public class danhsachtulanh {
    ArrayList<TuLanh> listTL = new ArrayList();
    public danhsachtulanh(){
        
    }
    
    public void nhapds(){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap danh sach tu lanh: ");
        System.out.println("Nhap so luong tu lanh: ");
        n = in.nextInt();
        for(int i=0; i<n; i++){
            TuLanh tulanh = new TuLanh();
            System.out.println("Nhap tu lanh thu: " + (i+1));
            tulanh.nhaptulanh();
            listTL.add(tulanh);
        }
    }
    
    public void hiends(){
        for(TuLanh tl : listTL){
            System.out.println("" + tl.toString());
        }
    }
    
    public void tongtien(){
        float tong = 0;
        for(TuLanh tl : listTL){
            tong = tong + tl.thanhtien();
        }
        System.out.println("\tTong tien cac tu lanh trong ds: " + tong);
    }
    
    public void in200(){
        System.out.println("Danh sach dung tich > 200: ");
        for(TuLanh tl : listTL)
            if(tl.getDungtich() > 200)
                System.out.println("" + tl.toString());
    }
    
    public void lietke(){
        Scanner in = new Scanner(System.in);
        String hangx;
        System.out.println("\tNhap hang san xuat bat ki: ");
        hangx = in.nextLine();
        System.out.println("Liet ke danh sach: ");
        for(TuLanh tl : listTL)
            if(tl.getHangsx().equalsIgnoreCase(hangx))
                System.out.println("" + tl.toString());
    }
    
    public void sapxep(){
        Collections.sort(listTL, new Comparator <TuLanh>(){
            @Override
         public int compare (TuLanh tulanh1, TuLanh tulanh2){
                if(tulanh1.getSoluong() == tulanh2.getSoluong()){
                    return 0;
                } else {
                    return (tulanh2.getSoluong() - tulanh1.getSoluong());
                }
            }
        });
        System.out.println("Danh sach tu lanh theo thu tu giam dan so luong: ");
        for(TuLanh tl : listTL){
            System.out.println("" + tl.toString());
        }
    }
    
    
}
