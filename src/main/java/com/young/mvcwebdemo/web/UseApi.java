package com.young.mvcwebdemo.web;


import com.young.mvcwebdemo.web.domian.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kingsilk/user")
public class UseApi {

    @GetMapping("/info/{value}")
    public String getUserInfo(@PathVariable(value = "value") int value) {
/*        User user = new User();
        user.setAge(Integer.valueOf(value));
        user.setName("rock");
        return user;*/
        System.out.println(value);
/*        return "<html>\n" +
                "<title>HTML</title>\n" +
                "<style type=\"text/css\">\n" +
                "<!--\n" +
                ".STYLE1 {\n" +
                " font-family: \"宋体\";\n" +
                " font-size: 40;\n" +
                "}\n" +
                ".body1{text-decoration: underline;} \n" +
                "-->\n" +
                "</style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "<p class=\"STYLE1\"><strong>我</strong>    <em>的</em><strong><font class=\"body1\">第</font></strong><br />一个HTML程序\n" +
                "</p>\n" +
                "</body>\n" +
                "</html>";*/
                return "<strong>123</strong>";
    }
}
