package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FileData;

@Repository
public interface FileRepository extends JpaRepository<FileData, Integer>{

}
