package com.extreme.finance.service;

import java.util.List;

import com.extreme.finance.model.EmployeeDocument;

public interface DocumentService {
	
	void addEmployeeDocumentData(EmployeeDocument employeeDocument);

	List<EmployeeDocument> getAllData();

	EmployeeDocument deleteEmployeeDocumentDataUsingId(int id);

	List<EmployeeDocument> getUpdatedData(EmployeeDocument employeeDocument);

}
