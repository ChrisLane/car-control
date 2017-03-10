package org.ateam.carcontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConvoyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convoy);
    }

    public void createConvoy(View view) {
        startActivity(new Intent(this, InConvoyActivity.class));
    }

    public void joinConvoy(View view) {
        startActivity(new Intent(this, JoinConvoyActivity.class));

    }
}
