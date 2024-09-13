package Sesson5.baiThucHanh3;

public class main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        SinhVien sv1 = new SinhVien(1, "Cường");
        SinhVien sv2 = new SinhVien(2,"cuong", "Thanh Hóa");
        SinhVien sv3 = new SinhVien(3, "cuong", "Thanh Hóa", 2f);
        System.out.println("Sinh viên 1: ");
        System.out.println("\nSinh viên 2: RollNo:"+sv1.getRollNo() + " name:"+sv1.getName());
        System.out.println("Sinh viên 3: RollNo:"+sv2.getRollNo()+ " Name:"+sv2.getName()+ " address:"+sv2.getAddress());
        System.out.println("Sinh viên 4: RollNo:"+sv3.getRollNo()+ " Name:"+sv3.getName()+ " address:"+sv3.getAddress()+ "  mark: "+sv3.getMark());

    }

}
