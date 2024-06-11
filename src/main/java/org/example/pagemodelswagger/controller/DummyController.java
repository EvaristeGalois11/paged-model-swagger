package org.example.pagemodelswagger.controller;

import org.example.pagemodelswagger.entity.Dummy;
import org.example.pagemodelswagger.service.DummyService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummy")
public class DummyController {

    private final DummyService dummyService;

    public DummyController(DummyService dummyService) {
        this.dummyService = dummyService;
    }

    @GetMapping
    public Page<Dummy> get() {
        return dummyService.page();
    }
}
