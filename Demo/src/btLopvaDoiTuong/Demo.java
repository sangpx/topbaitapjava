package btLopvaDoiTuong;

import java.util.Scanner;

public class Demo {

    public static void menu() {
        System.out.println("Cac phep toan tren phan so ");
        System.out.println("1. Nhap 2 phan so ");
        System.out.println("2. Tinh tong 2 phan so ");
        System.out.println("3. Hieu 2 phan so ");
        System.out.println("4. Nhan 2 phan so ");
        System.out.println("5. Thuong 2 phan so ");
        System.out.println("6. Ket thuc");
    }

    public static void main(String[] args) {
        Xulyphanso xlps = new Xulyphanso();
        int chon;
        do {
            menu();
            System.out.println("Hay chon tu 1-6 de thuc hien: ");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                    //thuc hien nhap phan so a va phan so b
                    
                    Phanso ps = new Phanso();
                    System.out.println(" Nhap phan so A: ");
                    ps.nhapPhanSo(); //gan phan so vua nhap cho phan so A
                    xlps.phanSoA = ps;
                    //khoi tao lai doi tuong ps
                    ps = new Phanso();
                    System.out.println(" Nhap phan so B: ");
                    ps.nhapPhanSo();
                    //gan phan so vua nhap cho phan so B
                    xlps.phanSoB = ps;
                    break;
                case 2:
                    Phanso tong = xlps.cong2PhanSo();
                    System.out.println("Tong cua " + xlps.phanSoA.toString()
                            + " va " + xlps.phanSoB + " = " + tong.toString());
                    break;
                
                 case 3:
                    Phanso hieu = xlps.tru2PhanSo();
                    System.out.println("Hieu cua " + xlps.phanSoA.toString()
                            + " va " + xlps.phanSoB + " = " + hieu.toString());
                    break;    
                    
                case 4:
                    //nhap 2 phan so
                    Phanso tich = xlps.nhan2PhanSo();
                    System.out.println("Tich cua " + xlps.phanSoA.toString()
                             + " va " + xlps.phanSoB + " = " + tich.toString());
                    break;
                case 5:
                    //chia 2 phan so
                    Phanso thuong = xlps.chia2PhanSo();
                    System.out.println("Thuong cua " + xlps.phanSoA.toString()
                            + " va " + xlps.phanSoB + " = " + thuong.toString());
                    break;
                case 6:
                    System.exit(0);
                default:
                    break;
            }
            System.out.println("Ban muon tiep tuc k? 0- ket thuc ");
            chon = new Scanner(System.in).nextInt();
        } while (chon != 0);
    }
}
