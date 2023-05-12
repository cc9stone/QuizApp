package com.azamovhudstc.quizapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.azamovhudstc.quizapp.R;

public class AboutActivity extends AppCompatActivity {
    androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        initView();
        toolbar.setNavigationOnClickListener(v->{
            onBackPressed();
        });
    }
    private void initView(){
        toolbar=findViewById(R.id.cvAbout);
    }
}