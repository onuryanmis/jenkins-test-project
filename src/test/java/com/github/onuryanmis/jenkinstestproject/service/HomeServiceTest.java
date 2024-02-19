package com.github.onuryanmis.jenkinstestproject.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeServiceTest {

    @Test
    void welcome() {
        assertEquals("Welcome to Jenkins Test Project!", new HomeService().welcome());
    }

    @Test
    void sum() {
        assertEquals(8, new HomeService().sum(5, 3));
        assertEquals(0, new HomeService().sum(0, 0));
        assertEquals(-8, new HomeService().sum(-5, -3));
    }
}