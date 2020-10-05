/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyCat;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void Menu(){
        System.out.println("Quan ly meo: ");
        System.out.println("0. Nhap danh sach ma mau: ");
        System.out.println("1. Nhap ds meo: ");
        System.out.println("2. Hien ds meo: ");
        System.out.println("3. Sap xep danh sach theo mau: ");
        System.out.println("4. Tim kiem thong tin theo loai: ");
        System.out.println("5. Exit");
    }
    
    public static void main(String[] args) {
        int chon;
        managerCat ds = new managerCat();
        Scanner input = new Scanner(System.in);
        do{
            Menu();
            chon = input.nextInt();
            switch(chon){
                case 0: 
                    
                    break;
                case 1: 
                    ds.nhapds();
                    break;
                case 2: 
                    ds.hiends();
                    break;
                case 3: 
                    ds.Sapxep();
                    break;
                case 4: 
                    ds.timkiem();
                    break;
                case 5: System.exit(0);
                    break;
                default: break;
            }
            System.out.println("Ban co muon tiep tuc ko?? - 9 de ket thuc!!!");
            chon = input.nextInt();
        }while(chon!=9);
    }
}
