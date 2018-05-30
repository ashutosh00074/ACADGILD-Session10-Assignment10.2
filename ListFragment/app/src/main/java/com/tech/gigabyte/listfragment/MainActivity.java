package com.tech.gigabyte.listfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements
        ListFragment.OnItemSelectedListener {

    /**
     * Called when the activity is first created.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onRssItemSelected(String link) {
        // TODO Auto-generated method stub

        // get an instance of FragmentTransaction from your Activity

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        Layout1 layout1; // Fragment 1
        Layout2 layout2; // Fragment 2
        Layout3 layout3; // Fragment 3
        Layout4 layout4; // Fragment 4

        //Logic For FragmentTransaction

        if (link.equals("layout1")) {
            layout1 = new Layout1();
            fragmentTransaction.replace(R.id.detailFragment, layout1);
            fragmentTransaction.commit();
        } else if (link.equals("layout2")) {
            layout2 = new Layout2();
            fragmentTransaction.replace(R.id.detailFragment, layout2);
            fragmentTransaction.commit();
        } else if (link.equals("layout3")) {
            layout3 = new Layout3();
            fragmentTransaction.replace(R.id.detailFragment, layout3);
            fragmentTransaction.commit();
        } else if (link.equals("layout4")) {
            layout4 = new Layout4();
            fragmentTransaction.replace(R.id.detailFragment, layout4);
            fragmentTransaction.commit();
        }
    }
}