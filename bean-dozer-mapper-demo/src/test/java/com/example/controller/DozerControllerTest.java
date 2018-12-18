package com.example.controller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sh 2018/12/18 9:15
 * @version ideaIU-2018.2.5.win
 */
public class DozerControllerTest {

    @Test
    public void main() {
        DozerController dozerController = new DozerController();
        dozerController.start();

    }

    @Test
    public void plat() {
        DozerController dozerController = new DozerController();
        dozerController.plat();
    }
}