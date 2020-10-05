package Bai13;
    
    import java.util.Scanner;
    

    public class ChuyenVien extends CanBo implements Nguoi{
    public String tenPhongBan;
    public double luongtangthem;

    public ChuyenVien() {
        super();
    }

    public ChuyenVien(String tenPhongBan, double luongtangthem) {
        this.tenPhongBan = tenPhongBan;
        this.luongtangthem = luongtangthem;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma chuyen vien: ");
        maCB = sc.nextLine();
        System.out.println("Nhap ho ten:  ");
        hoten = sc.nextLine();
        System.out.println("Nhap ten phong ban: ");
        tenPhongBan = sc.nextLine();
        System.out.println("Nhap he so luong: ");
        hsl = sc.nextFloat();
        System.out.println("Nhap tien luong tang them: ");
        luongtangthem = sc.nextDouble();
    }

    @Override
    public void hien() {
        System.out.println("Ma CB: " + maCB);
        System.out.println("Ho ten: " + hoten);
        System.out.println("Ten Phong Ban: " + tenPhongBan);
        System.out.println("He so luong: " + hsl);
        System.out.println("Luong tang them: " + luongtangthem);
    }

    @Override
    public double tienluong(){
        double luong = hsl * 1350000 + luongtangthem;
        return luong;
    }

    @Override
    public String toString() {
        return "ChuyenVien{" + "tenPhongBan=" + tenPhongBan + ", luongtangthem=" + luongtangthem + '}';
    }
    
    
}
