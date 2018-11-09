package com.kevinfsjoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @RequestMapping("/profile")
    public String profile() {
        return "I'am Colros, the author of whis web";
    }
}
