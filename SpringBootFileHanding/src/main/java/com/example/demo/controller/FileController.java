package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.FileData;
import com.example.demo.service.FileService;

@RestController
public class FileController {

	@Autowired
	private FileService fs;
	
	@PostMapping(value = "/addFile")
	public String fileDataToStore(@RequestPart MultipartFile file,@RequestPart String name) throws IOException {
		System.out.println(file.getOriginalFilename() + "  " + name);
		FileData fileData =  new FileData();
		fileData.setFname(file.getOriginalFilename());
		fileData.setFdata(file.getBytes());
		fs.addFile(fileData);
		return "File Store In DB...!";
	}
}
