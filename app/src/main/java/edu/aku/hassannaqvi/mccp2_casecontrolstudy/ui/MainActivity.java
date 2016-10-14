package edu.aku.hassannaqvi.mccp2_casecontrolstudy.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import edu.aku.hassannaqvi.mccp2_casecontrolstudy.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openForm(View v){
        Intent oFIntent = new Intent(this, Section1Activity.class);
        startActivity(oFIntent);
    }

    public void openSec1(View v){
        Intent osec1 = new Intent(this, Section1Activity.class);
        startActivity(osec1);
    }


}
