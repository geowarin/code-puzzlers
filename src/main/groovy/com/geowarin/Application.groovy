package com.geowarin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 *
 * Date: 18/05/2014
 * Time: 16:28
 * @author Geoffroy Warin (http://geowarin.github.io)
 */

@Controller
@EnableAutoConfiguration
@ComponentScan
public class Application {

    @RequestMapping('/')
    @ResponseBody
    String home() {
        'Hello World!';
    }

    static void main(String[] args) throws Exception {
        SpringApplication.run(Application, args);
    }
}