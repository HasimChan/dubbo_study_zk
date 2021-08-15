package com.hasim.impl;

import bean.UserAddress;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.Arrays;
import java.util.List;

@DubboService
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "广州市", "1", "hasim", "13143340749", "aa");
        UserAddress address2 = new UserAddress(2, "广州市", "2", "hasimchan", "13143340749", "aa");

        return Arrays.asList(address1, address2);
    }
}
