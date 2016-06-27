package com.yh.scaffold.service.example.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.scaffold.dao.example.ExampleDao;
import com.yh.scaffold.entity.example.Example;
import com.yh.scaffold.service.example.ExampleService;

@Service
public class ExampleServiceImpl implements ExampleService {

	@Autowired
	private ExampleDao exampleDao;
	
	public Example findById(Integer id) {
		return exampleDao.selectByPrimaryKey(id);
	}

}
