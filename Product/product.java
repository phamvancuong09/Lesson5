package Sesson5.Product;

import java.util.Scanner;

public class product {
    private String maSP, tenSP, nhaSX, loaiSanPham;
    private Double giaSP;

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public Double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(Double giaSP) {
        this.giaSP = giaSP;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public product(String maSP, String tenSP, String nhaSX, String loaiSanPham, Double giaSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.nhaSX = nhaSX;
        this.loaiSanPham = loaiSanPham;
        this.giaSP = giaSP;
    }

    public product() {
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        maSP = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        tenSP = sc.nextLine();
        System.out.println("Nhập Nhà sản xuất : ");
        nhaSX = sc.nextLine();
        System.out.println("Nhập giá nhà sản xuất: ");
        giaSP = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập loại sản phẩm (Việt Nam) hoặc (Thái Lan):");
        loaiSanPham = sc.nextLine();

    }
    public double caculateSalePrice(){
        double sale_price = 0;
        return sale_price += giaSP + (giaSP * 5/100);
    }
    public void display(){
        System.out.println("Mã sản phẩm: "+maSP);
        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Nhà sản xuất: "+nhaSX);
        System.out.println("Giá sản xuất: "+giaSP);
        System.out.println("Gía bán sản phẩm gốc: "+caculateSalePrice());
        System.out.println("Loại sản phẩm: "+loaiSanPham);
    }
}
