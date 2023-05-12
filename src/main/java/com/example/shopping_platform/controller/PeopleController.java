package com.example.shopping_platform.controller;

import com.example.shopping_platform.service.ifs.PeopleService;
import com.example.shopping_platform.vo.ActiveRequest;
import com.example.shopping_platform.vo.ActiveResponse;
import com.example.shopping_platform.vo.RegisterRequest;
import com.example.shopping_platform.vo.RegisterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @PostMapping(value = "shopping_platform/register")
    public RegisterResponse register(@RequestBody RegisterRequest request){
        return peopleService.register(request);
    }
    @PostMapping(value = "shopping_platform/active")
    public ActiveResponse active(ActiveRequest request){
        return peopleService.active(request);
    }
}
