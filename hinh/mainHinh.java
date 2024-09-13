package Sesson5.hinh;

public class mainHinh {
    public static void main(String[] args) {
        hinh h = new hinh();
        System.out.println("\nDiện tích hình chữ nhật: "+h.dienTich(2,3));
        System.out.println("\nChu vi hình chữ nhật: "+h.chuVi(2,3));
        System.out.println("\nDien tich hinh tron: "+h.dienTich(5));
        System.out.println("\nchu vi hinh tron: "+h.chuVi(4));
        System.out.println("\ndien tich hinh tam giac: "+h.dienTich(2,4,5));
        System.out.println("chu vi hình tam giac: "+h.chuVi(2,3,4));
    }
}
