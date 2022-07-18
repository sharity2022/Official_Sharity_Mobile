package com.capstone.sharity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.capstone.sharity.R;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Controller
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.main_content);
        NavController navController = navHostFragment.getNavController();

        //Toolbar
        MaterialToolbar materialToolbar = findViewById(R.id.materialToolbar);
        materialToolbar.inflateMenu(R.menu.main_toolbar_menu);
        materialToolbar.setOnMenuItemClickListener(item -> {

            switch (item.getItemId()){
                case R.id.mainToolbarNotificationsActivity:
                    Intent notification = new Intent(MainActivity.this, NotificationActivity.class);
                    startActivity(notification);
                    break;
                case R.id.mainToolbarAccountActivity:
                    Intent account = new Intent(MainActivity.this, NotificationActivity.class);
                    startActivity(account);
                    break;
                default:
                    break;
            }

            return true;
        });
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.mainBottomNavigationShareFragment,
                R.id.mainBottomNavigationShopFragment,
                R.id.mainBottomNavigationSupportFragment
        ).build();
        NavigationUI.setupWithNavController(materialToolbar, navController, appBarConfiguration);

        //Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}