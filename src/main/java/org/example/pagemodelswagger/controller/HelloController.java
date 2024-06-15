package org.example.pagemodelswagger.controller;

import org.example.pagemodelswagger.Dummy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
//import org.springframework.data.web.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/page-simple")
    public Page<String> pageSimple() {
        return pageImpl("test");
    }

//    @GetMapping("/paged-model-simple")
//    public PagedModel<String> pagedModelSimple() {
//        return pagedModel("test");
//    }

    @GetMapping("/page-raw")
    public Page pageRaw() {
        return pageSimple();
    }

//    @GetMapping("/paged-model-raw")
//    public PagedModel pagedModelRaw() {
//        return pagedModelSimple();
//    }

    @GetMapping("/page-complex")
    public Page<Dummy<List<String>>> pageComplex() {
        return pageImpl(new Dummy<>(List.of("test")));
    }

//    @GetMapping("/paged-model-complex")
//    public PagedModel<Dummy<List<String>>> pagedModelComplex() {
//        return pagedModel(new Dummy<>(List.of("test")));
//    }
//
//    private <T> PagedModel<T> pagedModel(T value) {
//        return new PagedModel<>(pageImpl(value));
//    }

    private <T> Page<T> pageImpl(T value) {
        return new PageImpl<>(List.of(value));
    }
}
