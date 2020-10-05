package quanlynganhang;
import java.util.Scanner;

    public class SavingAccount extends Account {
   // dinh nghia cac thuoc tinh moi cua lp SavingAccount
    private double laisuat;
    
    
    // xay dung cac phuong thuc khoi tao
   public SavingAccount(){
       
   }  
   public SavingAccount(String tenchutk, double sodu, double laisuat){
       super(tenchutk, sodu);      // goi phuong thuc khoi tao co tham so cua lp cha(Account)
  // sau do moi thuc hien khoi tao cho lp con(SavingAccount)
       this.laisuat = laisuat;
   }

    public double getLaisuat() {
        return laisuat;
    }
    
    public void setLaisuat(double laisuat) {
        this.laisuat = laisuat;
    }
   
    
    
    public void tinhlai(){
         // tinh lai trong 1 nam = 12 thang
         double tienlai = laisuat * getSodu() * 12;
         setSodu(tienlai+getSodu());    // thuc hien cong vao so du ban dau
     }

    /**
     *
     */
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap lai lai suat: ");
        laisuat = new Scanner(System.in).nextDouble();
    }
    
    
    @Override
    public String toString() {
        return "SavingAccount{" + super.toString() + "laisuat=" + laisuat + '}';
    }
}
