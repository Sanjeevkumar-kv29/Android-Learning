package com.example.navigationdrawerlayout_handle_navdrawermenuevents_android_github;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
        super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        switch (id){
            case R.id.nav_item_home :
                Toast.makeText(getApplicationContext(),"Nav Item Home Clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_item_groups :
                Toast.makeText(getApplicationContext(),"Nav Item Groups Clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_item_events :
                Toast.makeText(getApplicationContext(),"Nav Item Events Clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_item_jobs :
                Toast.makeText(getApplicationContext(),"Nav Item Jobs Clicked",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_item_setting_privacy :
                Toast.makeText(getApplicationContext(),"Nav Item Setting & Privacy Clicked",Toast.LENGTH_SHORT).show();
                break;
        }

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
