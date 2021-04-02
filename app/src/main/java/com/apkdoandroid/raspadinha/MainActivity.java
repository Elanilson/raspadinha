package com.apkdoandroid.raspadinha;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.anupkumarpanwar.scratchview.ScratchView;

public class MainActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ScratchView scratchView = findViewById(R.id.scratview);
        scratchView.setRevealListener(new ScratchView.IRevealListener() {
            @Override
            public void onRevealed(ScratchView scratchView) {
//                Toast.makeText(MainActivity.this, "Revelado", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onRevealPercentChangedListener(ScratchView scratchView, float percent) {
//                Toast.makeText(MainActivity.this, "scrath", Toast.LENGTH_SHORT).show();


            }
        });
    }
}