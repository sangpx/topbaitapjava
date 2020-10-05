package quanlynganhang;
import java.util.Scanner;


public class Account{
        private String tenchutk;
        private double sodu;
        
        public Account(){
            
        }

    public Account(String tenchutk, double sodu) {
        this.tenchutk = tenchutk;
        this.sodu = sodu;
    }

    public String getTenchutk() {
        return tenchutk;
    }

    public void setTenchutk(String tenchutk) {
        this.tenchutk = tenchutk;
    }

    public double getSodu() {
        return sodu;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }
    
    
    public void nhap(){
        System.out.println("Nhap ten chu tai khoan: ");
        tenchutk = new Scanner(System.in).nextLine();
        System.out.println("Nhap so du tai khoan: ");
        sodu = new Scanner(System.in).nextDouble();
    }

    @Override
    public String toString() {
        return "Account{" + "tenchutk=" + tenchutk + ", sodu=" + sodu + '}';
    }
    
    
}