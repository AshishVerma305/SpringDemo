package com.example.springsession.service.impl;

import com.example.springsession.dto.MyRequestDTO;
import com.example.springsession.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public UserServiceImpl()
    {
        System.out.println("inside UserService PostConstructor");

    }

    @Override
    public boolean updateEmployee(MyRequestDTO request, String id) {
        System.out.println("inside User Service"+ request+"inside user id"+id);
        return false;
    }
}
