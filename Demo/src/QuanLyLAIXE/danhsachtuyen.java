
package QuanLyLAIXE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class danhsachtuyen {
    ArrayList<Tuyen> listTuyen;
    public static final String fname = "Tuyen.Dat";
    
    public danhsachtuyen(){
      listTuyen = new ArrayList<>();
    }
    
    public void nhapdstuyen(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong tuyen: ");
        int k = input.nextInt();
        for (int i = 0; i < k; i++) {
            Tuyen tuyen = new Tuyen();
            System.out.println("Nhap ma tuyen: ");
            tuyen.setMatuyen(input.nextLine());
            System.out.println("Nhap khoang cach: ");
            tuyen.setKhoangcach(input.nextInt());
            System.out.println("Nhap so diem dung: ");
            tuyen.setSodiemdung(input.nextInt());
            listTuyen.add(tuyen);
        }
    }
    
    public void Ghidstuyen() throws IOException{
        GhiDocFile<Tuyen> dg = new GhiDocFile<>();
        dg.writefile(listTuyen, fname);
    }
    
    public ArrayList<Tuyen> Docdstuyen() throws IOException, FileNotFoundException, ClassNotFoundException{
        GhiDocFile<Tuyen> dg = new GhiDocFile<>();
        return  dg.readFile(fname);
    }
    
    public void hiendstuyen() throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<Tuyen> dstuyen = Docdstuyen();
        for (Tuyen tuyen : dstuyen) {
            System.out.println("" + tuyen.toString());
        }
    }
    
    public Tuyen searchbyID(String MATUYEN) throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList <Tuyen> kq = Docdstuyen();
        for (Tuyen t : kq) {
            if(t.getMatuyen().equalsIgnoreCase(MATUYEN)){
                return t;
            }
        }
        return null;
    }
}
