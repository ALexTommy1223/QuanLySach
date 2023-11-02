package com.example.quanlysach.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.quanlysach.database.DbHelper;

public class ThuThuDao {
    DbHelper dbHelper;
    public ThuThuDao(Context context){
        dbHelper=new DbHelper(context);
    }
    public boolean checkDangNhap(String matt,String matkhau){
        SQLiteDatabase sqLiteDatabase=dbHelper.getReadableDatabase();
       Cursor cursor= sqLiteDatabase.rawQuery("SELECT *FROM THUTHU WHERE matt=? AND matkhau=?",new String[]{matt,matkhau});
        if(cursor.getCount()!=0){

            return true;
        }
        return false;

    }
}
