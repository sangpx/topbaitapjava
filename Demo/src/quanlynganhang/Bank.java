package quanlynganhang;
import java.util.ArrayList;


// sử dụng ArryList để làm bt quản lý dạng danh sách  

    public class Bank{
        ArrayList<Account> listAccount;  // khoi tao 1 danh sach Account
        
        // viet phuong thuc khoi tao
        public Bank(){
            listAccount = new ArrayList<>(); // khoi tao danh sach tai khoan
        }
        
        // xay dung phuong thuc them va xoa Account
        
        public boolean themAccount(Account acc){
         return listAccount.add(acc);
        }
        
        public boolean xoaAccount(String tenchutk){
            // xoa tk co ten, co chu tai khoan dc truyen vao
            boolean  kq = false;
            for(Account account : listAccount){
                if(account.getTenchutk().equals(tenchutk)){
                    // tim thay chu tai khoan can xoa
                    // thuc hien xoa
                     kq = listAccount.remove(account);
                }
                // neu nhu danh sach chi con duy nhat 1 tai khoan >> xoa tk do >> danh sach rong
                if(listAccount.isEmpty())
                    break;
            }
           return kq;
        }
        
        // xay dung phuong thuc de hien thong tin tai khoan

            
           public void hien(){
                System.out.println("In danh sach tai khoan Ngan Hang: ");
                for(Account account : listAccount){
                    System.out.println("" + account.toString()); // in thong tin tai khoan ra
                }
            
            }
            
         public double tongsodu(){
             double tong = 0;
             for(Account account : listAccount){
                 tong +=account.getSodu();
             }
             return tong;
         }
         
         
                
  }
        
   
