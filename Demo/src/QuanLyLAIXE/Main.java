/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyLAIXE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void Menu(){
        System.out.println("======== Quan ly phan cong lai xe ========");
        System.out.println("||     1. Nhap thong tin lai xe:        ||");
        System.out.println("||     2. Ghi thong tin lai  xe:        ||");
        System.out.println("||     3. Hien danh sach lai xe:        ||");
        System.out.println("||     4. Nhap thong tin tuyen:         ||");
        System.out.println("||     5. Ghi thong tin tuyen:          ||");
        System.out.println("||     6. Hien danh sach tuyen:         ||");
        System.out.println("||     7. Nhap phan cong:               ||");
        System.out.println("||     8. Ghi phan cong:                ||");
        System.out.println("||     9. Hien danh sach phan cong      ||");
        System.out.println("||     10. Exit                         ||");
        System.out.println("==========================================");
    }
    
    
    public static void main(String[] args) throws IOException,
            FileNotFoundException, ClassNotFoundException {
                    int chon;
        danhsachphancong dspc = new danhsachphancong();
        danhsachlaixe dslx = new danhsachlaixe();
        danhsachtuyen dst = new danhsachtuyen();
        do{
            Menu();
            System.out.println("Chon tu 1 -> 10");
            Scanner input = new Scanner(System.in);
            chon = input.nextInt();
            switch(chon){
                case 1: 
                    dslx.nhapdslx();
                    break;
                case 2: 
                    dslx.Ghidslx();
                    break;
                case 3: 
                    dslx.hiendslx();
                    break;
                case 4: 
                    dst.nhapdstuyen();
                    break;
                case 5: 
                    dst.Ghidstuyen();
                    break;
                case 6: 
                    dst.hiendstuyen();
                    break;
                case 7: 
                    dspc.nhapdsphancong();
                    break;
                case 8: 
                    dspc.Ghidsphancong();
                    break;
                case 9: 
                    dspc.Docdsphancong();
                    break;
                case 10: System.exit(0);
                    break;
                default: 
                    break;
            }
            System.out.println("Ban co muon tiep tuc ko??? - 0 de dung");
            chon = input.nextInt();
        }while(chon!=0);
    }
}

                                    // video có những lưu ý và edit ở 53p và 1h17p và 1h20p