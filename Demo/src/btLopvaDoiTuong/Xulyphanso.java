package btLopvaDoiTuong;
public class Xulyphanso{
    //khai bao cac thuoc tinh cua lop
    Phanso phanSoA;
    Phanso phanSoB;
    public Xulyphanso(){
        phanSoA = new Phanso();
        phanSoB = new Phanso();
    }
    
    public Xulyphanso(Phanso ps1, Phanso ps2){
        this.phanSoA =ps1;
        this.phanSoB = ps2;
    }
    
    
     public Phanso cong2PhanSo(){
        int tu = phanSoA.getTuSo() * phanSoB.getMauSo() + phanSoA.getMauSo()*phanSoB.getTuSo();
        int mau = phanSoA.getMauSo() * phanSoB.getMauSo();
        Phanso tongPhanSo = new Phanso(tu, mau);
        //toi gian phan so sau khi thuc hien cong
        tongPhanSo.toiGian();
        //tra ve ket qua
        return tongPhanSo;
    }
     
      public Phanso tru2PhanSo(){
     
        int tu = phanSoA.getTuSo() * phanSoB.getMauSo() - phanSoA.getMauSo()*phanSoB.getTuSo();
        int mau = phanSoA.getMauSo() * phanSoB.getMauSo();
        Phanso hieuPhanSo = new Phanso(tu, mau);
        //toi gian phan so sau khi thuc hien cong
        hieuPhanSo.toiGian();
        //tra ve ket qua
        return hieuPhanSo;
    }
   
    public Phanso nhan2PhanSo(){
        int tu = phanSoA.getTuSo() * phanSoB.getTuSo();
        int mau = phanSoA.getMauSo() * phanSoB.getMauSo();
        Phanso tichPhanSo = new Phanso(tu, mau);
        tichPhanSo.toiGian();
        return tichPhanSo;
    }
    
    public Phanso chia2PhanSo(){
        int tu = phanSoA.getTuSo() * phanSoB.getMauSo();
        int mau = phanSoA.getMauSo() * phanSoB.getTuSo();
        Phanso thuongPhanSo = new Phanso(tu, mau);
        thuongPhanSo.toiGian();
        return thuongPhanSo;
    }
}
