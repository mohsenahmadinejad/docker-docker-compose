package com.mohsen.dockerdockecompose;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class HelloController {


@Value("${my-name}")
private String myName;
@Value("${my-job}")
private String myJob;


    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/hello")
    public List<String> hello(){
        List<String> list=new ArrayList<>();
        list.add("hello - Docker");
        list.add("my name is: "+myName);
        list.add("my job is:: "+myJob);
        logger.error("my name is: {}",myName);
        logger.error("my job is: {}",myJob);
        return list ;
    }
}
