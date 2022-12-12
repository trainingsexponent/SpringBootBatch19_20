package com.extreme.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.extreme.finance.api.ApiEndpoint;
import com.extreme.finance.model.EmployeeDocument;
import com.extreme.finance.service.DocumentService;

public class EmployeeDocumentController {
	@Autowired
	private DocumentService documentService;
	
	@PostMapping(value =ApiEndpoint.ADDEMPLOYEEDOCUMENT )
	public String empDocument(@RequestBody EmployeeDocument employeeDocument) {
		System.out.println("In To Employee Controller:"+employeeDocument);
		documentService.addEmployeeDocumentData(employeeDocument);
		return "User Document Added Successfully...!";
		
	}
	@PutMapping(value = ApiEndpoint.UPDATEEMPDOCUMENT)
	public List<EmployeeDocument> getUpdateEmployeeDocumentData(@RequestBody EmployeeDocument employeeDocument) {
		return documentService.getUpdatedData(employeeDocument);

	}
	@DeleteMapping(value = ApiEndpoint.DELETEEMPDOCUMENT)
	public EmployeeDocument deletEmployeeDocumentDataUsingId(@PathVariable("id") int id) {
		return documentService.deleteEmployeeDocumentDataUsingId(id);
		
	}
	@GetMapping(value =ApiEndpoint.ALLEMPDOCUMENT)
	public List<EmployeeDocument> getAllEmmloyeeDocumentData() {
		return documentService.getAllData();
	}

}
