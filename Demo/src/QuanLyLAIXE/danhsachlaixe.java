package QuanLyLAIXE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class danhsachlaixe {
     public static final String fname = "LaiXe.Dat";
     ArrayList<LaiXe> listlaixe;
     
        public danhsachlaixe(){
            listlaixe = new ArrayList<>();
        }
        
        public void nhapdslx(){
                Scanner input = new Scanner(System.in);
                System.out.println("Nhap so luong lai xe: ");
                int n = input.nextInt();
                System.out.println("===== Thong tin lai xe: =====");
                for(int i = 0; i < n; i++){
                    LaiXe lx = new LaiXe();
                    System.out.println("Nhap ma lai xe: ");
                    lx.setMaLX(input.nextLine());
                    System.out.println("Nhap ho ten: ");
                    lx.setHoten(input.nextLine());
                    System.out.println("Nhap dia chi: ");
                    lx.setDiachi(input.nextLine());
                    System.out.println("Nhap trinh do: ");
                    lx.setTrinhdo(input.nextLine());
                    listlaixe.add(lx);
                }
        }
        
        public void Ghidslx() throws IOException{
            GhiDocFile<LaiXe> dg = new GhiDocFile<>();
            dg.writefile(listlaixe, fname);                                     // ghi ra danhsach doi tuong
        }
        
        public ArrayList<LaiXe> Docdslaixe() throws IOException, FileNotFoundException, ClassNotFoundException{
            ArrayList<LaiXe> kq = new ArrayList<>();                            // doc du lieu tu file va hien danh sach
            GhiDocFile<LaiXe> dg = new GhiDocFile <>();
            kq = dg.readFile(fname);
                return kq;
        }
        
        public void hiendslx() throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<LaiXe> ds =  Docdslaixe();
            for (LaiXe d : ds) {
                System.out.println(" " + d.toString());
            }
        }
        
        public LaiXe searchbyMa(String malx) throws IOException, FileNotFoundException, ClassNotFoundException{
            ArrayList<LaiXe> ds = Docdslaixe();                                 // doc du lieu tu file va tim theo danh sach da co
            LaiXe lx = new LaiXe();
            for (LaiXe d : ds) {
                if(d.getMaLX().equalsIgnoreCase(malx)){
                    return d;
                }
            }
            return null;
        }
}

