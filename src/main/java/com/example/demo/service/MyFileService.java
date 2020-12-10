package com.example.demo.service;

import com.example.demo.model.MyFile;

import java.util.Optional;

public interface MyFileService {
    Iterable<MyFile> findAll();

    Optional<MyFile> findById(Long id);

    MyFile save(MyFile myFile);

    void remove(Long id);
}
