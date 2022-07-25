package com.capstone.sharity.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.capstone.sharity.R;
import com.capstone.sharity.activity.AccountActivity;
import com.capstone.sharity.activity.MainActivity;
import com.capstone.sharity.activity.NotificationActivity;
import com.google.android.material.appbar.MaterialToolbar;

public class MainBottomNavigationShopFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_bottom_navigation_shop, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

    }
}