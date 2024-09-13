package Sesson5.hinh;

public class hinh {
    public double dienTich(float chieuDai, float chieuRong){
        return chieuDai * chieuRong;
    }

    public double chuVi(float chieuDai, float chieuRong){
        return (chieuDai + chieuRong)*2;
    }

    public double dienTich(double r){
        return Math.PI * Math.pow(r,2) ;
    }

    public double chuVi(float r){
        return  2* Math.PI * r;
    }

    public double dienTich(float a, float b, float c){
        float P = a +b +c;
        return Math.sqrt((P/2) * ((P/2)-a) * ((P/2)-b) * ((P/2)-c) );
    }

    public double chuVi(float a, float b, float c){
        return a +b +c;
    }
}
