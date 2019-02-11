package com.example.m;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.m.R;

public class MainActivity extends Activity
{
    Button dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dashboard =(Button)findViewById(R.id.dashboardbutton);
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dashboardintent = new Intent(getApplicationContext(),FragmentLayout.class);
                startActivity(dashboardintent);
            }
        });


    }
}
