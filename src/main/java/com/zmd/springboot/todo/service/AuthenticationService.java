package com.zmd.springboot.todo.service;

import com.zmd.springboot.todo.dto.request.RegisterRequest;

public interface AuthenticationService {

    void register(RegisterRequest registerRequest) throws Exception;
}
