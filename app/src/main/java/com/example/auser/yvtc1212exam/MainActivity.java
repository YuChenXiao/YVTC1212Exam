package com.example.auser.yvtc1212exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.auser.yvtc1212exam.news.NewsActivity;
import com.example.auser.yvtc1212exam.talk.TalkActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clicknews(View v){
        Intent it =new Intent(MainActivity.this,NewsActivity.class);
        startActivity(it);
    }
    public void clicktalk(View v){
        Intent it =new Intent(MainActivity.this,TalkActivity.class);
        startActivity(it);
    }
    public void clicksqlite(View v){

    }
}
