/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyCat;
import Catexam.CatDetail;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ASUS
 */
public class managerCat {
    ArrayList<CatDetail> ListCat = new ArrayList<>();
    
    public managerCat(){
        
    }
    
    public void nhapds(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong meo: ");
        int n = input.nextInt();
        System.out.println("Nhap thong tin meo: ");
        for(int i=0; i<n; i++){
            CatDetail catdetail = new CatDetail();
            System.out.println("Nhap meo thu: " + (i+1));
            catdetail.nhap();
            ListCat.add(catdetail);
        }
    }
    
    public void hiends(){
        System.out.println("================================");
        System.out.println("Hien danh sach meo: ");
        for(CatDetail Cat : ListCat){
            Cat.hien();
        }
    }
    
    public void Sapxep(){
        System.out.println("================================");
        System.out.println("Sap xep theo thu tu ten loai: ");
        Collections.sort(ListCat, new Comparator<CatDetail>(){
            @Override
            public int compare(CatDetail c1, CatDetail c2){
                return c1.getMau().compareToIgnoreCase(c2.getMau());   
            }
        });
        for(CatDetail cat : ListCat){
            System.out.println("" + cat.toString());
        }
    }
    
    public void timkiem(){
        String mauX;
        Scanner input = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Tim kiem mau: ");
        mauX = input.nextLine();
        for(CatDetail cat : ListCat){
            if(cat.getMau().equalsIgnoreCase(mauX)){
                System.out.println("" + cat.toString());
        }
      }
    }
}
