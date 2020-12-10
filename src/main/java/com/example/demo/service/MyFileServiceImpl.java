package com.example.demo.service;

import com.example.demo.model.MyFile;
import com.example.demo.repository.MyFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MyFileServiceImpl implements  MyFileService{
    @Autowired
    MyFileRepository myFileRepository;
    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public Optional findById(Long id) {
        return Optional.empty();
    }

    @Override
    public MyFile save(MyFile myFile) {
        return myFileRepository.save(myFile);
    }


    @Override
    public void remove(Long id) {

    }
}
