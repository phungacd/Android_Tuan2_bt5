package com.example.android_tuan2_bt5_tulamgiaodien;

import com.example.android_tuan2_bt5_tulamgiaodien.KhachHang;

import java.util.ArrayList;

public class DanhSachKhachHang {
    ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();


    public void themKhachHang(KhachHang khachHangh) {
        dskh.add(khachHangh);
    }

    public double tongDoanhThu() {
        double tien = 0.0;
        for (KhachHang khachHang : dskh) {
            tien += khachHang.tinhThanhTien();
        }
        return tien;
    }

    public int tongKhachHang() {
        return dskh.size();
    }

    //tính tổng số kh vip
    public int tongKHVip() {

        int s = 0;
        for (KhachHang khachHang : dskh) {
            if (khachHang.isIsvip()) {
                s++;
            }
        }
            return s;
        }

}



