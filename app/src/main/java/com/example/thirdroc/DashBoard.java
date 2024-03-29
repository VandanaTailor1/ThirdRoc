package com.example.thirdroc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashBoard extends AppCompatActivity {
         BottomNavigationView btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        btn=findViewById(R.id.bottom);
        loadFragment(new HomeFragment());
        btn.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                  if(item.getItemId()==R.id.home)
                  {
                      loadFragment(new HomeFragment());
                      Log.d("Home", "onNavigationItemSelected: "+"H OME");

                  }
                  else   if(item.getItemId()==R.id.transaction)
                  {
                      loadFragment(new HomeFragment());
                      Log.d("Home", "onNavigationItemSelected: "+"Transaction");

                  }
                  else   if(item.getItemId()==R.id.emi)
                  {
                      loadFragment(new HomeFragment());
                      Log.d("Home", "onNavigationItemSelected: "+"Emi");

                  }
                  else   if(item.getItemId()==R.id.account)
                  {
                      loadFragment(new HomeFragment());
                      Log.d("Home", "onNavigationItemSelected: "+"Account");

                  }


                return false;
            }
        });
    }
    private void loadFragment(Fragment fragment){
        FragmentManager fm=  getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,fragment);
        fragmentTransaction.commit();
    }
}