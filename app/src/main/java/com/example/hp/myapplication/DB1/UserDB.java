package com.example.hp.myapplication.DB1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.example.hp.myapplication.DB1.Tables.TUser;
import com.example.hp.myapplication.DB1.Tables.TCenter;


public class UserDB extends DB {

    public UserDB(Context context) {
        super(context);

    }

    //insert new user to the system
    //you can add all data fields
    //return long number which is the id number
    @Override
    protected long insert(TCenter center) {
        TUser admin = (TUser) center;
        ContentValues values = new ContentValues();
        values.put(sqlHelper.USER_NAME_COLUMN, admin.getName());
        values.put(sqlHelper.USER_PASSWORD_COULMN, admin.getPassword());
        return db.insert(sqlHelper.USER_TABLE, null, values);
    }

//boolean isExist(String tableName, String tableCoulmn, String tableField)
    //you can use to find is the user register before
    //return true if he register

    public boolean isExist(String tableName, String tableCoulmn, String tableField) {
        open();
        Cursor cursor = db.rawQuery("select * from " + tableName + " where " + tableCoulmn + "=?", new String[]{tableField});
        if (cursor.getCount() <= 0) {
            close();
            return false;
        } else {
            close();
            return true;
        }
    }

    @Override
    protected int update(TCenter center, String id, String table) {
        return 0;
    }
}
