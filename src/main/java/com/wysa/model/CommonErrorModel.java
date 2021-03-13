package com.wysa.model;

/*
 * Common error model to handle exceptions
 */
public class CommonErrorModel {

	private String errorCode;
	
	private String errorMessage;
	
	private String developerMessage;
	
	public CommonErrorModel(String errorCode, String errorMessage, String developerMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.developerMessage = developerMessage;
	}

	public CommonErrorModel(String errorMessage, String developerMessage) {
		this.errorMessage = errorMessage;
		this.developerMessage = developerMessage;
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}
	
	
}
