package com.student.dto;

public class Student {

    private String name;
    private String className;
    private String port;
 
     
    public Student(String name, String className) {
        super();
        this.name = name;
        this.className = className;
        this.port = port;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getClassName() {
        return className;
    }
 
    public void setClassName(String className) {
        this.className = className;
    }

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
}

