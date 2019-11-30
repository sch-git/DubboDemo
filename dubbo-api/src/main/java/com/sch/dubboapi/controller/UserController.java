package com.sch.dubboapi.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sch.dubbobase.service.AdminService;
import com.sch.dubbobase.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: SCH
 * @Date: 2019/11/22 15:27
 */
@RestController
public class UserController {
    @Reference
    private UserService userService;
    @Reference
    private AdminService adminService;

    @GetMapping("/user")
    public String user(@RequestParam(name = "name") String name) {
        return userService.Hello(name);
    }

    @GetMapping("/admin")
    public String admin(@RequestParam(name = "name") String name) {
        return adminService.Hello(name);
    }
}
