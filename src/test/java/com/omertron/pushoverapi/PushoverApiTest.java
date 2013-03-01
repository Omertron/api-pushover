/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omertron.pushoverapi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Stuart
 */
public class PushoverApiTest {
    private static final Logger LOG = LoggerFactory.getLogger(PushoverApiTest.class);
    private static final String APIKEY = "";

    public PushoverApiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        TestLogger.Configure();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAppToken method, of class PushoverApi.
     */
    @Test
    public void testGetAppToken() {
        LOG.info("getAppToken");
        PushoverApi instance = null;
        String expResult = "";
        String result = instance.getAppToken();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAppToken method, of class PushoverApi.
     */
    @Test
    public void testSetAppToken() {
        LOG.info("setAppToken");
        String appToken = "";
        PushoverApi instance = null;
        instance.setAppToken(appToken);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserToken method, of class PushoverApi.
     */
    @Test
    public void testGetUserToken() {
        LOG.info("getUserToken");
        PushoverApi instance = null;
        String expResult = "";
        String result = instance.getUserToken();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserToken method, of class PushoverApi.
     */
    @Test
    public void testSetUserToken() {
        LOG.info("setUserToken");
        String userToken = "";
        PushoverApi instance = null;
        instance.setUserToken(userToken);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDevice method, of class PushoverApi.
     */
    @Test
    public void testGetDevice() {
        LOG.info("getDevice");
        PushoverApi instance = null;
        String expResult = "";
        String result = instance.getDevice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDevice method, of class PushoverApi.
     */
    @Test
    public void testSetDevice() {
        LOG.info("setDevice");
        String device = "";
        PushoverApi instance = null;
        instance.setDevice(device);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class PushoverApi.
     */
    @Test
    public void testSendMessage_5args() throws Exception {
        LOG.info("sendMessage");
        String message = "";
        String title = "";
        String url = "";
        String urlTitle = "";
        Integer priority = null;
        PushoverApi instance = null;
        String expResult = "";
        String result = instance.sendMessage(message, title, url, urlTitle, priority);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class PushoverApi.
     */
    @Test
    public void testSendMessage_4args() throws Exception {
        LOG.info("sendMessage");
        String message = "";
        String title = "";
        String url = "";
        String urlTitle = "";
        PushoverApi instance = null;
        String expResult = "";
        String result = instance.sendMessage(message, title, url, urlTitle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class PushoverApi.
     */
    @Test
    public void testSendMessage_3args() throws Exception {
        LOG.info("sendMessage");
        String message = "";
        String title = "";
        String url = "";
        PushoverApi instance = null;
        String expResult = "";
        String result = instance.sendMessage(message, title, url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class PushoverApi.
     */
    @Test
    public void testSendMessage_String_String() throws Exception {
        LOG.info("sendMessage");
        String message = "";
        String title = "";
        PushoverApi instance = null;
        String expResult = "";
        String result = instance.sendMessage(message, title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class PushoverApi.
     */
    @Test
    public void testSendMessage_String() throws Exception {
        LOG.info("sendMessage");
        String message = "";
        PushoverApi instance = null;
        String expResult = "";
        String result = instance.sendMessage(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
