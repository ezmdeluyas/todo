package com.zmd.springboot.todo.service;

import com.zmd.springboot.todo.dto.request.AuthenticationRequest;
import com.zmd.springboot.todo.dto.request.RegisterRequest;
import com.zmd.springboot.todo.dto.response.AuthenticationResponse;

public interface AuthenticationService {

    void register(RegisterRequest input) throws Exception;

    AuthenticationResponse login(AuthenticationRequest request);
}
