package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import static jdk.internal.joptsimple.internal.Strings.isNullOrEmpty;

@RestController
public class SignUpController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/signup", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public SignUpResponse get(@RequestBody SignUpRequest request) {
        if (request.getName().isEmpty() == true || request.getName() == null) {
            return new SignUpResponse("invalid name entered");

        }
        if (request.getEmail() == null||request.getEmail().isEmpty() == true) {
            return new SignUpResponse("invalid name entered");
        }
        if (request.getPassword() == null||request.getPassword().isEmpty() == true) {
            return new SignUpResponse("invalid name entered");
        }
        else

        this.userRepository.save(new User(request.getName(), request.getEmail(), request.getPassword()));

        /*if (request.getName().equals("nitin kishore")) {
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
        }*/
    return new SignUpResponse("data inserted");
    }

}
