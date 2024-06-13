package org.example.pagemodelswagger.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.web.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/page")
    public Page<String> page() {
        return new PageImpl<>(List.of("one", "two", "three"));
    }

    @GetMapping("/paged-model")
    public PagedModel<String> pagedModel() {
        return new PagedModel<>(new PageImpl<>(List.of("one", "two", "three")));
    }
}
