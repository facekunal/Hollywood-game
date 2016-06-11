package com.enchanterv.hollywood;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class WelcomeActivity extends Activity {
     Button wre;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        wre=(Button)findViewById(R.id.rbw);

        }

    public void fun(View view){
        Intent move2p = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(move2p);

    }
    }