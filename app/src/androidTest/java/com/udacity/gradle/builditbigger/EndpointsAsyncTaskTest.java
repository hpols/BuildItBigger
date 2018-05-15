package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest  {

    @Test
    public void testDoInBackground() throws InterruptedException {
        EndpointsAsyncTask.tester = true;
        final CountDownLatch count = new CountDownLatch(1);

        new EndpointsAsyncTask(new EndpointsAsyncTask.OnTaskCompleted() {
            @Override
            public void onTaskCompleted() {
            count.countDown();
            }
        })
                .execute(InstrumentationRegistry.getContext());

        count.await(2000, TimeUnit.MILLISECONDS);
        EndpointsAsyncTask.tester = true;

        assert EndpointsAsyncTask.jokeRetrieved != null && !EndpointsAsyncTask.jokeRetrieved.isEmpty();

    }
}