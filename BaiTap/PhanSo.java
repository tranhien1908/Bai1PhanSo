package BaiTap;

import java.util.Scanner;
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
    this.tuSo = 0;
    this.mauSo = 1;
    }

    public PhanSo(int tuSo312, int mauSo312) {
        this.tuSo = tuSo312;
        this.mauSo = mauSo312 != 0 ? mauSo312 : 1;
    }

    public PhanSo cong(PhanSo ps312) {
    int tu312 = this.tuSo * ps312.mauSo312 + ps312.tuSo312 * this.mauSo;
    int mau312 = this.mauSo * ps312.mauSo312;
    return new PhanSo(tu312, mau312).toiGian();
    }

    public PhanSo tru(PhanSo ps312) {
    int tu312 = this.tuSo * ps312.mauSo312 - ps312.tuSo312 * this.mauSo;
    int mau312 = this.mauSo * ps312.mauSo312;
    return new PhanSo(tu312, mau312).toiGian();
    }

    public PhanSo nhan(PhanSo ps312) {
        int tu312 = this.tuSo312 * ps312.tuSo312;
        int mau312 = this.mauSo312 * ps312.mauSo312;
        return new PhanSo(tu312, mau312).toiGian();
    }

    public PhanSo chia(PhanSo ps312) {
        int tu312 = this.tuSo312 * ps312.mauSo312;
        int mau312 = this.mauSo312 * ps312.tuSo312;
        return new PhanSo(tu312, mau312).toiGian();
    }

    public boolean laToiGian() {
        return ucln(Math.abs(tuSo312), Math.abs(mauSo312)) == 1;
    }

    public PhanSo toiGian() {
        int gcd312 = ucln(Math.abs(tuSo312), Math.abs(mauSo312));
        int tu312 = tuSo312 / gcd312;
        int mau312 = mauSo312 / gcd312;
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
        tuSo312 = sc312.nextInt();
        do {
            System.out.print("Nhap mau so (khac 0): ");
            mauSo312 = sc312.nextInt();
        } while (mauSo312 == 0);
    }

    public void xuat() {
        System.out.println(tuSo312 + "/" + mauSo312);
    }
}