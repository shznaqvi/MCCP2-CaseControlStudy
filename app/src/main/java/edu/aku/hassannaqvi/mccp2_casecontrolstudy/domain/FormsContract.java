package edu.aku.hassannaqvi.mccp2_casecontrolstudy.domain;

/**
 * Created by hassan.naqvi on 10/8/2016.
 */

import android.provider.BaseColumns;

import java.util.HashMap;
import java.util.Map;

public class FormsContract {

    private static final String TAG = "FORM_CONTRACT";
    private static final String PROJECT_NAME = "MCCP2-Case-Control-Study";
    private static final String SURVEY_TYPE = "1";

    private Long _ID;

    private String cCFRMNO;
    private String cC101;
    private String cC101TIME;
    private String cC102;
    private String cC103;
    private String cC104;
    private String cC105;
    private String cC106;
    private String cC107;
    private String cC108;
    private String cC109;
    private String cC110;
    private String cC110X;
    private String s2;
    private String s3;
    private String s4;
    private String cGPSLAT;
    private String cGPSLNG;
    private String cGPSACC;
    private String cGPSTIME;
    private String cSync;
    private String cSyncDT;


    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public FormsContract() {
    }

    public FormsContract(String cCFRMNO, String cC101, String cC101TIME, String cC102, String cC103, String cC104, String cC105, String cC106, String cC107, String cC108, String cC109, String cC110, String cC110X, String s2, String s3, String s4, String cGPSLAT, String cGPSLNG, String cGPSACC, String cGPSTIME, String cSync, String cSyncDT) {
        this.cCFRMNO = cCFRMNO;
        this.cC101 = cC101;
        this.cC101TIME = cC101TIME;
        this.cC102 = cC102;
        this.cC103 = cC103;
        this.cC104 = cC104;
        this.cC105 = cC105;
        this.cC106 = cC106;
        this.cC107 = cC107;
        this.cC108 = cC108;
        this.cC109 = cC109;
        this.cC110 = cC110;
        this.cC110X = cC110X;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.cGPSLAT = cGPSLAT;
        this.cGPSLNG = cGPSLNG;
        this.cGPSACC = cGPSACC;
        this.cGPSTIME = cGPSTIME;
        this.cSync = cSync;
        this.cSyncDT = cSyncDT;
    }

    public FormsContract(String cCFRMNO, String cC101, String cC101TIME, String cC102, String cC103, String cC104, String cC105, String cC106, String cC107, String cC108, String cC109, String cC110, String cC110X, String cGPSLAT, String cGPSLNG, String cGPSACC, String cGPSTIME, String cSync, String cSyncDT) {
        this.cCFRMNO = cCFRMNO;
        this.cC101 = cC101;
        this.cC101TIME = cC101TIME;
        this.cC102 = cC102;
        this.cC103 = cC103;
        this.cC104 = cC104;
        this.cC105 = cC105;
        this.cC106 = cC106;
        this.cC107 = cC107;
        this.cC108 = cC108;
        this.cC109 = cC109;
        this.cC110 = cC110;
        this.cC110X = cC110X;
        this.cGPSLAT = cGPSLAT;
        this.cGPSLNG = cGPSLNG;
        this.cGPSACC = cGPSACC;
        this.cGPSTIME = cGPSTIME;
        this.cSync = cSync;
        this.cSyncDT = cSyncDT;
    }

    /**
     * @return The cCFRMNO
     */
    public String getCCFRMNO() {
        return cCFRMNO;
    }

    /**
     * @param cCFRMNO The CCFRMNO
     */
    public void setCCFRMNO(String cCFRMNO) {
        this.cCFRMNO = cCFRMNO;
    }

    /**
     * @return The cC101
     */
    public String getCC101() {
        return cC101;
    }

    /**
     * @param cC101 The CC101
     */
    public void setCC101(String cC101) {
        this.cC101 = cC101;
    }

    /**
     * @return The cC101TIME
     */
    public String getCC101TIME() {
        return cC101TIME;
    }

    /**
     * @param cC101TIME The CC101TIME
     */
    public void setCC101TIME(String cC101TIME) {
        this.cC101TIME = cC101TIME;
    }

    /**
     * @return The cC102
     */
    public String getCC102() {
        return cC102;
    }

