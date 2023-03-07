package com.cubicus.mynavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.rupins.drawercardbehaviour.CardDrawerLayout;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

CardDrawerLayout cardDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cardDrawerLayout = (CardDrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                cardDrawerLayout,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer

        );

        cardDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        cardDrawerLayout.setViewScale(Gravity.START,0.9f);
        cardDrawerLayout.setRadius(Gravity.START,30);
        cardDrawerLayout.setViewElevation(Gravity.START,20);



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id==R.id.profile){

            Toast.makeText(this, "Profile Clicked", Toast.LENGTH_LONG).show();
        }else if(id==R.id.camera){

            Toast.makeText(this, "Camera Clicked", Toast.LENGTH_LONG).show();
        }else if(id==R.id.settings){

            Toast.makeText(this, "Settings Clicked", Toast.LENGTH_LONG).show();
        }else if(id==R.id.privacy){

            Toast.makeText(this, "Privacy Clicked", Toast.LENGTH_LONG).show();
        }else if(id==R.id.notify){

            Toast.makeText(this, "Notification Clicked", Toast.LENGTH_LONG).show();
        }else if(id==R.id.verified){

            Toast.makeText(this, "Verified Clicked", Toast.LENGTH_LONG).show();
        }else if(id==R.id.attachment){

            Toast.makeText(this, "Attachment Clicked", Toast.LENGTH_LONG).show();
        }else if(id==R.id.password){

            Toast.makeText(this, "Password Clicked", Toast.LENGTH_LONG).show();
        }
        return false;
    }
}