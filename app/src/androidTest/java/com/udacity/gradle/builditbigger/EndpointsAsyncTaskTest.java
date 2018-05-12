package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Test
    public void testDoInBackground() throws InterruptedException {
        MainActivityFragment fragment = new MainActivityFragment();
        CountDownLatch count = new CountDownLatch(1);

        new EndpointsAsyncTask().execute(new Pair<>(fragment.getContext(), "joke"));

        count.await(2000, TimeUnit.MILLISECONDS);

        assert MainActivityFragment.retrievedJoke != null && !MainActivityFragment.retrievedJoke.isEmpty();
    }
}