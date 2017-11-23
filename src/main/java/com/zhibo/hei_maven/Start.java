package com.zhibo.hei_maven;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@MapperScan("com.zhibo.hei_maven.mybatis")
@SpringBootApplication
public class Start
{
    public static void main(String[] args)
    {
        ApplicationContext ac = SpringApplication.run(Start.class , args);
    }
}
