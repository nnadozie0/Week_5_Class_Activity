package com.example.fragmentbyruntime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        if(findViewById(R.id.fragment_container) != null)

        {
            if(savedInstanceState != null)
                return;
        }

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_One fragmentOne = new Fragment_One();
        fragmentTransaction.add(R.id.fragment_container, fragmentOne, null);
        fragmentTransaction.commit();


    }
}
