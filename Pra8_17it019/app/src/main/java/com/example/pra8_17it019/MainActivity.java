package com.example.pra8_17it019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button FirstFragment,SecondFragment,ThirdFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstFragment=findViewById(R.id.firstFragment);
        SecondFragment=findViewById(R.id.secondFragment);
        ThirdFragment=findViewById(R.id.thirdFragment);
        FirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FirstFragment firstFragment = new FirstFragment();
                fragmentTransaction.add(R.id.frameLayout,firstFragment);
                fragmentTransaction.commit();
            }
        });
        SecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SecondFragment secondFragment = new SecondFragment();
                fragmentTransaction.add(R.id.frameLayout,secondFragment);
                fragmentTransaction.commit();

            }
        });
        ThirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ThirdFragment thirdFragment = new ThirdFragment();
                fragmentTransaction.add(R.id.frameLayout,thirdFragment);
                fragmentTransaction.commit();
            }
        });

    }
}
