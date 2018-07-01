package com.example.sparsh.mr_calculator;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources r = getResources();
        Configuration config = r.getConfiguration();
        if (config.orientation==Configuration.ORIENTATION_PORTRAIT)
        {
            Intent i = new Intent("MrSimpleCalculator");
            startActivity(i);
        }
        else
        {
            setIntent(null);
            Intent i = new Intent("MrScientificCalculator");
            startActivity(i);
        }

    }
}
