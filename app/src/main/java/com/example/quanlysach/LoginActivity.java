package com.example.quanlysach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.quanlysach.dao.ThuThuDao;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText edtUser=findViewById(R.id.edtUser);
        EditText edtPass=findViewById(R.id.edtPass);

        Button btnDangNhap=findViewById(R.id.btnLogin);
        ThuThuDao thuThuDao=new ThuThuDao(this);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=edtUser.getText().toString();
                String pass=edtPass.getText().toString();
                if(thuThuDao.checkDangNhap(user,pass)){
                    //lưu sharedpreferences;
                    SharedPreferences sharedPreferences=getSharedPreferences("THONG TIN",MODE_PRIVATE);
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                    editor.putString("matt",user);
                    editor.commit();

                    startActivity(new Intent(LoginActivity.this,MainActivity.class));

                }
                else{
                    Toast.makeText(LoginActivity.this, "username va mật khẩu không đúng", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}