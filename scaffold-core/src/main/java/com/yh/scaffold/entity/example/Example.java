/**
 * Copyright (C) 2006-2012 Tuniu All rights reserved
 * Author: 
 * Date: Mon May 30 14:29:30 CST 2016
 * Description:
 */
package com.yh.scaffold.entity.example;

import java.io.Serializable;

/**
 *  Example
 *  example
 */
public class Example implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6218524665903392701L;

	/**
     * 主键
     * example.id
     */
    private Integer id;

    /**
     * 名称
     * example.name
     */
    private String name;

    /**
     * @return example.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param Integer id (example.id )
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return example.name
     */
    public String getName() {
        return name;
    }

    /**
     * @param String name (example.name )
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}