/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author ASUS
 */
public class DanhSach {
    ArrayList<Person> listPer = new ArrayList();
    
    public DanhSach(){
    }
    public void nhapds(){
        Scanner input = new Scanner(System.in);
        System.out.println("Doi tuong can them: ");
        System.out.println("1. Student");
        System.out.println("2. Employee");
        System.out.println("3. Customer");
        System.out.println("Nhap de lua chon: ");
        int chon = input.nextInt();
        switch(chon){
            case 1:   Student a = new Student();
                      a.nhapstudent();
                      listPer.add(a);
                 break;
                 
            case 2:   Employee b = new Employee();
                      b.nhapemlpoyee();
                      listPer.add(b);
                  break;
                 
            case 3:   Customer c = new Customer();
                      c.nhapcustomer();
                      listPer.add(c);
                  break;
                  
            default: break;
        }
    }
    
    public void hiends(){
        for(Person per : listPer){
            per.hienperson();
        }
    }
    
    public boolean ThemNguoi(Person nguoi){
        return listPer.add(nguoi);
    }
    
    public boolean XoaNguoi(Person ten){
        boolean kq = false;
        for(Person per : listPer){
            if(per.getHoten().equals(ten)){
               kq =  listPer.remove(per);
            }
            if(listPer.isEmpty())
                break;
        }
        return kq;
    }
    
    public void SapXep(){
        Collections.sort(listPer, new Comparator <Person>(){
         @Override
            public int compare (Person per1, Person per2){
                return per1.getHoten().compareTo(per2.getHoten());
            }
        });
        System.out.println("Danh sach theo thu tu ho ten: ");
        for(Person per : listPer){
           per.hienperson();
        }
    }  
}
    

