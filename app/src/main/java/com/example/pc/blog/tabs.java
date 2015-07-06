package com.example.pc.blog;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;


public class tabs extends TabActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("FirstTab");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("SeconTab");

        tab1.setIndicator("Tab1");
        tab1.setContent(new Intent(this, TabActivity1.class));

        tab2.setIndicator("Tab2");
        tab2.setContent(new Intent(this, TabActivity2.class));


        tabHost.addTab(tab1);
        tabHost.addTab(tab2);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_test, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        CustomDialog start_dialog = new CustomDialog(this);
        start_dialog.show();
        return  true;
    }

    public void AddClicked(View view){
       Intent i = new Intent(tabs.this,Splash.class);
   }



}
