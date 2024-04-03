package com.example.androiddrawersamping;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.androiddrawersamping.fragments.MakananFavorit;
import com.example.androiddrawersamping.fragments.MakananKhas;
import com.example.androiddrawersamping.fragments.MinumanKhas;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showHomePage();

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);

        drawerLayout.addDrawerListener(toggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.makanankhas) {
                    showHomePage();
                } else if(itemId == R.id.minumankhas){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new MinumanKhas())
                            .commit();
                    getSupportActionBar().setTitle("Minuman Khas");
                } else {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new MakananFavorit())
                            .commit();
                    getSupportActionBar().setTitle("Makanan Favorit");
                }

                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    private void showHomePage() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new MakananKhas())
                .commit();

        getSupportActionBar().setTitle("Makanan Khas");
    }
}