    /**
     * @param cC102 The CC102
     */
    public void setCC102(String cC102) {
        this.cC102 = cC102;
    }

    /**
     * @return The cC103
     */
    public String getCC103() {
        return cC103;
    }

    /**
     * @param cC103 The CC103
     */
    public void setCC103(String cC103) {
        this.cC103 = cC103;
    }

    /**
     * @return The cC104
     */
    public String getCC104() {
        return cC104;
    }

    /**
     * @param cC104 The CC104
     */
    public void setCC104(String cC104) {
        this.cC104 = cC104;
    }

    /**
     * @return The cC105
     */
    public String getCC105() {
        return cC105;
    }

    /**
     * @param cC105 The CC105
     */
    public void setCC105(String cC105) {
        this.cC105 = cC105;
    }

    /**
     * @return The cC106
     */
    public String getCC106() {
        return cC106;
    }

    /**
     * @param cC106 The CC106
     */
    public void setCC106(String cC106) {
        this.cC106 = cC106;
    }

    /**
     * @return The cC107
     */
    public String getCC107() {
        return cC107;
    }

    /**
     * @param cC107 The CC107
     */
    public void setCC107(String cC107) {
        this.cC107 = cC107;
    }

    /**
     * @return The cC108
     */
    public String getCC108() {
        return cC108;
    }

    /**
     * @param cC108 The CC108
     */
    public void setCC108(String cC108) {
        this.cC108 = cC108;
    }

    /**
     * @return The cC109
     */
    public String getCC109() {
        return cC109;
    }

    /**
     * @param cC109 The CC109
     */
    public void setCC109(String cC109) {
        this.cC109 = cC109;
    }

    /**
     * @return The cC110
     */
    public String getCC110() {
        return cC110;
    }

    /**
     * @param cC110 The CC110
     */
    public void setCC110(String cC110) {
        this.cC110 = cC110;
    }

    /**
     * @return The cC110X
     */
    public String getCC110X() {
        return cC110X;
    }

    /**
     * @param cC110X The CC110X
     */
    public void setCC110X(String cC110X) {
        this.cC110X = cC110X;
    }

    /**
     * @return The s2
     */
    public String getS2() {
        return s2;
    }

    /**
     * @param s2 The s2
     */
    public void setS2(String s2) {
        this.s2 = s2;
    }
    
    /**
     * @return The s3
     */
    public String getS3() {
        return s3;
    }

    /**
     * @param s3 The s3
     */
    public void setS3(String s3) {
        this.s3 = s3;
    }

    /**
     * @return The s4
     */
    public String getS4() {
        return s4;
    }

    /**
     * @param s4 The s4
     */
    public void setS4(String s4) {
        this.s4 = s4;
    }

    public String getcGPSLAT() {
        return cGPSLAT;
    }

    public void setcGPSLAT(String cGPSLAT) {
        this.cGPSLAT = cGPSLAT;
    }

    public String getcGPSLNG() {
        return cGPSLNG;
    }

    public void setcGPSLNG(String cGPSLNG) {
        this.cGPSLNG = cGPSLNG;
    }

    public String getcGPSACC() {
        return cGPSACC;
    }

    public void setcGPSACC(String cGPSACC) {
        this.cGPSACC = cGPSACC;
    }

    public String getcGPSTIME() {
        return cGPSTIME;
    }

    public void setcGPSTIME(String cGPSTIME) {
        this.cGPSTIME = cGPSTIME;
    }

    public String getcSync() {
        return cSync;
    }

    public void setcSync(String cSync) {
        this.cSync = cSync;
    }

    public String getcSyncDT() {
        return cSyncDT;
    }

    public void setcSyncDT(String cSyncDT) {
        this.cSyncDT = cSyncDT;
    }

    public static abstract class singleForm implements BaseColumns {

        public static final String TABLE_NAME = "Forms";
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
        public static final String cC110X = "cC110X";
        public static final String cGPSLAT = "cGPSLAT";
        public static final String cGPSLNG = "cGPSLNG";
        public static final String cGPSACC = "cGPSACC";
        public static final String cGPSTIME = "cGPSTIME";
        public static final String cSync = "cSync";
        public static final String cSyncDT = "cSyncDT";
    }



}
