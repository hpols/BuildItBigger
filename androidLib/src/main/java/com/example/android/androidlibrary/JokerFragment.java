package com.example.android.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class JokerFragment extends Fragment {

    public JokerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_joker, container, false);

        Intent jokeIntent = getActivity().getIntent();
        String receivedJoke = jokeIntent.getStringExtra(JokerActivity.JOKE_KEY);
        TextView jokeTv = rootView.findViewById(R.id.joke_frag_tv);
        if (receivedJoke != null && receivedJoke.length() != 0) {
            jokeTv.setText(receivedJoke);
        }
        return rootView;
    }
}
