package com.innocent.bit.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashAvtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent Main = new Intent(SplashAvtivity.this, MainActivity.class);
        startActivity(Main);
        finish();
    }
}
