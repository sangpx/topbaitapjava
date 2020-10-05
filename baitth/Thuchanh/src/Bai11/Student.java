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
public class Student extends Person{
    private double diem1;
    private double diem2;
    
    public Student(){
        super();
    }

    public Student(String hoten, String diachi, double diem1, double diem2) {
        super(hoten, diachi);
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }
    
    public void nhapstudent(){
        Scanner in = new Scanner(System.in);
        super.nhapperson();
        System.out.println("Nhap diem mon 1: ");
        diem1 = in.nextDouble();
        System.out.println("Nhap diem mon 2: ");
        diem2 = in.nextDouble();
    }
    
    public void hienstudent(){
        super.hienperson();
        System.out.println("Diem mon 1: "+ diem1);
        System.out.println("Diem mon 2: " + diem2);
    }
    
    
    public double diemTB(){
        return (diem1+diem2)/2;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + " diem1= " + diem1 + " diem2= " + diem2;
    }
    
    
}
