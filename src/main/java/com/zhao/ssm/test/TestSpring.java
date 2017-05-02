package com.zhao.ssm.test;

/**
 * Created by zhao on 2017/3/29.
 */
import com.zhao.ssm.bean.User;
import com.zhao.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-*.xml" })
public class TestSpring {

    @Autowired
    private UserService userService;

    @Test
    public void testUser(){
        User user = new User();
        user.setBirthday(new Date());
        user.setUname("jim");
        user.setUpasswd("jjim");
        user.setAddress("lincheng_yageing");
        user.setIp("1.1.2.3");
        userService.saveUser(user);

    }
}