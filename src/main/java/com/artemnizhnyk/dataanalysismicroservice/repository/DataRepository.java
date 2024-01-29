package com.artemnizhnyk.dataanalysismicroservice.repository;

import com.artemnizhnyk.dataanalysismicroservice.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
