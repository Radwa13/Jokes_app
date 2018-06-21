package com.udacity.test;

import android.support.test.InstrumentationRegistry;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.assertTrue;

public class TestAsynk {


    private EndpointsAsyncTask endpointsAsyncTask;


    @Before
    public void setUpCounter() {
        endpointsAsyncTask = new EndpointsAsyncTask();
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
    assertTrue("joke is null", joke != null);
    assertTrue("joke is empty", !joke.isEmpty());


}

}
