package com.capstone.sharity.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.capstone.sharity.fragment.AccountOrderHistoryFragment;
import com.capstone.sharity.fragment.AccountOrderInProgressFragment;

public class AccountOrderViewPagerAdapter extends FragmentPagerAdapter {

    public AccountOrderViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
            fragment = new AccountOrderInProgressFragment();
        else if (position == 1)
            fragment = new AccountOrderHistoryFragment();

        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
            title = "In Progress";
        else if (position == 1)
            title = "History";
        return title;
    }
}
