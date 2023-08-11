package edu.miu.swe.eregistrar.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(value = {
            "/",
            "/home"
    })
    public String homePage() {
        return "home/index";
    }

}
