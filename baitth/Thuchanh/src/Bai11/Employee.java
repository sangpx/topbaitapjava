/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Employee extends Person {
    private float hsl;
    public static final float lcb = 1150;

    public Employee() {
        super();
        
    }

    public Employee(String hoten, String diachi, float hsl) {
        super(hoten, diachi);
        this.hsl = hsl;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }
    
    
    public void nhapemlpoyee(){
        Scanner em = new Scanner(System.in);
        super.nhapperson();
        System.out.println("Nhap he so luong: ");
        hsl = em.nextFloat();
    }
    public void hienemployee(){
        super.hienperson();
        System.out.println("He so luong: " + hsl);
    }
    
    public float tinhluong(){
        return hsl * lcb;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() +  " hsl= " + hsl + "tinh Luong= " + tinhluong();
    }
    
    
    
    
    
    
}
