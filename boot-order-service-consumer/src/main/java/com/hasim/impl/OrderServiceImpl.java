package com.hasim.impl;

import bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.List;

/**
 * 1. 将服务提供者注册到注册中心（暴露服务）
 *      1) 导入dubbo依赖
 * 2. 让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("userId = " + userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);

        return addressList;
    }
}
