package com.github.onuryanmis.jenkinstestproject.controller;

import com.github.onuryanmis.jenkinstestproject.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping
    public String home() {
        int sum = homeService.sum(5, 3);

        return homeService.welcome() + " Sum of 5 and 3 is " + sum;
    }
}
