package Sesson5;

import java.util.Scanner;

public class baiThucHanh1 {
    private float temperNum;

    private float convertC2F(){
        return (float) (temperNum * 1.8 + 32);
    }

    private float convertF2C(){
        return (float) ((temperNum - 32) / 1.8);
    }

    public void convert(float nhietDo, boolean isToC){
        this.temperNum = nhietDo;
        if(isToC){
            System.out.println("Nhiet do: " + nhietDo + "C = " + convertC2F() + "F");
        } else {
            System.out.println("Nhiet do: " + nhietDo + "F = " + convertF2C() + "C");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap nhiet do can chuyen doi:");
        Scanner sc = new Scanner(System.in);
        float nhietDo = sc.nextFloat();
        sc.nextLine(); // Thêm dòng này để bỏ qua ký tự xuống dòng

        System.out.println("Nhiet do ban vua nhap la: (bam C hoac F)");
        char nhapND = sc.nextLine().charAt(0);
        baiThucHanh1 CV = new baiThucHanh1();

        switch (nhapND) {
            case 'C':
                CV.convert(nhietDo, true);
                break;
            case 'F':
                CV.convert(nhietDo, false);
                break;
            default:
                System.out.println("Ky tu nhap khong hop le.");
        }
    }
}
