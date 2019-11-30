package com.sch.dubbouser.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sch.dubbobase.service.UserService;

/**
 * @Description: user服务具体实现
 * @Author: SCH
 * @Date: 2019/11/22 15:04
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String Hello(String name) {
        return "Hello World Dubbo " + name;
    }
}
