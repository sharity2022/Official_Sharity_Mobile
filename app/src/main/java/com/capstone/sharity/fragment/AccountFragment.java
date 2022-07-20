package com.capstone.sharity.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.capstone.sharity.R;
import com.google.android.material.navigation.NavigationView;

public class AccountFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavigationView navigationView = view.findViewById(R.id.navigationViewAccount);
        navigationView.setNavigationItemSelectedListener(item -> {
            switch(item.getItemId()){
                case R.id.menuProfile:
                    //Navigate to AccountProfileFragment
                    NavDirections profile = AccountFragmentDirections.actionAccountFragmentToAccountProfileFragment();
                    Navigation.findNavController(view).navigate(profile);
                    break;
                case R.id.menuPassword:
                    NavDirections password = AccountFragmentDirections.actionAccountFragmentToAccountChangePasswordFragment();
                    Navigation.findNavController(view).navigate(password);
                    break;
                case R.id.menuContactAddress:
                    NavDirections contactAddress = AccountFragmentDirections.actionAccountFragmentToAccountContactAddressFragment();
                    Navigation.findNavController(view).navigate(contactAddress);
                    break;
                case R.id.menuOrder:
                    NavDirections order = AccountFragmentDirections.actionAccountFragmentToAccountOrderFragment();
                    Navigation.findNavController(view).navigate(order);
                    break;
                case R.id.menuLogout:
                    break;
            }

            return true;
        });
    }

}