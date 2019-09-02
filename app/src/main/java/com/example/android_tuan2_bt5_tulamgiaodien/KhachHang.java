package com.example.android_tuan2_bt5_tulamgiaodien;

public class KhachHang {
    private String tenkh;
    private int slmua;
    private boolean isvip;

    public static final int GIA = 20000;

    public KhachHang() {
    }

    public KhachHang(String tenkh, int slmua, boolean isvip) {
        this.tenkh = tenkh;
        this.slmua = slmua;
        this.isvip = isvip;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public int getSlmua() {
        return slmua;
    }

    public void setSlmua(int slmua) {
        this.slmua = slmua;
    }

    public boolean isIsvip() {
        return isvip;
    }

    public void setIsvip(boolean isvip) {
        this.isvip = isvip;
    }

    public double tinhThanhTien (){
        return (!isvip?slmua*GIA:(slmua*GIA)*0.9);
    }
}


