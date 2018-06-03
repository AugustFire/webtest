package com.young.mvcwebdemo.web.config;

import com.young.mvcwebdemo.web.CustomerApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Project: mvcweb-demo.
 * Author:YZX
 * Time:12:56 2018/6/3
 * Description:
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(CustomerApi.class);
    }

}
