package com.example.demo.model;

public class ExceptionResponse {

	private String errorMsg;
	
	private String urlApi;

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * @return the urlApi
	 */
	public String getUrlApi() {
		return urlApi;
	}

	/**
	 * @param urlApi the urlApi to set
	 */
	public void setUrlApi(String urlApi) {
		this.urlApi = urlApi;
	}

	@Override
	public String toString() {
		return "ExceptionResponse [errorMsg=" + errorMsg + ", urlApi=" + urlApi + "]";
	}
	
	
	
}
