package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;
import android.text.TextUtils;

import org.junit.Test;
import org.w3c.dom.Text;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by ivanzhang on 1/14/18.
 */
public class EndpointsAsyncTaskTest {

    CountDownLatch countDownLatch = new CountDownLatch(1);

    @Test
    public void doInBackground() throws Exception {
        final EndpointsAsyncTask task = new EndpointsAsyncTask(){
            @Override
            protected String doInBackground(Void...voids) {
                return super.doInBackground(voids);
            }

            @Override
            protected void onPostExecute(String result) {
                boolean isEmptyOrNull = TextUtils.isEmpty(result);
                assertFalse(isEmptyOrNull);
                countDownLatch.countDown();
            }
        };

        Runnable runTask = new Runnable() {
            @Override
            public void run() {
                task.execute();
            }
        };

        runTask.run();
        countDownLatch.await(20, TimeUnit.SECONDS);
    }
}