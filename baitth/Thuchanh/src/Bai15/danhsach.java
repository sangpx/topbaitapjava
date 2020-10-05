/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author ASUS
 */
public class danhsach {
    ArrayList<HocSinh> listHS = new ArrayList();

    public danhsach() {
    }
    
    public void nhapds(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin hoc sinh: ");
        System.out.println("Nhap so hoc sinh: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            HocSinh hocsinh = new HocSinh();
            System.out.println("\tNhap hoc sinh thu: " + (i+1));
            hocsinh.nhaphocsinh();
            listHS.add(hocsinh);
        }
    }
    
    public void hiends(){
        for(HocSinh hs : listHS){
            System.out.println("" + hs.toString());
        }
    }
    
    public void namX(){
       Scanner in = new Scanner(System.in);
       System.out.println("Nhap nam sinh: ");
       int namsinhX = in.nextInt();
        System.out.println("Danh sach hoc sinh sinh nam: ");
        for(int i=0; i<listHS.size(); i++){
            if(listHS.get(i).getNamsinh() == namsinhX ){
                System.out.println("Ho ten hoc sinh: " + this.listHS.get(i).getHoten());
                System.out.println("" + this.listHS.get(i).toString());
            }
        }
    }
    
      public void luuFile(){
        File myfile = new File("file.txt");
        try{
            FileOutputStream out = new FileOutputStream("file.txt");
            ObjectOutputStream ojOut = new ObjectOutputStream(out);
            ojOut.flush();
            ojOut.writeObject(listHS);
            ojOut.close();
            out.close();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        
        catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Luu file thanh cong!!!");
    }
    
    public void docFile(){
        try{
            listHS = new ArrayList<HocSinh>();
            FileInputStream in = new FileInputStream("file.txt");
            ObjectInputStream out = new ObjectInputStream(in);
            listHS = (ArrayList)out.readObject();
             for(HocSinh hs : listHS){
                hs.hienhocsinh();
            }
            in.close();
            out.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Khong co File trong he thong!!!");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }



 
}

  
    

















































































  

















/*public void luufile(){
       File myfile = new File("file.txt");
       try{
           FileWriter fw = new FileWriter(myfile);
           PrintWriter pw = new PrintWriter(pw);
         
       }
       catch (IOException e){
           e.printStackTrace();
       }
       
   }*/