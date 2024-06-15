package org.example.pagemodelswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
//@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.DIRECT)
public class PageModelSwaggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PageModelSwaggerApplication.class, args);
    }
}
