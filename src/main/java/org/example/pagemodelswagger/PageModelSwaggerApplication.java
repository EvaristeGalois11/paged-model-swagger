package org.example.pagemodelswagger;

import org.example.pagemodelswagger.entity.Dummy;
import org.example.pagemodelswagger.repository.DummyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import java.util.UUID;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class PageModelSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PageModelSwaggerApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(DummyRepository dummyRepository) {
        return _ -> {
            dummyRepository.save(dummy());
            dummyRepository.save(dummy());
            dummyRepository.save(dummy());
        };
    }

    private Dummy dummy() {
        var dummy = new Dummy();
        dummy.setName(UUID.randomUUID().toString());
        return dummy;
    }
}
