package com.example.controller;

import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * @author sh 2018/12/18 15:44
 * @version ideaIU-2018.2.5.win
 */
public class SmooksControllerTest {

    @Test
    public void start() throws IOException, SAXException {
        SmooksController smooksController = new SmooksController();
        smooksController.start();

    }

}