package com.young.mvcwebdemo.web.dao;

import com.young.mvcwebdemo.web.domian.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {
}
