package com.example.displayjoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {
    public static String JOKE_KEY="com.udacity.gradle.builditbigger.joke.key";
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        mTextView=(TextView)findViewById(R.id.joke);
        if(getIntent()!=null&&getIntent().hasExtra(JOKE_KEY)){
            mTextView.setText(getIntent().getStringExtra(JOKE_KEY));
        }
    }
}
