package com.example.frag;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v)
    {

            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.add(R.id.f1,new frag1());
            Toast.makeText(this, "Fragment is added!!!!!!", Toast.LENGTH_SHORT).show();
            ft.addToBackStack(null);
            ft.commit();
    }

    public void delete(View v)
    {

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(fm.getBackStackEntryCount()>0) {
            fm.popBackStack();
            Toast.makeText(this, "Fragment is deleted!!!!!!", Toast.LENGTH_SHORT).show();
        }

        ft.commit();
    }

    public void replace(View v)
    {

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.f1,new frag2());
        Toast.makeText(this, "Fragment is replaced!!!!!!", Toast.LENGTH_SHORT).show();
        ft.addToBackStack(null);
        ft.commit();
    }


}
