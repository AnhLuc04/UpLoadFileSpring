package com.example.demo.controller;

import java.io.File;

import com.example.demo.model.MyFile;
import com.example.demo.service.MyFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class BaseController {
    @Autowired
    MyFileService myFileService;
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("myFile", new MyFile());
        return "index";
    }
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String uploadFile(@ModelAttribute("myFile") MyFile myFile,@Param("multipartFile")MultipartFile multipartFile, Model model) {
        try {
             multipartFile = myFile.getMultipartFile();
            String fileName = multipartFile.getOriginalFilename();
            MyFile myFile1 = new MyFile();
            myFile1.setMultipartFile(multipartFile);
            myFile1.setAvatar(fileName);
            myFile1.setDescription(myFile.getDescription());
            myFileService.save(myFile1);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "Upload failed");
        }
        return "result";
    }
}