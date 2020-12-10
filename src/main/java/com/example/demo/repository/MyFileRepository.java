package com.example.demo.repository;

import com.example.demo.model.MyFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MyFileRepository extends CrudRepository<MyFile,Long> {
}
