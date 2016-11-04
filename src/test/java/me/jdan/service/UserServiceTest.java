package me.jdan.service;

import me.jdan.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by jdan on 2016/11/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml", "classpath:spring-mybatis.xml"})
public class UserServiceTest {
    @Resource
    UserService userService;
    @Test
    public void insertTest() {
        User user = new User();
        user.setUserid(UUID.randomUUID().toString());
        user.setUsername("jdan");
        user.setPassword("jdan");
        userService.insertUser(user);
    }
}
