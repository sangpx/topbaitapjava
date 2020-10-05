package QuanLyLAIXE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// mỗi 1 lái xe có thể đc phân công 1 hoặc nhiều tuyến xe 

public class PhanCong {
    LaiXe laixe;
    ArrayList<Tuyen> tuyenPhanCong ;

    
    public PhanCong(){
        laixe = new LaiXe();
        tuyenPhanCong = new ArrayList<>();
    }
    
    public void nhapphancong() throws IOException, FileNotFoundException, ClassNotFoundException{
        System.out.println("**** Nhap thong tin lai xe can phan cong: ****");
        System.out.println("Nhap ma lai xe: ");
        String malx = new Scanner(System.in).nextLine();
        
        danhsachtuyen dstuyen = new danhsachtuyen();  
        danhsachlaixe dslx = new danhsachlaixe();
        laixe = dslx.searchbyMa(malx);
        if(laixe == null){
            System.out.println("Khong ton tai!!!");
        } else {
            String MaTuyen; 
            do{
                 System.out.println("Chon tuyen can phan cong: ");
                  MaTuyen = new Scanner(System.in).nextLine();
                  Tuyen tuyen = dstuyen.searchbyID(MaTuyen);
                  if(tuyen != null){
                      tuyenPhanCong .add(tuyen);                                
                  } else {
                      System.out.println("Doi tuong ko co trong CSDL !!!");
                  }
            }while(! MaTuyen.equalsIgnoreCase("*"));
        }
    }

    public void hienphancong(){
        System.out.println(laixe.toString());
        System.out.println("Danh sach Tuyen dc Phan Cong: ");
        for (Tuyen tuyen : tuyenPhanCong) {
            System.out.println("" + tuyen.toString());
        }
    }
}
