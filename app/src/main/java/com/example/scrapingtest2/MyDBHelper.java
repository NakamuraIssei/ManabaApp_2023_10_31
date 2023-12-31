package com.example.scrapingtest2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "task-data.db";
    private static final int DATABASE_VERSION = 1;

    public MyDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // テーブルを作成するクエリをここに記述します
        String createTaskDataTableQuery = "CREATE TABLE IF NOT EXISTS TaskData ("
                + "myId INTEGER PRIMARY KEY,"
                + "title TEXT,"
                + "subTitle TEXT,"
                + "notificationTiming TEXT,"
                + "done Boolern)";
        db.execSQL(createTaskDataTableQuery);

        String createClassDataTableQuery = "CREATE TABLE IF NOT EXISTS ClassData ("
                + "myId INTEGER PRIMARY KEY,"
                + "title TEXT,"
                + "subTitle TEXT,"
                + "notificationTiming TEXT,"
                + "done Boolern)";
        db.execSQL(createClassDataTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // データベースのバージョンが変更された場合の処理をここに記述します
        // 通常、テーブルのスキーマ変更などの処理を行います
    }
   // public void updateData()
}
