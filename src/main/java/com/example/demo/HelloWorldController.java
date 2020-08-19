package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;


@RestController
public class HelloWorldController {

    @Autowired
    private SimpleEmailSender emailSender;

    @RequestMapping(value = "/hello", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public HelloWorldResponse get(@RequestBody HelloWordRequest request) {
        if (request.getName() == null) {
            return new HelloWorldResponse("invalid request entered on git hub");
        }

        emailSender.sendSimpleEmail();

        if (request.getName().equals("nitin kishore")) {
            return new HelloWorldResponse("hi nitin kishore");
        } else {
            return new HelloWorldResponse("hi neha kishore, bye neha kishore");
        }

    }
}
