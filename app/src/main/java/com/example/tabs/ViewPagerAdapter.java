package com.example.tabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tabs.fragments.Animal_Fragment;
import com.example.tabs.fragments.Fungi_Fragment;
import com.example.tabs.fragments.Protista_Fragment;
import com.example.tabs.fragments.Vegetal_Fragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Animal_Fragment();
            case 1:
                return new Vegetal_Fragment();
            case 2:
                return new Fungi_Fragment();
            case 3:
                return new Protista_Fragment();
            case 4:
                return new Fungi_Fragment();
            default:
                return new Animal_Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
