package com.zixsma.androidplayground.androidplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResourceActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);
        textView = (TextView) findViewById(R.id.text_view);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setAwesomeTextView("World!");
    }

    public void setAwesomeTextView(String text) {
        String awesomeText = getResources().getString(R.string.text_awesome, text);
        textView.setText(awesomeText);
    }
}
