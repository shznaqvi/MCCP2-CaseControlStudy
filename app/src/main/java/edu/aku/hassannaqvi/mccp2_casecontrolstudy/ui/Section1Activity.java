package edu.aku.hassannaqvi.mccp2_casecontrolstudy.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import edu.aku.hassannaqvi.mccp2_casecontrolstudy.R;
import edu.aku.hassannaqvi.mccp2_casecontrolstudy.services.TypefaceUtil;

public class Section1Activity extends AppCompatActivity {

    @BindView(R.id.s1)
    TextView s1;
    @BindView(R.id.lbl105) TextView lbl105;
    @BindView(R.id.mc105)
    EditText mc105;
    @BindView(R.id.mc106) EditText mc106;
    @BindView(R.id.lbl107) TextView lbl107;
    @BindView(R.id.mc107)
    RadioGroup mc107;
    @BindView(R.id.mc107_yes)
    RadioButton mc107Yes;
    @BindView(R.id.mc107_no) RadioButton mc107No;
    @BindView(R.id.mc107_3) RadioButton mc1073;
    @BindView(R.id.lbl108) TextView lbl108;
    @BindView(R.id.mc108) RadioGroup mc108;
    @BindView(R.id.mc108_yes) RadioButton mc108Yes;
    @BindView(R.id.mc108_no) RadioButton mc108No;
    @BindView(R.id.mc108_3) RadioButton mc1083;

    private static String deviceId;
    private String mc101 = DateFormat.getDateTimeInstance().format(new Date());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);

        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/JameelNooriNastaleeq.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf

        setContentView(R.layout.activity_section1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.submit) void onSubmitClick() {


    }

    @OnLongClick(R.id.submit) boolean onSubmitLongClick() {
        //TODO implement
        return true;
    }
}
