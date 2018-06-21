package com.udacity.test;

import android.support.test.InstrumentationRegistry;
import android.text.TextUtils;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestAsynk {


    private EndpointsAsyncTask endpointsAsyncTask;


    @Before
    public void setUpCounter() {
        endpointsAsyncTask = new EndpointsAsyncTask(null);
    }

@Test
    public void testAsynk(){

    endpointsAsyncTask.execute(InstrumentationRegistry.getTargetContext());
    String joke= null;
    try {
        joke = endpointsAsyncTask.get();
    } catch (InterruptedException e) {
        e.printStackTrace();
    } catch (ExecutionException e) {
        e.printStackTrace();
    }
    assertFalse("Joke is Empty", TextUtils.isEmpty(joke));


}

}
