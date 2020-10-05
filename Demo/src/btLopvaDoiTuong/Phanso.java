package btLopvaDoiTuong;
import java.util.Scanner;
public class Phanso {
    //dinh nghia cac thanh phan du lieu
    //cac thuoc tinh private
    
    private int tuSo;
    private int mauSo;
    
    //cac phuong thuc khoi tao
    public Phanso(){
        //khoi tao cac gia tri mac dinh cho thuoc tinh
        tuSo =0;
        mauSo=1;
    }
    
    public Phanso(int tuSo, int mauSo){
        //khoi tao cac gia tri duoc truyen tu ben ngoai vao cho thuoc tinh
        //su dung tu khoa this de phan biet dau la thanh phan cua lop
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    //xay dung cac phuong thuc get/set de truy xuat cac thanh phan private
    //get: la phuong thuc lay ra gia tri cua thanh phan thuoc tinh
    //set: la phuong thuc gán gia tri cho thanh phan thuoc tinh
    public int getTuSo(){
        return tuSo;
    }
    public void setTuSo(int tuSo){
        this.tuSo = tuSo;
    }
    
    public int getMauSo(){
        return mauSo;
    }
    public void setMauSo(int mauSo){
        this.mauSo = mauSo;
    }
    
    //phuong thuc nhap thong tin
    public void nhapPhanSo(){
        //su dung doi tuong cua lop Scanner de thuc hien nhap gia tri vao tu ban phim
        System.out.println("Nhap tu so: ");
        tuSo = new Scanner(System.in).nextInt();
        System.out.println("Nhap mau so: ");
        mauSo = new Scanner(System.in).nextInt();
    }
    
    //phuong thuc hien thong tin
    @Override
    public String toString() {
        return "PhanSo{" + "tuSo=" + tuSo + ", mauSo=" + mauSo + '}';
    }
    
     //xay dung cac phuong thuc xu ly tren phan so
    public int ucln(int soA, int soB){
        while(soA!=soB){
            if(soA>soB)
                soA=soA-soB;
            else
                soB = soB- soA;
        }
        return soA;
    }
    //toi gian phan so
    public void toiGian(){
        //tim ra ucln cua tuSo va mau so cua phan so dang toi gian
        int uoc = ucln(tuSo,mauSo);
        //thuc hien toi gian
        tuSo = tuSo/uoc;
        mauSo = mauSo/uoc;
    }
}