package com.example.hp.myapplication.DB1;

import android.content.Context;
import android.database.Cursor;
import com.example.hp.myapplication.DB1.Tables.TCenter;


public class DBFacade {
    DB adminDb;

    public DBFacade(Context context) {

        adminDb = new UserDB(context);
    }
    public void open(){
        adminDb.open();
    }

    public void close(){
        adminDb.close();
    }

    public long inserAdmin(TCenter center) {
        return adminDb.insert(center);
    }

    public Cursor getAminByCoulmn(String coulmnName, String tableName, String fieldValue) {
        return adminDb.getByColumn(coulmnName, tableName, fieldValue);
    }

    public Cursor getAllAdmins(String tableName) {
        return adminDb.getAll(tableName);
    }

    public int updateAdminData(TCenter values, String id, String table) {
        return adminDb.update(values, id, table);
    }

    public int deleteAdmin(String id, String tableName) {
        return adminDb.delete(id, tableName);
    }

    public boolean isExist(String tableName, String tableCoulmn, String tableField) {
        return ((UserDB)adminDb).isExist(tableName,tableCoulmn,tableField);
    }

}
