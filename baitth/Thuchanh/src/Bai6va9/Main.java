/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6va9;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        DanhSach danhsach = new DanhSach();
        danhsach.nhap();
        System.out.println("==============================");
        System.out.println("In danh sach cong nhan: ");
        danhsach.Hien();
   //     danhsach.xuatluong();
        danhsach.tongtienchenhlech();
   }
}
