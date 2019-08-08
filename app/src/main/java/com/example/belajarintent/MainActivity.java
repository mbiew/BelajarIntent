package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent;
    Button implicitintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            explicitintent = (Button) findViewById(R.id.btnExp);
            explicitintent.setOnClickListener(this);
        implicitintent = (Button) findViewById(R.id.btnImp);
        implicitintent.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnExp:
             Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
             startActivity(explicit);
             break;
            case R.id.btnImp:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3school.com"));
                startActivity(implicit);
                break;
            default:
                break;
        }
    }
}
