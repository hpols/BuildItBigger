package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.android.androidlibrary.JokerActivity;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements EndpointsAsyncTask.OnTaskCompleted {

    public MainActivityFragment() {
    }

    private Button jokeBt;
    public String retrievedJoke;
    private ProgressBar progressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        Context context = getActivity();

        progressBar = root.findViewById(R.id.progressbar);

        jokeBt = root.findViewById(R.id.joke_bt);
        jokeBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                new EndpointsAsyncTask(MainActivityFragment.this)
                        .execute(getActivity());
            }
        });
        return root;
    }

    @Override
    public void onTaskCompleted() {
        Intent getJokeintent = new Intent(getActivity(), JokerActivity.class);
        getJokeintent.putExtra(JokerActivity.JOKE_KEY, retrievedJoke);
        startActivity(getJokeintent);
        progressBar.setVisibility(View.GONE);
    }
}
