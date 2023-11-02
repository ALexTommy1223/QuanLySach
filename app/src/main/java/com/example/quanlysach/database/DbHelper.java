package com.example.quanlysach.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(Context context) {
        super(context,"DANGKYMONHOC",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String dbThuThu="CREATE TABLE THUTHU(matt text primary key, hoten text , matkhau text)";
        sqLiteDatabase.execSQL(dbThuThu);

        String dbThanhVien= "CREATE TABLE THANHVIEN(matv integer primary key autoincrement , hoten text, namsinh text)";
        sqLiteDatabase.execSQL(dbThanhVien);

        String dbLoai ="CREATE TABLE LOAISACH(maloai integer primary key autoincrement , tenloai text)";
        sqLiteDatabase.execSQL(dbLoai);

        String dbSach="CREATE TABLE SACH(masach integer primary key autoincrement , tensach text, giathue integer,maloai integer references LOAISACH(maloai))";
        sqLiteDatabase.execSQL(dbSach);

        String dbPhieuMuon ="CREATE TABLE PHIEUMUON(mapm integer primary key autoincrement, matv integer references THANHVIEN(matv), matt text references THUHU(matt), masach integer references SACH(masach), ngay text, trasach integer , tienthue integer)";
        sqLiteDatabase.execSQL(dbPhieuMuon);


        //data mẫu
        sqLiteDatabase.execSQL("INSERT INTO LOAISACH VALUES(1,'Thieu nhi'),(2,'Tinh cam'),(3,'Giao khoa')");
        sqLiteDatabase.execSQL("INSERT INTO SACH VALUES(1,'Hay doi day',2500,1),(2,'Thang cuoi',1000,1),(3,'Lap trinh android',2000,3)");
        sqLiteDatabase.execSQL("INSERT INTO THUTHU VALUES('thuthu01','Nguyen Van A','abc123'),('thuthu02','Nguyen Vo C','abc456')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        if(i!=i1){
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS THUTHU");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS THANHVIEN");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS LOAISACH");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS SACH");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS PHIEUMUON");
            onCreate(sqLiteDatabase);

        }
    }
}
