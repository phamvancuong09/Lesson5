package Sesson5.vietnam;

import java.text.Collator;
import java.util.*;

import Sesson5.Product.product;
import Sesson5.thailand.ThaiLandImportPrice;

public class GeneralManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        ArrayList<product> listP = new ArrayList<>();
        ArrayList<VietNamImPortPrice> listVN = new ArrayList<>();
        ArrayList<ThaiLandImportPrice> listTL = new ArrayList<>();
        do{
            System.out.println("===========Menu=============="+
                    "\n1.Nhập thông tin n sản phẩm của Việt Nam"+
                    "\n2.Nhập thông tin n sản phẩm của Thái Lan"+
                    "\n3.Hiển thị tất cả sản phẩm của Việt Nam cũng như Thái Lan"+
                    "\n4.Sắp xếp theo tên sản pẩm tăng dần và hiển thị danh sách sau khi sắp xếp "+
                    "\n5.Tính giá sản phẩm tại Việt Nam và Thái Lan và hiển thị giá bán"+
                    "\n6.Tìm kiếm theo giá bán v hiển thị kết quả tìm kiếm"+
                    "\n7.Thoát!");
            System.out.println("Mời bạn nhập lựa chọn: ");
            chon = sc.nextInt();

            switch (chon){
                case 1:
                    System.out.print("Nhập số lượng sản phẩm của Việt Nam: ");
                    int n = sc.nextInt();
                    sc.nextLine(); // Bỏ qua ký tự xuống dòng

                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin sản phẩm của Việt Nam thứ " + (i + 1) + ":");
                        product sp = new product();
                        sp.input();
                        listP.add(sp);
                        if ("Việt Nam".equalsIgnoreCase(sp.getLoaiSanPham())) {
                            VietNamImPortPrice vn = new VietNamImPortPrice();
                            vn.input();
                            listVN.add(vn);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nhập số lượng sản phẩm của Thái Lan: ");
                    int m = sc.nextInt();
                    sc.nextLine(); // Bỏ qua ký tự xuống dòng

                    for (int i = 0; i < m; i++) {
                        System.out.println("Nhập thông tin sản phẩm của Thái Lan thứ " + (i + 1) + ":");
                        product sp = new product();
                        sp.input();
                        listP.add(sp);
                        if ("Thái Lan".equalsIgnoreCase(sp.getLoaiSanPham())) {
                            ThaiLandImportPrice tl = new ThaiLandImportPrice();
                            tl.input();
                            listTL.add(tl);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Danh sách sản phẩm của Việt Nam:");
                    for (int i = 0; i < listP.size(); i++) {
                        product p = listP.get(i);
                        if ("Việt Nam".equalsIgnoreCase(p.getLoaiSanPham())) {
                            p.display();
                            if (i < listVN.size()) {
                                listVN.get(i).display();
                            }
                        }
                    }

                    System.out.println("Danh sách sản phẩm của Thái Lan:");
                    for (int i = 0; i < listP.size(); i++) {
                        product p = listP.get(i);
                        if ("Thái Lan".equalsIgnoreCase(p.getLoaiSanPham())) {
                            p.display();
                            if (i < listTL.size()) {
                                listTL.get(i).display();
                            }
                        }
                    }
                    break;
                case 4:
                    Collections.sort(listP, new Comparator<product>() {
                        @Override
                        public int compare(product p1, product p2) {
                            // Bỏ khoảng trắng thừa và chuyển tên về dạng chữ thường để so sánh chính xác
                            String tenSP1 = p1.getTenSP().trim().toLowerCase();
                            String tenSP2 = p2.getTenSP().trim().toLowerCase();

                            // Sử dụng Collator để sắp xếp theo thứ tự bảng chữ cái tiếng Việt
                            Collator collator = Collator.getInstance(new Locale("vi", "VN"));
                            return collator.compare(tenSP1, tenSP2);
                        }
                    });

                    // Hiển thị danh sách sau khi sắp xếp
                    System.out.println("Danh sách sản phẩm sau khi sắp xếp theo tên tăng dần:");
                    for (product p : listP) {
                        p.display();
                    }
                    break;
                case 5:
                    System.out.println("Giá bán sản phẩm Việt Nam:");
                    for (int i = 0; i < listP.size(); i++) {
                        product p = listP.get(i);
                        if ("Việt Nam".equalsIgnoreCase(p.getLoaiSanPham())) {
                            p.display();
                            if (i < listVN.size()) {
                                System.out.println("Giá bán: " + listVN.get(i).caculateSalePrice());
                            }
                        }
                    }

                    System.out.println("Giá bán sản phẩm Thái Lan:");
                    for (int i = 0; i < listP.size(); i++) {
                        product p = listP.get(i);
                        if ("Thái Lan".equalsIgnoreCase(p.getLoaiSanPham())) {
                            p.display();
                            if (i < listTL.size()) {
                                System.out.println("Giá bán: " + listTL.get(i).caculateSalePrice());
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.print("Nhập giá bán cần tìm kiếm: ");
                    double searchPrice = sc.nextDouble();

                    System.out.println("Sản phẩm Việt Nam có giá bán gần bằng " + searchPrice + ":");
                    for (int i = 0; i < listP.size(); i++) {
                        product p = listP.get(i);
                        if ("Việt Nam".equalsIgnoreCase(p.getLoaiSanPham())) {
                            if (i < listVN.size() && Math.abs(listVN.get(i).caculateSalePrice() - searchPrice) < 0.01) {
                                p.display();
                                System.out.println("Giá bán: " + listVN.get(i).caculateSalePrice());
                            }
                        }
                    }

                    System.out.println("Sản phẩm Thái Lan có giá bán gần bằng " + searchPrice + ":");
                    for (int i = 0; i < listP.size(); i++) {
                        product p = listP.get(i);
                        if ("Thái Lan".equalsIgnoreCase(p.getLoaiSanPham())) {
                            if (i < listTL.size() && Math.abs(listTL.get(i).caculateSalePrice() - searchPrice) < 0.01) {
                                p.display();
                                System.out.println("Giá bán: " + listTL.get(i).caculateSalePrice());
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Bạn đã thoát khỏi chương trình!!!");
                    sc.close();
                    return;
            }
        }while (chon != 7);
    }
}
