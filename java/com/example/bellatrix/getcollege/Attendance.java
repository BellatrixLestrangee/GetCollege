package com.example.bellatrix.getcollege;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class Attendance extends AppCompatActivity {
    Fragment frag=null;
    FragmentTransaction fragmenttransaction;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.navigation_today:
                    mTextMessage.setText("Mark Attendance");
                                        return true;
                case R.id.navigation_semester:
                    mTextMessage.setText("This Semester");
                    Fragment fragment=new ItemFragment();
                    switchFragment(fragment);

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    public void switchFragment(Fragment fragment)
    {
    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(R.id.content, fragment);
        fragmenttransaction.commit();
    }
}
