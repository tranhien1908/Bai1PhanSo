package BaiTap;

import java.util.Scanner;
public class PhanSo {
    private int tuSo_312;
    private int mauSo;

    public PhanSo() {
    this.tuSo_312 = 0;
    this.mauSo = 1;
    }

    public PhanSo(int tuSo_312, int mauSo_312) {
        this.tuSo_312 = tuSo_312;
        this.mauSo = mauSo_312 != 0 ? mauSo_312 : 1;
    }

    public PhanSo cong(PhanSo ps_312) {
        int tu_312 = this.tuSo_312 * ps_312.mauSo + ps_312.tuSo_312 * this.mauSo;
        int mau_312 = this.mauSo * ps_312.mauSo;
        return new PhanSo(tu_312, mau_312).toiGian();
    }

    public PhanSo tru(PhanSo ps_312) {
        int tu_312 = this.tuSo_312 * ps_312.mauSo - ps_312.tuSo_312 * this.mauSo;
        int mau_312 = this.mauSo * ps_312.mauSo;
        return new PhanSo(tu_312, mau_312).toiGian();
    }

    public PhanSo nhan(PhanSo ps_312) {
        int tu_312 = this.tuSo_312 * ps_312.tuSo_312;
        int mau_312 = this.mauSo * ps_312.mauSo;
        return new PhanSo(tu_312, mau_312).toiGian();
    }

    public PhanSo chia(PhanSo ps_312) {
        int tu_312 = this.tuSo_312 * ps_312.mauSo;
        int mau_312 = this.mauSo * ps_312.tuSo_312;
        return new PhanSo(tu_312, mau_312).toiGian();
    }

    public boolean laToiGian() {
        return ucln(Math.abs(tuSo_312), Math.abs(mauSo)) == 1;
    }

    public PhanSo toiGian() {
        int gcd312 = ucln(Math.abs(tuSo_312), Math.abs(mauSo));
        int tu312 = tuSo_312 / gcd312;
        int mau312 = mauSo / gcd312;
        if (mau312 < 0) {
            tu312 = -tu312;
            mau312 = -mau312;
        }
        return new PhanSo(tu312, mau312);
    }

    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void nhap() {
        Scanner sc312 = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tuSo_312 = sc312.nextInt();
        do {
            System.out.print("Nhap mau so (khac 0): ");
            mauSo = sc312.nextInt();
        } while (mauSo == 0);
    }

    public void xuat() {
        System.out.println(tuSo_312 + "/" + mauSo);
    }
}