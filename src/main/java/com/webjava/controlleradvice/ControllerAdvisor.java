package com.webjava.controlleradvice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.webjava.beans.ErrorResponseBean;
import com.webjava.customExceptions.FieldRequiredException;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public ResponseEntity<Object> handArrayIndexOutBountException(ArrayIndexOutOfBoundsException ex) {
		ErrorResponseBean errorResponseBean = new ErrorResponseBean();
		errorResponseBean.setError(ex.getMessage());
		List<String> details = new ArrayList<String>();
		details.add("Thieu data cua name va district ");
		errorResponseBean.setDetail(details);
		return new ResponseEntity<>(errorResponseBean, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(FieldRequiredException.class)
	public ResponseEntity<Object> handArrayIndexOutBountException(FieldRequiredException ex){
		ErrorResponseBean errorResponseBean = new ErrorResponseBean();
		errorResponseBean.setError(ex.getMessage());
		List<String> detalis =new ArrayList<String>();
		detalis.add("Thieu data cua name va district");
		errorResponseBean.setDetail(detalis);
		return new ResponseEntity<>(errorResponseBean, HttpStatus.SERVICE_UNAVAILABLE);
	}
}
