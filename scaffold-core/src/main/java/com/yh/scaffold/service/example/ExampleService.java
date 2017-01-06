package com.yh.scaffold.service.example;

import com.github.pagehelper.PageInfo;
import com.yh.scaffold.entity.example.Example;

public interface ExampleService {
	public Example findById(Integer id);
	
	@SuppressWarnings("rawtypes")
	public PageInfo findPage(Example example, PageInfo pageInfo);
}
