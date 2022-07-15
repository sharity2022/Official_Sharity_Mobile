package com.capstone.sharity.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.capstone.sharity.R;
import com.capstone.sharity.fragment.MainAccountFragment;
import com.capstone.sharity.fragment.MainNotificationsFragment;
import com.capstone.sharity.fragment.MainShareFragment;
import com.capstone.sharity.fragment.MainShopFragment;
import com.capstone.sharity.fragment.MainSupportFragment;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //Initialize Toolbar
    MaterialToolbar materialToolbar;

    //Initialize Navigation
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar
        materialToolbar = findViewById(R.id.materialToolbar);
        materialToolbar.setTitle("");
        setSupportActionBar(materialToolbar);

        //Navigation
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.shop);
        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new MainShopFragment()).commit();


        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.share:
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new MainShareFragment()).commit();
                    break;
                case R.id.shop:
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new MainShopFragment()).commit();
                    break;
                case R.id.support:
                    getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new MainSupportFragment()).commit();
                    break;
            }

            return true;
        });

        //amma motherfucking star boy
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_nav_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_notifications:
                getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new MainNotificationsFragment()).commit();
                break;
            case R.id.nav_account:
                getSupportFragmentManager().beginTransaction().replace(R.id.mainFrame, new MainAccountFragment()).commit();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}