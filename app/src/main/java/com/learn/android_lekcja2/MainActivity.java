package com.learn.android_lekcja2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sprawdz(View view){
        Integer id = view.getId();
        Toast.makeText(MainActivity.this,
                id.toString(),
                Toast.LENGTH_SHORT).show();
        if(id == R.id.button4){
            Toast.makeText(MainActivity.this, "Dobra odpowiedź :)", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Zła odpowiedź :/", Toast.LENGTH_SHORT).show();
        }
    }
}