package com.logitech.meetio.error;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);

	@ExceptionHandler({ EmptyResultDataAccessException.class })
	@ResponseBody
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public MyError exception(EmptyResultDataAccessException e) {
		logger.error(e.getLocalizedMessage());

		return new MyError(e.getLocalizedMessage());
	}

	@ExceptionHandler({ IOException.class })
	@ResponseBody
	@ResponseStatus(code = HttpStatus.FAILED_DEPENDENCY)
	public MyError exception(IOException e) {
		logger.error(e.getLocalizedMessage());

		return new MyError(e.getLocalizedMessage());
	}
	
	@ExceptionHandler({ MethodArgumentNotValidException.class })
	@ResponseBody
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public MyError exception(MethodArgumentNotValidException e) {
		logger.error(e.getLocalizedMessage());

		return new MyError(e.getLocalizedMessage());
	}
	
	@ExceptionHandler({ Exception.class })
	@ResponseBody
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public MyError exception(Exception e) {
		logger.error(e.getLocalizedMessage());

		return new MyError(e.getLocalizedMessage());
	}

}
