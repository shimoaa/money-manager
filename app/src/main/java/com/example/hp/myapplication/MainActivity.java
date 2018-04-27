package com.example.hp.myapplication;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.hp.myapplication.Utilites.CheckUtil;
import com.example.hp.myapplication.DB1.DBFacade;
import com.example.hp.myapplication.DB1.SQLiteHelper;
import com.example.hp.myapplication.Utilites.Utils;


public class MainActivity extends AppCompatActivity{
    private DBFacade facade;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name =  findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        facade = new DBFacade(this);

        Button btn_login = findViewById(R.id.login);
        Button btn_signup = findViewById(R.id.signup);
        dialog=new AlertDialog.Builder(MainActivity.this);



        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,moneymanager.class);
                /*facade.open();
                if (!TextUtils.isEmpty(name.getText()) && !TextUtils.isEmpty(password.getText())) {
                    if (CheckUtil.checkPhone(name.getText()) && CheckUtil.checkPass(password.getText())) {
                        Cursor cursor = facade.getAminByCoulmn(SQLiteHelper.USER_NAME_COLUMN, SQLiteHelper.USER_TABLE,name.getText().toString());
                        if (cursor.getCount() <= 0) {

                            dialog.setMessage(R.string.not_valid).setTitle(R.string.wrong).setIcon(R.drawable.cancel).show();
                        } else {
                            cursor.moveToFirst();
                            String commingPass = password.getText().toString().trim();
                            String DataBasePass = cursor.getString(cursor.getColumnIndex(SQLiteHelper.USER_PASSWORD_COULMN));
                            if (commingPass.equals(DataBasePass)) {
                                Utils.saveUser(MainActivity.this,name.getText().toString());
                                Intent intent = new Intent(MainActivity.this, moneymanager.class);
                                startActivity(intent);
                                finish();
                            }
                            else{
                                dialog.setMessage(R.string.not_valid).setTitle(R.string.wrong).setIcon(R.drawable.cancel).show();

                            }
                        }
                    } else {
                        name.setError(getString(R.string.validate_phone));
                    }
                } else {
                    password.setError(getString(R.string.complete_field));
                    name.setError(getString(R.string.complete_field));
                }
                facade.close();*/
            }
        });








        btn_signup .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,signup.class));
            }
        });
    }
}
