/*
 *      Copyright (c) 2013-2016 Stuart Boston
 *
 *      This file is part of the Pushover API.
 *
 *      The Pushover API is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation, either version 3 of the License, or
 *      any later version.
 *
 *      The Pushover API is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *
 *      You should have received a copy of the GNU General Public License
 *      along with the Pushover API.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.omertron.pushoverapi;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PushoverApiTest {

    private static final Logger LOG = LoggerFactory.getLogger(PushoverApiTest.class);
    private static final String API_KEY = "wzlYTySq1yg3mhz4WiKHFVSFSX7kHO";
    private PushoverApi pushover = new PushoverApi(API_KEY, API_KEY, API_KEY);

    public PushoverApiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        TestLogger.configure();
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
    public void testSendMessage_2args() throws Exception {
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
    public void testSendMessage_1arg() throws Exception {
        LOG.info("sendMessage");
        String message = "";
        PushoverApi instance = null;
        String expResult = "";
        String result = instance.sendMessage(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPropertiesSave() {
    }

    @Test
    public void testPropertiesLoad() {
    }
}
