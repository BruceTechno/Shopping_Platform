package com.example.shopping_platform.service.ifs;

import com.example.shopping_platform.vo.ActiveRequest;
import com.example.shopping_platform.vo.ActiveResponse;
import com.example.shopping_platform.vo.RegisterRequest;
import com.example.shopping_platform.vo.RegisterResponse;

public interface PeopleService {
    public RegisterResponse register (RegisterRequest request);
    public ActiveResponse active (ActiveRequest request);
}
