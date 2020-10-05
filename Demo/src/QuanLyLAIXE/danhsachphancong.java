
package QuanLyLAIXE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class danhsachphancong {
    ArrayList<PhanCong> listPC;
    public static final String fname = "PhanCong.Dat";
    
    public danhsachphancong(){
    listPC = new ArrayList<>();
}
    
    public void nhapdsphancong() throws IOException, FileNotFoundException, ClassNotFoundException{
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong phan cong: ");
        int j = input.nextInt();
        for (int i = 0; i < j; i++) {
            PhanCong pc = new PhanCong();
            pc.nhapphancong();
            listPC.add(pc);
        }
    }
    
     public void Ghidsphancong() throws IOException{
        GhiDocFile<PhanCong> dg = new GhiDocFile<>();
        dg.writefile(listPC, fname);
    }
     
     public void Docdsphancong() throws IOException, FileNotFoundException, ClassNotFoundException{
         GhiDocFile<PhanCong> dg = new GhiDocFile<>();
         ArrayList<PhanCong> ds = dg.readFile(fname);
         if(ds.size() >0){
            for (PhanCong pc : ds) {                       
               pc.hienphancong();                             
             }
         }
     }
}
