package com.example.demo.model;

import java.io.Serializable;

import lombok.Data;
import org.springframework.data.annotation.Transient;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
public class MyFile  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long ID;
//    @Transient
//    private MultipartFile multipartFile;

    @javax.persistence.Transient
    private MultipartFile multipartFile;
    private String description;
    private String avatar;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
