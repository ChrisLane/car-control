package org.ateam.carcontrol;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.ateam.carcontrol.R;

public class MusicMainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_main_menu);
    }

    public void invalidOption(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Option currently unavailable.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void moveActivity(View view) {
        Intent intent = new Intent(this, MusicMainActivity.class);
        startActivity(intent);
    }
}

