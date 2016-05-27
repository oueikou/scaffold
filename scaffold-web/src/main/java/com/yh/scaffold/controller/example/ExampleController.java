package com.yh.scaffold.controller.example;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/example")
public class ExampleController {
	private static final Logger logger = Logger.getLogger(ExampleController.class);
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(HttpServletRequest request, ModelMap model){
		logger.info("test() - start");
		logger.info("-------"+request.getParameter("a"));
		model.addAttribute("model", request.getParameter("a"));
		logger.info("test() - end");
		return "/example/eg";
	}
}
