package org.example.pagemodelswagger.service;

import org.example.pagemodelswagger.entity.Dummy;
import org.example.pagemodelswagger.repository.DummyRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

    private final DummyRepository dummyRepository;

    public DummyService(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    public Page<Dummy> page() {
        return dummyRepository.findAll(PageRequest.ofSize(10));
    }
}
