package com.capstone.sharity.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.capstone.sharity.R;
import com.capstone.sharity.adapter.AccountOrderViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class AccountOrderFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account_order, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TabLayout tabLayout = view.findViewById(R.id.tabLayoutOrder);
        ViewPager viewPager = view.findViewById(R.id.viewPagerOrder);

        AccountOrderViewPagerAdapter accountOrderViewPagerAdapter = new AccountOrderViewPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(accountOrderViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}