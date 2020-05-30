package com.arun.test;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	
	public User(String name, String dob, String age, String locality) {
		super();
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.locality = locality;
	}

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String dob;
	
	
	public String age;
	
	
	public String locality;

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}
	
	public List<String> getAllValues() {
		List<String> val = new ArrayList<String>();
		val.add(name);
		val.add(dob);
		val.add(age);
		val.add(locality);
		return val;
	}
	
	public String isValid() {
		if (name.equalsIgnoreCase("arun")) {
			return "TRUE";
		} else {
			return "FALSE";
		}
	}

}
