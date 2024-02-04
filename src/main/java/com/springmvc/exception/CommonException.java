package com.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CommonException 
{
	@ExceptionHandler(RuntimeException.class)
	private ModelAndView hadleErrorCommon(Exception e) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("exception", new CategoryException());
		modelAndView.setViewName("errorCommon");
		return modelAndView;
	}

}
