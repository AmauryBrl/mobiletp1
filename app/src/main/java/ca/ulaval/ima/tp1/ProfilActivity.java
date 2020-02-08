package ca.ulaval.ima.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        TextView firstname, name, birthday, idul;
        Profile profile =  intent.getParcelableExtra("profile");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        String dateString = formatter.format(profile.getBirthday().getTime());
        setContentView(R.layout.activity_profil);

        firstname = findViewById(R.id.first_nameText);
        name = findViewById(R.id.nameText);
        birthday = findViewById(R.id.birthdayText);
        idul  = findViewById(R.id.idultext);
        firstname.setText(profile.getFirst_name());
        name.setText(profile.getName());
        birthday.setText(dateString);
        idul.setText(profile.getIdul());
         }
}
