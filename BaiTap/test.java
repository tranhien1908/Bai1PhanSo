package BaiTap;

public class test {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("Nhap phan so 1:");
        ps1.nhap();
        System.out.println("Nhap phan so 2:");
        ps2.nhap();

        PhanSo sum = ps1.cong(ps2);
        PhanSo difference = ps1.tru(ps2);
        PhanSo product = ps1.nhan(ps2);
        PhanSo quotient = ps1.chia(ps2);

        sum.xuat();
        difference.xuat();
        product.xuat();
        quotient.xuat();
    }
}

