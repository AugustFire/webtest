package com.young.mvcwebdemo.web;


import com.young.mvcwebdemo.web.domian.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kingsilk/user")
public class UseApi {

    @GetMapping("/info/{value}")
    public User getUserInfo(@PathVariable(value = "value") int value) {
        User user = new User();
        user.setAge(Integer.valueOf(value));
        user.setName("rock");
        return user;
    }
}
