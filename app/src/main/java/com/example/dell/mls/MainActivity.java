package com.example.dell.mls;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //   ((AppCompatActivity)this.getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       /* this.getActionBar().setDisplayHomeAsUpEnabled(true);
        this.getActionBar().hide();*/
       button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("item clicked","Item clicked1111111111111111111111111111");
                Intent intent = new Intent(MainActivity.this,Demo.class);
                startActivity(intent);
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.eng:
                String languageToLoad = "en"; // your language
                Locale locale = new Locale(languageToLoad);
                Resources res = getResources();
                DisplayMetrics dm = res.getDisplayMetrics();

                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;

                Intent refresh = new Intent(this, MainActivity.class);
                startActivity(refresh);
                finish();
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());

                break;
            case R.id.hn:
                languageToLoad = "hi"; // your language
                locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                config = new Configuration();
                config.locale = locale;
                Intent refresh1 = new Intent(this, MainActivity.class);
                startActivity(refresh1);
                finish();
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());

                break;
            case R.id.fr:
                languageToLoad = "fr"; // your language
                locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                config = new Configuration();
                config.locale = locale;
                Intent refresh2 = new Intent(this, MainActivity.class);
                startActivity(refresh2);
                finish();
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());

                break;
            case R.id.de:
                languageToLoad = "de"; // your language
                locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                config = new Configuration();
                config.locale = locale;
                Intent refresh3 = new Intent(this, MainActivity.class);
                startActivity(refresh3);
                finish();
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());

                break;
            case R.id.ja:
                languageToLoad = "ja"; // your language
                locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                config = new Configuration();
                config.locale = locale;
                Intent refresh4 = new Intent(this, MainActivity.class);
                startActivity(refresh4);
                finish();
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());

                break;
            case R.id.ma:
                languageToLoad = "ma"; // your language
                locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                config = new Configuration();
                config.locale = locale;
                Intent refresh5 = new Intent(this, MainActivity.class);
                startActivity(refresh5);
                finish();
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());

                break;
            case R.id.ka:
                languageToLoad = "ka"; // your language
                locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                config = new Configuration();
                config.locale = locale;
                Intent refresh6 = new Intent(this, MainActivity.class);
                startActivity(refresh6);
                finish();
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());

                break;
            case R.id.te:
                languageToLoad = "te"; // your language
                locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                config = new Configuration();
                config.locale = locale;
                Intent refresh7 = new Intent(this, MainActivity.class);
                startActivity(refresh7);
                finish();
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());

                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }



}