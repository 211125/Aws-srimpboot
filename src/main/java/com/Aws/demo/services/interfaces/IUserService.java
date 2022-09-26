package com.Aws.demo.services.interfaces;

import com.Aws.demo.dto.request.CreateUserRequest;
import com.Aws.demo.dto.request.UpdateUserRequest;
import com.Aws.demo.dto.response.UserResponse;

import java.util.List;

public interface IUserService {

    UserResponse getUser(Long id);

    void create(CreateUserRequest request);

    List<UserResponse> list();

    void delete(Long id);

    UserResponse update(UpdateUserRequest request, Long id);
}
