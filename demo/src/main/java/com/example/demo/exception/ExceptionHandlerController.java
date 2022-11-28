package com.example.demo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.ExceptionResponse;

@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(EmployeeNotFound.class)
	public @ResponseBody ExceptionResponse handleException(EmployeeNotFound exFound,HttpServletRequest request) {
		
		ExceptionResponse response = new ExceptionResponse();
		response.setErrorMsg(exFound.getMessage());
		response.setUrlApi(request.getRequestURI());
		return response;
	}
	
}
