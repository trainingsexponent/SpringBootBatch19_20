package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FileData;
import com.example.demo.repo.FileRepository;

@Service
public class FileServiceImpl implements FileService{

	@Autowired
	private FileRepository fileRepository;
	
	@Override
	public void addFile(FileData fileData) {
		// TODO Auto-generated method stub
		fileRepository.save(fileData);
	}

}
