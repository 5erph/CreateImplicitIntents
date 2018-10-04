//CASEY LORIA 9/21/2018
package com.dkg.casey.caseyloria_lab5;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    Button btnA, btnB, btnC;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnA = (Button)findViewById(R.id.button);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent();
                i.setAction("android.intent.action.VIEW");
                i.addCategory("android.intent.category.DEFAULT");
                i.setData(Uri.parse("http://developer.android.com"));
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                else{
                    Toast toast=Toast.makeText(getApplicationContext(), "No Matcing Activity!",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
