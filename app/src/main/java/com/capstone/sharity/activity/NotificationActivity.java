package com.capstone.sharity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.capstone.sharity.R;
import com.google.android.material.appbar.MaterialToolbar;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        //Controller
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.main_content);
        NavController navController = navHostFragment.getNavController();

        //Toolbar
        MaterialToolbar materialToolbar = findViewById(R.id.materialToolbar);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder()
                .setFallbackOnNavigateUpListener(() -> {
                    finish();
                    return true;
                }).build();
        NavigationUI.setupWithNavController(materialToolbar, navController, appBarConfiguration);
    }

}