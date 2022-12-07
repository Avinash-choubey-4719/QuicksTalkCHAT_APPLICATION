package com.avinash.quicktalks.adapters;

import android.icu.text.Transliterator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.avinash.quicktalks.fragments.CallsFragment;
import com.avinash.quicktalks.fragments.ChatsFragment;
import com.avinash.quicktalks.fragments.StatusFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {


    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new ChatsFragment();

            case 1: return new StatusFragment();

            case 2: return new CallsFragment();

            default: return new ChatsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;
        if(position == 0){
            title = "CHATS";
        }
        if(position == 1){
            title = "NOTIFICATION";
        }
        if(position == 2){
            title = "PROFILE";
        }

        return title;
    }
}
