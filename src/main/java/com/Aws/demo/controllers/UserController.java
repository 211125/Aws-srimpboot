package com.Aws.demo.controllers;

import com.Aws.demo.dto.request.CreateUserRequest;
import com.Aws.demo.dto.request.UpdateUserRequest;
import com.Aws.demo.dto.response.UserResponse;
import com.Aws.demo.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService service;

    @GetMapping("{id}")
    public UserResponse get(@PathVariable Long id) {
        return service.getUser(id);
    }

    @GetMapping("list")
    public List<UserResponse> list() {
        return service.list();
    }

    @PostMapping
    public void create(@RequestBody CreateUserRequest request) {
        service.create(request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("{id}")
    public UserResponse update(@PathVariable Long id,
                               @RequestBody UpdateUserRequest request) {
        return service.update(request, id);
    }
}
