package com.mgodak.sudoku;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.main_fragment) != null) {
            if (savedInstanceState != null) {
                return;
            }

            MenuFragment menu = new MenuFragment();
            menu.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.main_fragment, menu).commit();
        }
    }

}
