package org.pragmaticqa.listener;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: Haroon Rasheed
 */

public class CuantoListenerTest {

    @Test
    public void passTest() throws Exception{
        Thread.sleep(3000);
        assertTrue(true);
    }

    @Test
    public void failTest() throws Exception{
        Thread.sleep(3000);
        assertTrue(false);
    }

    @Test (description = "DE1235")
    public void testWithDescription() throws Exception{
        Thread.sleep(3000);
        assertTrue(false);
    }

    @Test(parameters = "firefox2-windows")
    public void testWithParameter() throws Exception{
        Thread.sleep(3000);
        assertTrue(true);
    }
}
