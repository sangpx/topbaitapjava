/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyLAIXE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * tao class va method generic
 * @author ASUS
 */
public class GhiDocFile <T> {
    // cac phuong thuc de ghi File

    public <T> void writefile(ArrayList<T> listObj, String fname) throws FileNotFoundException, IOException{  // doc ghi 1 ds
        //1. Mo file de thuc hien ghi
        FileOutputStream fout = new FileOutputStream(fname);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        //2. thuc hien ghi danh sach doi tuong vao file
        out.writeObject(listObj);
        //3. dong file
        out.close();
        fout.close();
    }
    
    // thuc hien doc du lieu tu file va tra ket qua ve
    public ArrayList <T>  readFile(String fname) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<T> kq = new ArrayList<>();
         //1. Mo file de doc
         FileInputStream fin = new FileInputStream(fname);
         ObjectInputStream in = new ObjectInputStream(fin); // thuc hien doc doi tuong file
         //2. thuc hien doc file
         kq = (ArrayList<T>)in.readObject();                                    //ep kieu
         //3. dong file
         in.close();
         fin.close();
        return kq;
    }
    
}
