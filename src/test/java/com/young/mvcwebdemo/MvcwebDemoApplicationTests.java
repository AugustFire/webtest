package com.young.mvcwebdemo;

import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.util.Date;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MvcwebDemoApplicationTests {



//
//    @Autowired
//    private UserRepo userRepo;
//
//    @Test
//    public void contextLoads() {
//        //保存用户
//        User user = new User();
//        user.setName("ZhaoLei");
//        user.setAge(99);
//        //dog
//        Dog dog = new Dog();
//        dog.setId("12312");
//        dog.setName("旺财");
//        dog.setFood("bone");
//        user.setDog(dog);
//        userRepo.save(user);
//        System.out.println(user);
//    }
//
    @Test
    public void testStr() {
        String dataStr = DateTime.now().toString("yyyyMMddHHmmss") + new Random().nextInt(1000);
        System.out.println(dataStr);
    }
//
//    @Test
//    public void testUser() {
//        User user = new User();
//        user.setAge(12);
//        user.setName("zzc");
//
//        Dog dog = user.getDog();
//        dog.setId("001");
//        dog.setName("小菜");
//        dog.setFood("bone");
//
//        user.setDog(dog);
//
//        System.out.println(user);
//
//    }

    @Test
    public void test123() {
    }

}
