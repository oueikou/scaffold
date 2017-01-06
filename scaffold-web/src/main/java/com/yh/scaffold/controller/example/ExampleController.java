package com.yh.scaffold.controller.example;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageInfo;
import com.yh.scaffold.entity.example.Example;
import com.yh.scaffold.service.example.ExampleService;

@Controller
@RequestMapping("/example")
public class ExampleController {
	private static final Logger logger = Logger.getLogger(ExampleController.class);
	
	@Autowired
	private ExampleService exampleService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(HttpServletRequest request, ModelMap model){
		logger.info("test() - start");
		logger.info("-------id= "+request.getParameter("id"));
		Integer id = Integer.valueOf(request.getParameter("id"));
		model.addAttribute("model", exampleService.findById(id));
		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageNum(1);
		pageInfo.setPageSize(10);
		pageInfo.setOrderBy("id asc");
		pageInfo = exampleService.findPage(null, pageInfo);
		List<Example> list = pageInfo.getList();
		for (Example example : list) {
			logger.info(example.getName());
		}
		logger.info("test() - end");
		return "/example/eg";
	}
}
