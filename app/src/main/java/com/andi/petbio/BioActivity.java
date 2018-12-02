package com.andi.petbio;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petImageView;
    private TextView petName;
    private TextView petBio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImageView = findViewById(R.id.petBioImageID);
        petName = findViewById(R.id.petImageViewID);
        petBio = findViewById(R.id.bioTextID);

        extras = getIntent().getExtras();

        if (extras != null) {
            String name = extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name, bio);
        }
    }

    public void setUp(String name, String bio){

        if (name.equals("Bello")){
            petImageView.setImageDrawable(ContextCompat.getDrawable(BioActivity.this, R.drawable.icon_lg_dog));
            petBio.setText(bio);
            petName.setText(name);
        } else if (name.equals("Jarvis")){
            petImageView.setImageDrawable(ContextCompat.getDrawable(BioActivity.this, R.drawable.icon_lg_cat));
            petBio.setText(bio);
            petName.setText(name);
        }
    }
}
