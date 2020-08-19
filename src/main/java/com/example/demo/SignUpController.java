package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class SignUpController {

    @RequestMapping(value = "/hello", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public SignUpResponse get(@RequestBody SignUpRequest request) {
        if (request.getName() == null) {
            return new SignUpResponse("invalid name entered");
        }

        if (request.getName().equals("nitin kishore")) {
            if (request.getEmail() == null)
            {
                return new SignUpResponse("invalid email");
            }
            else if (request.getEmail().equals("nitin.123048@gmail.com"))
            {
                if (!request.getPassword().equals("123456789"))
                {
                    return new SignUpResponse("invalid password");
                }
                else
                    return new SignUpResponse("authentication successfull");

            }
            return new SignUpResponse("hi nitin kishore");
        } else {
            return new SignUpResponse("hi neha kishore, bye neha kishore");
        }
    }
}
