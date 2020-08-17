package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;


@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public HelloWorldResponse get(@RequestBody HelloWordRequest request) {
        if (request.getName() == null) {
            return new HelloWorldResponse("invalid request entered on git hub");
        }

        if (request.getName().equals("nitin")) {
            return new HelloWorldResponse("hi nitin");
        } else {
            return new HelloWorldResponse("hi neha");
        }
    }
}
