/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author ASUS
 */
public class danhsachhs {
    ArrayList<HocSinh> listHS = new ArrayList();
    
    public danhsachhs(){
    }
    
    public void nhapds(){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap thong tin hoc sinh: ");
        System.out.println("Nhap so hoc sinh: ");
        n = in.nextInt();
        for(int i=0; i<n; i++){
            HocSinh hs = new HocSinh();
            System.out.println("Nhap hoc sinh thu: " + (i+1));
            hs.nhaphs();
            listHS.add(hs);
        }
    }
    
    public void hiends(){
        for(HocSinh hocsinh : listHS){
            System.out.println("" + hocsinh.toString());
        }
    }
    
    public void sapxep(){
        Collections.sort(listHS, new Comparator<HocSinh>(){
            @Override
            public int compare (HocSinh hs1, HocSinh hs2){
                return hs1.getTenlop().compareTo(hs2.getTenlop());
            }
        });
        System.out.println("Danh sach hoc sinh duoc Sap Xep theo lop: ");
        for(HocSinh hs : listHS){
            System.out.println("" + hs.toString());
        }
    }
}

