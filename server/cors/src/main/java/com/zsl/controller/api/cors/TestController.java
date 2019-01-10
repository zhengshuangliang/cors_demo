package com.zsl.controller.api.cors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@RequestMapping(value = "/api/cors/hello", method = RequestMethod.GET)
    public String hello(){
        return  "Hello Test Cors API";
    }

}
