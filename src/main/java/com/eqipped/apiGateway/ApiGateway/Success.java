package com.eqipped.apiGateway.ApiGateway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Success {

    @RequestMapping("/error")
    public String homePage() {
        System.out.println("Request for home page");
        return "error";
    }
    @RequestMapping("/")
    public String aboutPage() {
        System.out.println("Request for about page");
        return "success";
    }
}
