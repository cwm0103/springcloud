package com.cucheng.order.RestTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/msg")
    public String getMsg()
    {
        return "restTemplate cwm";
    }
}
