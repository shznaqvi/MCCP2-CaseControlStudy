package edu.aku.hassannaqvi.mccp2_casecontrolstudy.domain;

import android.app.Application;
import android.provider.Settings;

import edu.aku.hassannaqvi.mccp2_casecontrolstudy.services.TypefaceUtil;

/**
 * Created by hassan.naqvi on 9/28/2016.
 */

public class MCCP2CCSApp extends Application {

    private static String deviceId;

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/JameelNooriNastaleeq.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf
        deviceId = Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID);

    }
}

