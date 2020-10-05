package quanlynganhang;
import java.util.Scanner;


    public class Main{
        public static void Menu(){
            System.out.println("Quan ly tai khoan ngan hang: ");
            System.out.println("1. Nhap tai khoan: (tai khoan thong thuong - tai khoan tiet kiem");
            System.out.println("2. Xoa tai khoan: ");
            System.out.println("3. Hien danh sach tai khoan: ");
            System.out.println("4. Tinh tong so du: ");
            System.out.println("5. Tinh lai cac tai khoan tiet kiem: ");
            System.out.println("6. Ket thuc chuong trinh!!!");   
        }
        
        public static void main(String[] args) {
          Bank bank = new Bank();
          int chon;
          do{
              Menu();
              System.out.println("Chon tu 1-6 de thuc hien chuong trinh: ");
              chon = new Scanner(System.in).nextInt();
              switch(chon){
                case 1: 
                      int nhap;
                      System.out.println("Hay chon loai tai khoan: ");
                      System.out.println("1. tai khoan thuong: ");
                      System.out.println("2. tai khoan tiet kiem: ");
                        nhap = new Scanner(System.in).nextInt();
                          Account account = null;
                            switch(nhap){
                                case 1: // truong hop tai khoan thuong
                                 account = new Account();
                                 account.nhap();
                                   break;
                                case 2: //truong hop tai khoan tiet kiem
                                 account = new SavingAccount();
                                 account.nhap();
                                   break;
                                default: 
                                   break;
                                }
                      if(bank.themAccount(account)){
                          System.out.println("Them tai khoan thanh cong!!!");
                      }else {
                          System.out.println("Them tai khoan that bai!!!");
                      }
                     break;
                case 2: 
                    System.out.println("Nhap ten tai khoan can xoa: ");
                   String  tenchutk = new Scanner(System.in).nextLine();
                   if(bank.xoaAccount(tenchutk)){
                       System.out.println("Xoa tai khoan" + tenchutk + "Thanh cong");
                   } else {
                       System.out.println("Khong ton tai" + tenchutk + "trong he thong");
                   }
                   
                case 3: bank.hien();
                    break;
                
                case 4: 
                    System.out.println("Tong so du: " + bank.tongsodu());
                    break;
                    
                case 5: 
                    // Tinh lai suat
                    System.out.println("Tinh tien lai cho cac tai khoan tiet kiem: ");
                    for(Account acc : bank.listAccount){
                        if(acc instanceof SavingAccount){
                            // true: neu acc la doi tuong cua lop SavingAccount
                            // false: neu acc ko la doi tuong cua lop SavingAccount
                            //thuc hien tinh lai suat >>> hien thi kqua
                            ((SavingAccount) acc).tinhlai();
                            // hien thi lai thong tin cua tai khoan
                            System.out.println("" + acc.toString());
                        }
                    }
                    break;
                    
                case 6: System.exit(0);
                
                default: 
                    break;
              }
              System.out.println("Tiep tuc chuong trinh ko ? 0- de ket thuc chuong trinh!!!");
              chon = new Scanner(System.in).nextInt();
          }while(chon!=0);
    }
    }