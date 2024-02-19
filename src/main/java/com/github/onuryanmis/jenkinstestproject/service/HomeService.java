package com.github.onuryanmis.jenkinstestproject.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String welcome() {
        return "Welcome to Jenkins Test Project!";
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
