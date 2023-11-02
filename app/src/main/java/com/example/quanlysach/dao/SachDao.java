package com.example.quanlysach.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.quanlysach.database.DbHelper;
import com.example.quanlysach.model.Sach;

import java.util.ArrayList;

public class SachDao {
    DbHelper dbHelper;
    public SachDao(Context context){
        dbHelper=new DbHelper(context);
    }
    //Lấy toàn bộ đầu sách có ở trong thư viện
    public ArrayList<Sach> getDSDauSach(){
        ArrayList<Sach> list=new ArrayList<>();
        SQLiteDatabase sqLiteDatabase=dbHelper.getReadableDatabase();
        //dùng con trỏ để đọc và lưu để quản lý kiểm soát vị trí của hàng trong kết quả trả về của một truy vấn cơ sở dữ liêu
        Cursor cursor=sqLiteDatabase.rawQuery("SELECT * FROM SACH",null);

        if(cursor.getCount()!=0){
            cursor.moveToFirst();
            do {
                list.add(new Sach(cursor.getInt(0),cursor.getString(1),cursor.getInt(2),cursor.getInt(3)));

            }while (cursor.moveToNext());
        }

        return list;
    }
}
