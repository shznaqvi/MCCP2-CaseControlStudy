package edu.aku.hassannaqvi.mccp2_casecontrolstudy.domain;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class mccp2DBHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "mccp2_ccs.db";
	private static final int DATABASE_VERSION = 1;
	private static final String TAG = mccp2DBHelper.class.getSimpleName();

	public mccp2DBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		Log.d(TAG, "constructor");
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE IF NOT EXISTS Forms(  _ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , cCFRMNO TEXT , cC101 TEXT , cC101TIME TEXT , cC102 TEXT , cC103 TEXT , cC104 TEXT , cC105 TEXT , cC106 TEXT , cC107 TEXT , cC108 TEXT , cC109 TEXT , cC110 TEXT , cC110x TEXT , cGPSLAT TEXT , cGPSLAG TEXT , cGPSACC TEXT , cGPSTIME TEXT , cSync BOOLEAN DEFAULT \"false\", cSyncDT TIMESTAMP DEFAULT CURRENT_TIMESTAMP )");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(TAG, "Update database from version  " + oldVersion
                + " to " + newVersion + ", which remove all old records");
		onCreate(db);
	}

}