package com.example.android_tuan2_bt5_tulamgiaodien;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button tinhtt,tiep,thongke;
    EditText tenkh,soluongsach,tongkh,tongkhvip,tongdoanhthu;
    CheckBox checkBoxkhvip;
    TextView kq;
    ImageView imgthoat;
    DanhSachKhachHang danhsach = new DanhSachKhachHang();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getControls();
        addEvents();
    }
    private  void getControls()
    {
            tinhtt = findViewById(R.id.btntinhtiep);
            tiep = findViewById(R.id.btntiep);
            thongke = findViewById(R.id.btnthongke);
            tenkh = findViewById(R.id.txttenkhachhang);
            soluongsach = findViewById(R.id.txtsoluongsach);
            tongkh = findViewById(R.id.txttongsokhachhang);
            tongkhvip = findViewById(R.id.txttongsokhvip);
            tongdoanhthu = findViewById(R.id.txttongdoanhthu);
            kq = findViewById(R.id.viewTTien);
            checkBoxkhvip = findViewById(R.id.chkkhachhang);
            imgthoat = findViewById(R.id.imgthoat);
        }
    private void addEvents (){
        tinhtt.setOnClickListener(new XuLySuKien());
        tiep.setOnClickListener(new XuLySuKien());
        thongke.setOnClickListener(new XuLySuKien());
        imgthoat.setOnClickListener(new XuLySuKien());
    }

    private void doTinhTien(){
        KhachHang khachHang = new KhachHang();
        khachHang.setTenkh(tenkh.getText()+"");
        khachHang.setSlmua(Integer.parseInt(soluongsach.getText()+""));
        khachHang.setIsvip(checkBoxkhvip.isChecked());
        kq.setText(khachHang.tinhThanhTien()+"");
        danhsach.themKhachHang(khachHang);
    }

    private void doTiep(){
        tenkh.setText("");
        soluongsach.setText("");
        kq.setText("");
        tenkh.requestFocus();
    }

    private void doThongKe (){
        tongkh.setText(danhsach.tongKhachHang()+"");
        tongkhvip.setText(danhsach.tongKHVip()+"");
        tongdoanhthu.setText(danhsach.tongDoanhThu()+"");
    }



    private void doThoat(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hỏi thoát chương trình!! ");
        builder.setMessage("Muốn thoát chương trình này không??");
        builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.create().show();
    }
    private class XuLySuKien implements View.OnClickListener {
        @Override
        public void onClick(View arg0){
            switch (arg0.getId()){
                case R.id.btntinhtiep:
                    doTinhTien();
                    break;
                case R.id.btntiep:
                    doTiep();
                    break;
                case R.id.btnthongke:
                    doThongKe();
                    break;
                case R.id.imgthoat:
                    doThoat();
                    break;
            }
        }

    }
}
