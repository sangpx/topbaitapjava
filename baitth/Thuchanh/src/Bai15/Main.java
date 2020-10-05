/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;
import java.util.Scanner;

public class Main {
    
    public static void Menu(){
        System.out.println("Quan ly Hoc Sinh: ");
        System.out.println("1. Nhap danh sach hoc sinh: ");
        System.out.println("2. Hien danh sach hoc sinh: ");
        System.out.println("3. In danh sach theo nam sinh: ");
        System.out.println("4. Luu danh sach hoc sinh vao File: ");
        System.out.println("5. Doc danh sach hs tu File va in: ");
        System.out.println("6. Exit");
    }
    
    
    public static void main(String[] args) {
        int chon;
        danhsach ds = new danhsach();
        do{
            Menu();
          System.out.println("Nhap de lua chon: ");
          chon = new Scanner(System.in).nextInt();
          switch(chon) {
              case 1: ds.nhapds();
                break;
              
              case 2: ds.hiends();
                break;
              
              case 3: ds.namX();
                break;
              
              case 4: ds.luuFile();
                  break;
                
              case 5: ds.docFile();
                  break;
              case 6: System.exit(0);
              
              default: 
                break;
          }
            System.out.println("Ban co muon tiep tuc ko? - 0 de ket thuc!" );
            chon = new Scanner(System.in).nextInt();
        }while(chon != 0); 
    }
}
