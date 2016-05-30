package com.yh.scaffold.controller.example;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yh.scaffold.service.example.ExampleService;

@Controller
@RequestMapping("/example")
public class ExampleController {
	private static final Logger logger = Logger.getLogger(ExampleController.class);
	
	@Autowired
	private ExampleService exampleService;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(HttpServletRequest request, ModelMap model){
		logger.info("test() - start");
		logger.info("-------id= "+request.getParameter("id"));
		Integer id = Integer.valueOf(request.getParameter("id"));
		model.addAttribute("model", exampleService.findById(id));
		
		logger.info("test() - end");
		return "/example/eg";
	}
}
