package com.sch.dubboadmin.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.sch.dubbobase.service.AdminService;
import com.sch.dubbobase.service.UserService;

/**
 * @Description: TODO
 * @Author: SCH
 * @Date: 2019/11/22 17:00
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Reference
    private UserService userService;

    @Override
    public String Hello(String name) {

        return userService.Hello(name) + "\nHello Admin " + name;
    }
}
