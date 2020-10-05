/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11;

/**
 *
 * @author ASUS
 */
public class Test {
    public static void  Menu(){
        System.out.println("Quan ly Nguoi: ");
        System.out.println("1. Nhap danh sach cac SV, CN, KH");
        System.out.println("2. Xoa 1 nguoi bat ki: ");
        System.out.println("3. Tinh tong l");
    }
}
/*
import java.util.Scanner;
s
public class Main {
    public static void main(String[] args){
        Danhsach list= new Danhsach();
    int n;
    int chon;
    do
    {
    System.out.println("\n-------MENU--------");
    System.out.println("1.Nhập  danh sách các SV , NV , KH");
    System.out.println("2.Xóa 1 người bất kỳ ");
    System.out.println("3.Xuất danh sách ");
    System.out.println("4.Tính tổng lương của nhân viên");
    System.out.println("5.Sắp xếp danh sách theo họ tên ");
    System.out.println("6.Xuất danh sach hoc sinh có dtb >8");
    System.out.println("7.Xuất danh sách customer có tiền nộp >10tr");
    System.out.println("0.Thoát ");
    Scanner sc= new Scanner(System.in);
    System.out.print("Lua chon cua ban: ");
    chon= sc.nextInt();
    switch(chon)
    {    case 1:
        {
        System.out.print("So luong can  nhap: ");
        n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.nhapPerson();
            
        }
        break;
        }
        case 2: 
        {
               list.xoaPerson();
               break;
        }
        case 3:
        {
            System.out.print("Danh sach vua nhap: \n");
                list.xuatPerson();
                 break;
        }
        case 4:
        {
           list.tinhTongLuong();
             break;
        }
        case 6:
        {
            list.xuatDTB8();
            break;
        }
        case 5:
                {
                    list.sapxepHoten();
                    break;
                }
        case 7:
        {
            list.xuatKH10tr();
            break;
        }
    }
    }
    while(chon!=0);
}
    }

*/
