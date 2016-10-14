package edu.aku.hassannaqvi.mccp2_casecontrolstudy.domain;

import android.content.Context;
import java.util.ArrayList;

public class Forms extends mccp2DBHelperController {
	private final String TABLE_NAME = "Forms";
	public static final String _ID = "_ID";
	public static final String cCFRMNO = "cCFRMNO";
	public static final String cC101 = "cC101";
	public static final String cC101TIME = "cC101TIME";
	public static final String cC102 = "cC102";
	public static final String cC103 = "cC103";
	public static final String cC104 = "cC104";
	public static final String cC105 = "cC105";
	public static final String cC106 = "cC106";
	public static final String cC107 = "cC107";
	public static final String cC108 = "cC108";
	public static final String cC109 = "cC109";
	public static final String cC110 = "cC110";
	public static final String cC110x = "cC110x";
	public static final String cGPSLAT = "cGPSLAT";
	public static final String cGPSLAG = "cGPSLAG";
	public static final String cGPSACC = "cGPSACC";
	public static final String cGPSTIME = "cGPSTIME";
	public static final String cSync = "cSync";
	public static final String cSyncDT = "cSyncDT";
	private Context context;

	public Forms(Context context) {
		this.context = context;
	}

	public void insert(Integer _ID, String cCFRMNO, String cC101, String cC101TIME, String cC102, String cC103, String cC104, String cC105, String cC106, String cC107, String cC108, String cC109, String cC110, String cC110x, String cGPSLAT, String cGPSLAG, String cGPSACC, String cGPSTIME, Boolean cSync, String cSyncDT) {
		cCFRMNO = cCFRMNO != null ? "\"" + cCFRMNO + "\"" : null;
		cC101 = cC101 != null ? "\"" + cC101 + "\"" : null;
		cC101TIME = cC101TIME != null ? "\"" + cC101TIME + "\"" : null;
		cC102 = cC102 != null ? "\"" + cC102 + "\"" : null;
		cC103 = cC103 != null ? "\"" + cC103 + "\"" : null;
		cC104 = cC104 != null ? "\"" + cC104 + "\"" : null;
		cC105 = cC105 != null ? "\"" + cC105 + "\"" : null;
		cC106 = cC106 != null ? "\"" + cC106 + "\"" : null;
		cC107 = cC107 != null ? "\"" + cC107 + "\"" : null;
		cC108 = cC108 != null ? "\"" + cC108 + "\"" : null;
		cC109 = cC109 != null ? "\"" + cC109 + "\"" : null;
		cC110 = cC110 != null ? "\"" + cC110 + "\"" : null;
		cC110x = cC110x != null ? "\"" + cC110x + "\"" : null;
		cGPSLAT = cGPSLAT != null ? "\"" + cGPSLAT + "\"" : null;
		cGPSLAG = cGPSLAG != null ? "\"" + cGPSLAG + "\"" : null;
		cGPSACC = cGPSACC != null ? "\"" + cGPSACC + "\"" : null;
		cGPSTIME = cGPSTIME != null ? "\"" + cGPSTIME + "\"" : null;
		cSyncDT = cSyncDT != null ? "\"" + cSyncDT + "\"" : null;
		
		Object[] values_ar = {_ID, cCFRMNO, cC101, cC101TIME, cC102, cC103, cC104, cC105, cC106, cC107, cC108, cC109, cC110, cC110x, cGPSLAT, cGPSLAG, cGPSACC, cGPSTIME, cSync, cSyncDT};
		String[] fields_ar = {Forms._ID, Forms.cCFRMNO, Forms.cC101, Forms.cC101TIME, Forms.cC102, Forms.cC103, Forms.cC104, Forms.cC105, Forms.cC106, Forms.cC107, Forms.cC108, Forms.cC109, Forms.cC110, Forms.cC110x, Forms.cGPSLAT, Forms.cGPSLAG, Forms.cGPSACC, Forms.cGPSTIME, Forms.cSync, Forms.cSyncDT};
		String values = "", fields = "";
		for (int i = 0; i < values_ar.length; i++) {
			if (values_ar[i] != null) {
				values += values_ar[i] + ", ";
				fields += fields_ar[i] + ", ";
			}
		}
		if (!values.isEmpty()) {
			values = values.substring(0, values.length() - 2);
			fields = fields.substring(0, fields.length() - 2);
			super.execute(context, "INSERT INTO " + TABLE_NAME + "(" + fields + ") values(" + values + ");");
		}
	}

	public void delete(String whatField, String whatValue) {
		super.delete(context, TABLE_NAME, whatField + " = " + whatValue);
	}

	public void update(String whatField, String whatValue, String whereField, String whereValue) {
		super.execute(context, "UPDATE " + TABLE_NAME + " set " + whatField + " = \"" + whatValue + "\" where " + whereField + " = \"" + whereValue + "\";");
	}

	public ArrayList<ArrayList<String>> select(String fields, String whatField, String whatValue, String sortField, String sort) {
		String query = "SELECT ";
		query += fields == null ? " * FROM " + TABLE_NAME : fields + " FROM " + TABLE_NAME;
		query += whatField != null && whatValue != null ? " WHERE " + whatField + " = \"" + whatValue + "\"" : "";
		query += sort != null && sortField != null ? " order by " + sortField + " " + sort : "";
		return super.executeQuery(context, query);
	}

	public ArrayList<ArrayList<String>> getExecuteResult(String query) {
		return super.executeQuery(context, query);
	}

	public void execute(String query) {
		super.execute(context, query);
	}

}