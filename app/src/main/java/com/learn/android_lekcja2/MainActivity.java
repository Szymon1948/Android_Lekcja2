package com.learn.android_lekcja2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Pytanie> pytanie = new ArrayList<>();
    TextView pytTextView;
    int licznik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pytTextView = findViewById(R.id.pytanieTextView);
        dodajPytania();
        wyswietlPytanie(0);
    }
    private void wyswietlPytanie(int i){
        pytTextView.setText(pytanie.get(i).getTresc());
    }
    private void dodajPytania(){
        pytanie.add(new Pytanie("Jezeli na ciało nie działa żadna siła," +
                "ciało porusza się ruchem jednostajnym",true) );
        pytanie.add(new Pytanie("ciało spada swobodnie z przyśpieszeniem 20m/s", false));
        pytanie.add(new Pytanie("Czy ziemia jest płaska ?",false));
        pytanie.add(new Pytanie("W Autobusie podczas hamowania działa siła " +
                "bezwładnosći w kierunku jazdy autobusu",true));
    }
    public void sprawdz(View view){
        Integer id = view.getId();
        if(pytanie.get(licznik).isOdpowiedz() ) {
            if (id == R.id.button4) {
                Toast.makeText(MainActivity.this, "Dobra odpowiedź :)", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Zła odpowiedź :/", Toast.LENGTH_SHORT).show();
            }
        }
       else{
            if (id == R.id.button4) {
                Toast.makeText(MainActivity.this, "Zła odpowiedź :/", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Dobra odpowiedź :)", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void kolejne(View view) {
        licznik++;
        if(licznik==pytanie.size()){
            pytTextView.setText("Koniec Testu");
            view.setVisibility(View.INVISIBLE);
        }
        else{
            wyswietlPytanie(licznik);
        }

    }
}