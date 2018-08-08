package com.tydic.dubbo.model.user;

import java.io.Serializable;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/8/2 10:55
 */
public class User implements Serializable {

	private Integer id;

	private String name;

	private String gender;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
