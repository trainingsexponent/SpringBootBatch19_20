package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.Document;
import com.extreme.finance.model.EmployeeDocument;
import com.extreme.finance.repo.EmployeeDocumentRepository;
import com.extreme.finance.service.DocumentService;
@Service
public class EmployeeDocumentServiceImpl implements DocumentService{

	@Autowired
	private EmployeeDocumentRepository employeeDocumentRepository;
	@Override
	public void addEmployeeDocumentData(EmployeeDocument employeeDocument) {
		System.out.println("In To Buy Service Layer:"+employeeDocument);
		LocalDateTime date = LocalDateTime.now();
	    List<Document> dlist=employeeDocument.getEdocument();
	    for (Document doc : dlist) {
	    	doc.setDoccreateddate(date);
	    }
	    System.out.println(dlist);
		employeeDocumentRepository.save(employeeDocument);
		
	}

	@Override
	public List<EmployeeDocument> getAllData() {
		List<EmployeeDocument> elist= employeeDocumentRepository.findAll();
		return elist;
	}

	@Override
	public EmployeeDocument deleteEmployeeDocumentDataUsingId(int id) {
		EmployeeDocument employeeDocument= employeeDocumentRepository.findById(id).get();
		 employeeDocumentRepository.deleteById(id);
		 return employeeDocument;
	}

	@Override
	public List<EmployeeDocument> getUpdatedData(EmployeeDocument employeeDocument) {
		employeeDocumentRepository.save(employeeDocument);
		return (List<EmployeeDocument>)employeeDocumentRepository.findAll();
	}

}
