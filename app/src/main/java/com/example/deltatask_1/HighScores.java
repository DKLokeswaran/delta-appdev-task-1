package com.example.deltatask_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HighScores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);
        SharedPreferences sharedPreferences=getSharedPreferences("pref", MODE_PRIVATE);
        TextView[] scores={findViewById(R.id.hs0),findViewById(R.id.hs1),findViewById(R.id.hs2)};
        for (int i=1;i<=3;i++){
            scores[i-1].setText(Float.toString(sharedPreferences.getFloat("highScore"+i,0)));
        }
    }
    public void goBack(View v){
        Intent intent=new Intent(HighScores.this,LauncherActivity.class);
        startActivity(intent);
        finish();
    }
}