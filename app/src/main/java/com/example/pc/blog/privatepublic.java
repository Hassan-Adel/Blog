package com.example.pc.blog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by pc on 7/5/2015.
 */
public class privatepublic extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.privatepublic);
    }

    public void privateclicked(View view){
        Intent i = new Intent(privatepublic.this,tabs.class);
        startActivity(i);
    }


    }
