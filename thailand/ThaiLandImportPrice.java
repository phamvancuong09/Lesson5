package Sesson5.thailand;

import java.util.Scanner;

public class ThaiLandImportPrice {
    private float thueNhapKhau, giaHTNhapKhau, giaNhapKhau;

    public float getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(float thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    public float getGiaHTNhapKhau() {
        return giaHTNhapKhau;
    }

    public void setGiaHTNhapKhau(float giaHTNhapKhau) {
        this.giaHTNhapKhau = giaHTNhapKhau;
    }

    public float getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(float giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public ThaiLandImportPrice(float thueNhapKhau, float giaHTNhapKhau, float giaNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
        this.giaHTNhapKhau = giaHTNhapKhau;
        this.giaNhapKhau = giaNhapKhau;
    }

    public ThaiLandImportPrice() {
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá nhập khẩu: ");
        giaNhapKhau = sc.nextFloat();
        System.out.println("Nhập thuế nhập khẩu: ");
        thueNhapKhau = sc.nextFloat();
        System.out.println("Nhập giá hỗ trợ nhập khẩu: ");
        giaHTNhapKhau = sc.nextFloat();
    }

    public double caculateSalePrice(){
        return giaNhapKhau + thueNhapKhau * giaNhapKhau - giaHTNhapKhau * giaNhapKhau + (10/100 * (giaNhapKhau + thueNhapKhau * giaNhapKhau - giaHTNhapKhau * giaNhapKhau));
    }
    public void display(){
        System.out.println("Gía nhập khẩu: "+giaNhapKhau);
        System.out.println("Thế nhập khẩu: "+thueNhapKhau);
        System.out.println("Gía thuế nhập khẩu: "+giaHTNhapKhau);
    }
}
