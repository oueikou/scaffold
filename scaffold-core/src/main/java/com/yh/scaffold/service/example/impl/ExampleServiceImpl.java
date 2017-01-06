package com.yh.scaffold.service.example.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public PageInfo findPage(Example example, PageInfo pageInfo) {
		PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getOrderBy());
		List<Example> list = exampleDao.selectByParam(example);
		PageInfo<Example> page = new PageInfo(list);
		return page;
	}

}
