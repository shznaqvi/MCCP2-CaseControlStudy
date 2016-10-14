package edu.aku.hassannaqvi.mccp2_casecontrolstudy.domain;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;

public class mccp2DBHelperController {
	private final String TAG = mccp2DBHelperController.class.getSimpleName();

	protected void delete(Context context, String tableName, String statement) {
		Log.d(TAG, "delete");
		mccp2DBHelper dbhelper = new mccp2DBHelper(context);
		SQLiteDatabase sqliteDB = dbhelper.getWritableDatabase();
		sqliteDB.delete(tableName, statement, null);
		sqliteDB.close();
		dbhelper.close();
	}

	protected void execute(Context context, String query) {
		try {
			mccp2DBHelper dbhelper = new mccp2DBHelper(context);
			SQLiteDatabase sqliteDB = dbhelper.getWritableDatabase();
			sqliteDB.execSQL(query);
			sqliteDB.close();
			dbhelper.close();
		} catch (SQLiteException e) {
			Log.e(TAG, "Failed open database. ", e);
		} catch (SQLException e) {
			Log.e(TAG, "Failed to update Names. ", e);
		}
	}

	protected ArrayList<ArrayList<String>> executeQuery(Context context, String query) {
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		mccp2DBHelper dbhelper = new mccp2DBHelper(context);
		SQLiteDatabase sqliteDB = dbhelper.getReadableDatabase();
		Cursor c = sqliteDB.rawQuery(query, null);
		if (c.moveToFirst()) {
			do {
				ArrayList<String> subList = new ArrayList<String>();
				for (int i = 0; i < c.getColumnCount(); i++) {
					subList.add(c.getString(i));
				}
				list.add(subList);
			} while (c.moveToNext());
		} else {
			Log.d(TAG, "0 rows");
		}
		c.close();
		sqliteDB.close();
		dbhelper.close();
		return list;
	}

}