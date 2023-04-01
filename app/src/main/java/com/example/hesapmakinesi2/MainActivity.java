package com.example.hesapmakinesi2;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button bt1, bt2, bt3,bt4, bt5, bt6, bt7, bt8, bt9 ;
        EditText edt1, edt2;
        TextView tw1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hesapmakinesi();
    }

    public void hesapmakinesi(){

        bt1 = findViewById(R.id.toplama);
        bt2 = findViewById(R.id.cikarma);
        bt3 = findViewById(R.id.bolme);
        bt4 = findViewById(R.id.carpma);
        bt5 = findViewById(R.id.yuzdelik);
        bt6 = findViewById(R.id.karekok);
        bt7 = findViewById(R.id.karehesabı);
        bt8 = findViewById(R.id.silgi);
        bt9 = findViewById(R.id.kalanbulma);
        tw1 = findViewById(R.id.textView2);
        edt1 = findViewById(R.id.editText1);
        edt2 = findViewById(R.id.editText2);


        bt1.setOnClickListener(new View.OnClickListener() { // Toplama
            @Override
            public void onClick(View view) {
                //float sayibir = Float.parseFloat(edt1.getText().toString());
                //float sayiiki = Float.parseFloat(edt2.getText().toString());
                //tw1.setText(String.valueOf(sayibir+sayiiki));
                edt2.setVisibility(View.VISIBLE);

                if (edt1.getText().toString().isEmpty() || edt2.getText().toString().trim().isEmpty() ) {
                    //Üst Taraftaki If kısmı "Empty EditText" kontrolü yapıyor.
                    Toast.makeText(MainActivity.this, "Hatalı İşlem Lütfen Bir Sayı Giriniz.", Toast.LENGTH_SHORT).show();
                } else {
                    float sayibir = Float.parseFloat(edt1.getText().toString());
                    float sayiiki = Float.parseFloat(edt2.getText().toString());
                    tw1.setText(String.valueOf(sayibir+sayiiki));
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() { // Çıkarma
            @Override
            public void onClick(View view) {
                /*float sayibir = Float.parseFloat(edt1.getText().toString());
                float sayiiki = Float.parseFloat(edt2.getText().toString());
                tw1.setText(String.valueOf(sayibir-sayiiki));*/
                edt2.setVisibility(View.VISIBLE);

                if (edt1.getText().toString().trim().isEmpty() || edt2.getText().toString().trim().isEmpty() ) {
                    Toast.makeText(MainActivity.this, "Hatalı İşlem Lütfen Bir Sayı Giriniz.", Toast.LENGTH_SHORT).show();
                } else {
                    float sayibir = Float.parseFloat(edt1.getText().toString());
                    float sayiiki = Float.parseFloat(edt2.getText().toString());
                    tw1.setText(String.valueOf(sayibir-sayiiki));
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() { // Bölme
            @Override
            public void onClick(View view) {
                /*float sayibir = Float.parseFloat(edt1.getText().toString());
                float sayiiki = Float.parseFloat(edt2.getText().toString());*/
                //tw1.setText(String.valueOf(sayibir/sayiiki));

                edt2.setVisibility(View.VISIBLE);

                if (edt1.getText().toString().trim().isEmpty() || edt2.getText().toString().trim().isEmpty() ) {
                    Toast.makeText(MainActivity.this, "Hatalı İşlem Lütfen Bir Sayı Giriniz.", Toast.LENGTH_SHORT).show();
                } else {
                    float sayibir = Float.parseFloat(edt1.getText().toString());
                    float sayiiki = Float.parseFloat(edt2.getText().toString());

                    if (sayiiki > 0) {
                        tw1.setText(String.valueOf(sayibir/sayiiki));
                    } else {
                        tw1.setText("Hatalı İşlem.");
                    }
                }

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() { //Çarpma
            @Override
            public void onClick(View view) {
                /*float sayibir = Float.parseFloat(edt1.getText().toString());
                float sayiiki = Float.parseFloat(edt2.getText().toString());
                tw1.setText(String.valueOf(sayibir*sayiiki));*/
                edt2.setVisibility(View.VISIBLE);

                if (edt1.getText().toString().trim().isEmpty() || edt2.getText().toString().trim().isEmpty() ) {
                    Toast.makeText(MainActivity.this, "Hatalı İşlem Lütfen Bir Sayı Giriniz.", Toast.LENGTH_SHORT).show();
                } else {
                    float sayibir = Float.parseFloat(edt1.getText().toString());
                    float sayiiki = Float.parseFloat(edt2.getText().toString());
                    tw1.setText(String.valueOf(sayibir*sayiiki));
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() { //Yüzdelik Alıyor (Ne kadar Doğru Bilemem Artık
            @Override
            public void onClick(View view) {
                /*float sayibir = Float.parseFloat(edt1.getText().toString());
                float sayiiki = Float.parseFloat(edt2.getText().toString());
                tw1.setText(String.valueOf(sayibir * (sayiiki/100)));*/
                edt2.setVisibility(View.VISIBLE);

                if (edt1.getText().toString().trim().isEmpty() || edt2.getText().toString().trim().isEmpty() ) {
                    Toast.makeText(MainActivity.this, "Hatalı İşlem Lütfen Bir Sayı Giriniz.", Toast.LENGTH_SHORT).show();
                } else {
                    float sayibir = Float.parseFloat(edt1.getText().toString());
                    float sayiiki = Float.parseFloat(edt2.getText().toString());
                    tw1.setText(String.valueOf(sayibir * (sayiiki/100)));
                }
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() { //Karekök Hesabı :)
            @Override
            public void onClick(View view) {
                //float sayibir = Float.parseFloat(edt1.getText().toString());
                //float sayiiki = Float.parseFloat(edt2.getText().toString());
                //tw1.setText(String.valueOf (Math.sqrt (sayibir)));


                if (edt1.getText().toString().trim().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Hatalı İşlem Lütfen Bir Sayı Giriniz.", Toast.LENGTH_SHORT).show();
                } else {
                    float sayibir = Float.parseFloat(edt1.getText().toString());
                    //float sayiiki = Float.parseFloat(edt2.getText().toString());
                    //tw1.setText(String.valueOf (Math.sqrt (sayibir)));

                    if (sayibir >= 0) {
                        edt2.setVisibility(View.INVISIBLE);
                        tw1.setText(String.valueOf (Math.sqrt (sayibir)));
                    } else {
                        tw1.setText("Hatalı İşlem.");
                    }
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() { //Üs Alıyor
            @Override
            public void onClick(View view) {
                /*float sayibir = Float.parseFloat(edt1.getText().toString());
                float sayiiki = Float.parseFloat(edt2.getText().toString());
                tw1.setText(String.valueOf(Math.pow(sayibir, sayiiki)));*/
                edt2.setVisibility(View.VISIBLE);

                if (edt1.getText().toString().trim().isEmpty() || edt2.getText().toString().trim().isEmpty() ) {
                    Toast.makeText(MainActivity.this, "Hatalı İşlem Lütfen Bir Sayı Giriniz.", Toast.LENGTH_SHORT).show();
                } else {
                    float sayibir = Float.parseFloat(edt1.getText().toString());
                    float sayiiki = Float.parseFloat(edt2.getText().toString());
                    tw1.setText(String.valueOf(Math.pow(sayibir, sayiiki)));
                }
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() { // Temizleme Butonu
            @Override
            public void onClick(View view) {
                edt1.getText().clear();
                edt2.getText().clear();
                edt2.setVisibility(View.VISIBLE);
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() { //Kalan Bulma
            @Override
            public void onClick(View view) {
                edt2.setVisibility(View.VISIBLE);
                if (edt1.getText().toString().trim().isEmpty() || edt2.getText().toString().trim().isEmpty() ) {
                    Toast.makeText(MainActivity.this, "Hatalı İşlem Lütfen Bir Sayı Giriniz.", Toast.LENGTH_SHORT).show();
                } else {
                    float sayibir = Float.parseFloat(edt1.getText().toString());
                    float sayiiki = Float.parseFloat(edt2.getText().toString());
                    tw1.setText(String.valueOf(sayibir%sayiiki));
                }
            }
        });

    }
}