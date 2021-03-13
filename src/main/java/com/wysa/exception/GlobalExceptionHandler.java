package com.wysa.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.wysa.model.CommonErrorModel;

/*
 * Global Error Handler for handling errors
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	private static final Logger LOGGER =  LoggerFactory.getLogger(GlobalExceptionHandler.class);
	/*
	 * Handler for MethodArgumemtNotValidException
	 * @param httprequest
	 * @param the exception
	 * @return CommonErrorModel encapsulating user friendly message
	 */
	@ResponseBody
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public CommonErrorModel handleValidationException(HttpServletRequest req, Exception exception) {
		LOGGER.error("Validation Error", exception);
		MethodArgumentNotValidException argumentNotValidException = (MethodArgumentNotValidException) exception;
		return new CommonErrorModel(ErrorCodes.VALIDATION_FAILURE.toString(),
				argumentNotValidException.getMessage(),
				"Validation Failed due to incorrect json");
	}
}
