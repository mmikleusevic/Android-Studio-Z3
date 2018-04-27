package com.example.marin.zadatak2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Scanner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.unesi_br1)
    EditText unesi_br1;
    @BindView(R.id.unesi_br2)
    EditText unesi_br2;
    @BindView(R.id.button_zbrajanje)
    Button button_zbrajanje;
    @BindView(R.id.button_oduzimanje)
    Button button_oduzimanje;
    @BindView(R.id.button_mnozenje)
    Button button_mnozenje;
    @BindView(R.id.button_dijeljenje)
    Button button_dijeljenje;
    @BindView(R.id.textview_display)
    TextView textview_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @SuppressLint("DefaultLocale")
    @OnClick(R.id.button_oduzimanje)
    public void saveOduzimanje() {
        double aa;
        double bb;
        try{
            aa = Double.parseDouble(unesi_br1.getText().toString());
            bb = Double.parseDouble(unesi_br1.getText().toString());
            Kalkulator kalkulator = new Kalkulator(aa,bb);
            textview_display.setText(String.format("%1$,.2f",kalkulator.getOduzimanje() ));
        }
        catch (Exception e){
            Toast.makeText(MainActivity.this, "It's empty", Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("DefaultLocale")
    @OnClick(R.id.button_zbrajanje)
    public void saveZbrajanje() {
        double aa;
        double bb;
        try{
            aa = Double.parseDouble(unesi_br1.getText().toString());
            bb = Double.parseDouble(unesi_br1.getText().toString());
            Kalkulator kalkulator = new Kalkulator(aa,bb);
            textview_display.setText(String.format("%1$,.2f",kalkulator.getZbrajanje() ));
        }
        catch (Exception e){
            Toast.makeText(MainActivity.this, "It's empty", Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("DefaultLocale")
    @OnClick(R.id.button_mnozenje)
    public void saveMnozenje() {
        double aa;
        double bb;
        try{
            aa = Double.parseDouble(unesi_br1.getText().toString());
            bb = Double.parseDouble(unesi_br1.getText().toString());
            Kalkulator kalkulator = new Kalkulator(aa,bb);
            textview_display.setText(String.format("%1$,.2f",kalkulator.getMnozenje() ));
        }
        catch (Exception e){
            Toast.makeText(MainActivity.this, "It's empty", Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("DefaultLocale")
    @OnClick(R.id.button_dijeljenje)
    public void saveDijeljenje() {
        double aa;
        double bb;
        try{
            aa = Double.parseDouble(unesi_br1.getText().toString());
            bb = Double.parseDouble(unesi_br1.getText().toString());
            Kalkulator kalkulator = new Kalkulator(aa,bb);
            textview_display.setText(String.format("%1$,.2f",kalkulator.getDijeljenje() ));
        }
        catch (Exception e){
            Toast.makeText(MainActivity.this, "It's empty", Toast.LENGTH_SHORT).show();
        }
    }
}