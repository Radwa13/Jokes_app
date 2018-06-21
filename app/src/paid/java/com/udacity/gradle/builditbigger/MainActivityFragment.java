package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import static com.example.displayjoke.DisplayJoke.JOKE_KEY;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    Button showJoke;
    View root;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_main, container, false);
        showJoke = (Button) root.findViewById(R.id.showJoke);


        showJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          new EndpointsAsyncTask(root).execute(getActivity().getApplicationContext() );

            }
        });
        return root;
    }


}
