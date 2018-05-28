package com.young.mvcwebdemo;

import com.young.mvcwebdemo.web.dao.UserRepo;
import com.young.mvcwebdemo.web.domian.Dog;
import com.young.mvcwebdemo.web.domian.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.awt.FontDescriptor;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MvcwebDemoApplicationTests {


    @Autowired
    private UserRepo userRepo;

    @Test
    public void contextLoads() {
        //保存用户
        User user = new User();
        user.setName("Lei");
        user.setAge(29);
        //dog
        Dog dog = new Dog();
        dog.setId("123");
        dog.setName("旺财");
        dog.setFood("bone");
        user.setDog(dog);
        userRepo.save(user);
        System.out.println("ok");
    }

}
