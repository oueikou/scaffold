/**
 * Copyright (C) 2006-2012 Tuniu All rights reserved
 * Author: 
 * Date: Mon May 30 14:29:30 CST 2016
 * Description:
 */
package com.yh.scaffold.dao.example;

import java.util.List;

import com.yh.scaffold.entity.example.Example;

public interface ExampleDao {
    /**
     * deleteByPrimaryKey
     * @param Integer id
     * @return int 
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     * @param ExampleService record
     * @return int 
     */
    int insert(Example record);

    /**
     * insertSelective
     * @param ExampleService record
     * @return int 
     */
    int insertSelective(Example record);

    /**
     * selectByPrimaryKey
     * @param Integer id
     * @return Example 
     */
    Example selectByPrimaryKey(Integer id);

    /**
     * updateByPrimaryKeySelective
     * @param ExampleService record
     * @return int 
     */
    int updateByPrimaryKeySelective(Example record);

    /**
     * updateByPrimaryKey
     * @param ExampleService record
     * @return int 
     */
    int updateByPrimaryKey(Example record);
    
    List<Example> selectByParam(Example record);
}