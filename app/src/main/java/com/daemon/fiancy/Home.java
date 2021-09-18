package com.daemon.fiancy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {
   LinearLayout profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profile = findViewById(R.id.p1);
        DrawerLayout drawerLayout;
        ImageView profile, proPic;

        drawerLayout = findViewById(R.id.navDrawer);
        profile = findViewById(R.id.user_profile);
        proPic = findViewById(R.id.pro_Pic);

        // open Drawer
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // open Drawer
                openDrawer(drawerLayout);
            }
        });

        // close Drawer
        proPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // close Drawer
                closeDrawer(drawerLayout);
            }
        });
    }

    // open Drawer
    private static void openDrawer(DrawerLayout drawerLayout) {
        // open Drawer
        drawerLayout.openDrawer(GravityCompat.START);
    }

    // close Drawer
    private void closeDrawer(DrawerLayout drawerLayout) {
        //close Drawer
        //check
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            // when drawer is open
            // close Drawer
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }


    public void clicked(View view) {
        if (view == profile) {
            Intent intent = new Intent(this, profile.class);
            startActivity(intent);
        }
    }
}