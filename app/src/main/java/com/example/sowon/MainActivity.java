package com.example.sowon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void HelloWorldClicked(View view) {
//        Toast.makeText(getApplicationContext(), "to Insert page", Toast.LENGTH_LONG).show();
//        finish();
        Intent intent = new Intent(getApplicationContext(), InsertActivity.class);
        startActivity(intent);
    }
}
