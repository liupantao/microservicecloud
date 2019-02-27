package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class Application
{
    public static void main( String[] args )

    {
        System.out.println("--分支测试备注2--123");
        SpringApplication.run(Application.class,args);
    }
}
