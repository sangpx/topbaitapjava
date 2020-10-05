package Bai11;

import Bai11.Person;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Customer extends Person {
    private String tencongty;
    private float trihoadon;

    public Customer() {
        super();
    }

    public Customer(String hoten, String diachi, String tencongty, float trihoadon) {
        super(hoten, diachi);
        this.tencongty = tencongty;
        this.trihoadon = trihoadon;
    }

    public String getTencongty() {
        return tencongty;
    }

    public void setTencongty(String tencongty) {
        this.tencongty = tencongty;
    }

    public float getTrihoadon() {
        return trihoadon;
    }

    public void setTrihoadon(float trihoadon) {
        this.trihoadon = trihoadon;
    }
    
    public void nhapcustomer(){
        Scanner sc = new Scanner(System.in);
        super.nhapperson();
        System.out.println("Nhap ten cong ty: ");
        tencongty = sc.nextLine();
        System.out.println("Nhap tri hoa don: ");
        trihoadon = sc.nextFloat();   
    }
    
    public void hiencustomer(){
        super.hienperson();
        System.out.println("Ten cong ty: " + tencongty);
        System.out.println("Tri hoa don: " + trihoadon);
    }

    @Override
    public String toString() {
        return "Customer: " + super.toString() +  " tencongty= " + tencongty + "  trihoadon= " + trihoadon;
    }   
    
}
