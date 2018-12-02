package com.andi.petbio;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = findViewById(R.id.catViewID);
        dogView = findViewById(R.id.dogViewID);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.catViewID:
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Jarvis");
                catIntent.putExtra("bio", "Great Cat loves people");
                startActivity(catIntent);
                break;
            case R.id.dogViewID:
                Toast.makeText(MainActivity.this, "from dog", Toast.LENGTH_LONG).show();
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Bello");
                dogIntent.putExtra("bio", "Bello loves runnning");
                startActivity(dogIntent);
                break;
        }
    }
}
