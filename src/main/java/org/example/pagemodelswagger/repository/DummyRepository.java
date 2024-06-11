package org.example.pagemodelswagger.repository;

import org.example.pagemodelswagger.entity.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<Dummy, Long>, PagingAndSortingRepository<Dummy, Long> {
}
