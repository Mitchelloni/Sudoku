package com.mgodak.sudoku.gui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.mgodak.sudoku.R;


public class MenuFragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        final Button menuBttn = (Button) view.findViewById(R.id.menu_bttn);
        final Button scoreBttn = (Button) view.findViewById(R.id.score_bttn);
        final Button scanBttn = (Button) view.findViewById(R.id.scan_bttn);
        menuBttn.setOnClickListener(this);
        scoreBttn.setOnClickListener(this);
        scanBttn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
         switch (v.getId()) {
             case R.id.menu_bttn:
                 Toast.makeText(getActivity(), "menu bttn", Toast.LENGTH_SHORT).show();
                 GameFragment game = new GameFragment();
                 FragmentTransaction transaction = getFragmentManager().beginTransaction();
                 transaction.replace(R.id.main_fragment, game);
                 transaction.addToBackStack(null);
                 transaction.commit();
                 break;

             case R.id.score_bttn:
                 Toast.makeText(getActivity(), "score bttn", Toast.LENGTH_SHORT).show();
                 break;

             case R.id.scan_bttn:
                 Toast.makeText(getActivity(), "scan bttn", Toast.LENGTH_SHORT).show();
                 break;
         }
    }

}
