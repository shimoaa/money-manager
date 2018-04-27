package com.example.hp.myapplication.DB1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class SQLiteHelper extends SQLiteOpenHelper {
    //user table name   password
    private static SQLiteHelper sInstance;

    private static final String DATABASE_NAME = "Taining_center";
    private static final int DATABASE_VERSION = 4;

    public static final String USER_TABLE = "user_table";
   // public static final String ADS_TABLE = "ads_table";
 //   public static final String COURSES_TABLE = "courses_table";

    public static final String PK_ID_COULMN = "PK_ID_COULMN";
    public static final String FORIGN_KEY_COULMN = "FORIGN_KEY_COULMN";

    public static final String USER_NAME_COLUMN = "USER_NAME_COLUMN";
    public static final String USER_PASSWORD_COULMN = "USER_PASSWORD_COULMN";

   // public static final String ADS_NAME_COLUMN = "ADS_NAME_COLUMN";
//    public static final String ADS_DATE_COULMN = "ADS_DATE_COULMN";
 //   public static final String ADS_IMAGE_COULMN = "ADS_IMAGE_COULMN";
   // public static final String ADS_DETAIL_COLUMN = "ADS_DETAIL_COLUMN";

/*    public static final String COURSE_NAME_COLUMN = "COURSE_NAME_COLUMN";
    public static final String COURSE_DATE_COULMN = "COURSE_DATE_COULMN";
    public static final String COURSE_IMAGE_COULMN = "COURSE_IMAGE_COULMN";
    public static final String COURSE_PLACE_COLUMN = "COURSE_PLACE_COLUMN";
    public static final String COURSE_HOURS_COLUMN = "COURSE_HOURS_COLUMN";
    public static final String COURSE_PRICE_COLUMN = "COURSE_PRICE_COLUMN";
    public static final String COURSE_COURSETRAINER_COLUMN = "COURSE_COURSETRAINER_COLUMN";
    public static final String COURSE_DETAIL_COLUMN = "COURSE_DETAIL_COLUMN";*/


    private SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    public static synchronized SQLiteHelper getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new SQLiteHelper(context);
        }
        return sInstance;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL
                ("create table " + USER_TABLE + " ( " + PK_ID_COULMN + " INTEGER PRIMARY KEY AUTOINCREMENT ," + USER_NAME_COLUMN + " TEXT ," +  USER_PASSWORD_COULMN + " TEXT );");
      //  sqLiteDatabase.execSQL
       //         ("create table " + ADS_TABLE + " ( " + PK_ID_COULMN + " INTEGER PRIMARY KEY AUTOINCREMENT ," + FORIGN_KEY_COULMN + " TEXT ," + ADS_NAME_COLUMN + " TEXT ," + ADS_IMAGE_COULMN + " blob ," + ADS_DATE_COULMN + " TEXT ," + ADS_DETAIL_COLUMN + " TEXT );");
      //  sqLiteDatabase.execSQL
         //       ("create table " + COURSES_TABLE + " ( " + PK_ID_COULMN + " INTEGER PRIMARY KEY AUTOINCREMENT ," + FORIGN_KEY_COULMN + " TEXT ," + COURSE_NAME_COLUMN + " TEXT ," + COURSE_DATE_COULMN + " TEXT ," + COURSE_IMAGE_COULMN + " TEXT ," + COURSE_PRICE_COLUMN + " TEXT ," + COURSE_PLACE_COLUMN + " TEXT ," + COURSE_HOURS_COLUMN + " TEXT ,"
         //               + COURSE_COURSETRAINER_COLUMN + " TEXT ," + COURSE_DETAIL_COLUMN + " TEXT );");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + USER_TABLE);
       // sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ADS_TABLE);
        //sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + COURSES_TABLE);

        onCreate(sqLiteDatabase);
    }
}
