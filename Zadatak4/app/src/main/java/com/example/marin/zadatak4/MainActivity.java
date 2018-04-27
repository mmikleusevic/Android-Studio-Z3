package com.example.marin.zadatak4;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.height_text)
    EditText height_text;
    @BindView(R.id.weight_text)
    EditText weight_text;
    @BindView(R.id.calculate)
    Button calculate;
    @BindView(R.id.results)
    TextView results;
    @BindView(R.id.image)
    ImageView image;
    @BindView(R.id.image1)
    ImageView image1;
    @BindView(R.id.image2)
    ImageView image2;
    @BindView(R.id.image3)
    ImageView image3;
    @BindView(R.id.results_desc)
    TextView results_desc;
    @BindView(R.id.results_desc1)
    TextView results_desc1;
    @BindView(R.id.results_desc2)
    TextView results_desc2;
    @BindView(R.id.results_desc3)
    TextView results_desc3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.height_text)
    public void ocistia() {
        height_text.setText("");
        EditText et = (EditText) findViewById(R.id.height_text);
        et.setFilters(new InputFilter[]{new InputFilterMinMax("1", "2.5")});
    }

    @OnClick(R.id.weight_text)
    public void ocistib() {
        weight_text.setText("");
        EditText et = (EditText) findViewById(R.id.weight_text);
        et.setFilters(new InputFilter[]{new InputFilterMinMax("1", "350")});
    }

    @SuppressLint("DefaultLocale")
    @OnClick(R.id.calculate)
    public void izracunaj(View view) {
        double heighta;
        double weighta;
        try {
            heighta = Double.parseDouble(height_text.getText().toString());
            weighta = Double.parseDouble(weight_text.getText().toString());
            BMI bmi = new BMI(heighta, weighta);
            results.setText(String.format("%1$,.2f", bmi.getBmi()));
            results.setVisibility(View.VISIBLE);
            results_desc.setVisibility(View.INVISIBLE);
            results_desc1.setVisibility(View.INVISIBLE);
            results_desc2.setVisibility(View.INVISIBLE);
            results_desc3.setVisibility(View.INVISIBLE);
            image.setVisibility(View.INVISIBLE);
            image1.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
            if (bmi.getBmi() < 18.5) {
                results_desc.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
            } else if (bmi.getBmi() > 18.5 && bmi.getBmi() < 25) {
                results_desc1.setVisibility(View.VISIBLE);
                image1.setVisibility(View.VISIBLE);
            } else if (bmi.getBmi()> 25 && bmi.getBmi() < 30) {
                results_desc2.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
            } else if (bmi.getBmi() > 30) {
                results_desc3.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
            }
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "It's empty", Toast.LENGTH_SHORT).show();
        }
    }
}

