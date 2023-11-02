package com.example.quanlysach.dao;

import android.content.Context;

import com.example.quanlysach.database.DbHelper;

public class PhieuMuonDao {
    DbHelper dbHelper;
    public PhieuMuonDao(Context context){
        dbHelper=new DbHelper(context);
    }
}
