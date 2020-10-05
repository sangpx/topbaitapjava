/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        danhsachtulanh ds = new danhsachtulanh();
        ds.nhapds();
        System.out.println("========================");
        System.out.println("Hien danh sach tu lanh: ");
        ds.hiends();
        ds.lietke();
        ds.tongtien();
        ds.in200();
        ds.sapxep();
    }
}
