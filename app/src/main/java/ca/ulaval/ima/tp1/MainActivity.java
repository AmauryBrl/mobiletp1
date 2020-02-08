package ca.ulaval.ima.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.content.Intent;
import android.net.Uri;

import java.util.GregorianCalendar;


public class MainActivity extends AppCompatActivity {

    private Profile profile;

    String UrlToLoad = "https://www.facebook.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile = new Profile("Amaury", "BREUIL", new GregorianCalendar(1996, 2, 25), "AMBRE14");
    }

    public void button1(View view) {
        Uri uriUrl = Uri.parse(UrlToLoad);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void button2(View view) {
        Intent intent = new Intent(MainActivity.this, ViewActivity.class);
        intent.putExtra("url", UrlToLoad);
        startActivity(intent);
    }

    public void button3(View view) {
        startActivity(new Intent(MainActivity.this, LavalActivity.class));
    }

    public void button4(View view) {
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        intent.putExtra("profile", profile);
        startActivity(intent);
    }

}

