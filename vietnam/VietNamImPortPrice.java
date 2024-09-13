package Sesson5.vietnam;

import java.util.Scanner;

public class VietNamImPortPrice {
    private float thueNhapKhau;
    private float giaNhapKhau;

    public VietNamImPortPrice(float thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    public float getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public VietNamImPortPrice(float thueNhapKhau, float giaNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
        this.giaNhapKhau = giaNhapKhau;
    }

    public void setGiaNhapKhau(float giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public VietNamImPortPrice() {
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thue nhap khau: ");
        thueNhapKhau = sc.nextFloat();
        System.out.println("Nhap giá nhap khau: ");
        giaNhapKhau = sc.nextFloat();
    }

    public double caculateSalePrice(){
        double sale_Price = 0;
        return sale_Price += giaNhapKhau + thueNhapKhau * giaNhapKhau + (10/100 *(giaNhapKhau + thueNhapKhau * giaNhapKhau));
    }

    public void display(){
        System.out.println("Thuế nhập khẩu: "+thueNhapKhau);
        System.out.println("Giá nhập khẩu: "+giaNhapKhau);
    }
}
