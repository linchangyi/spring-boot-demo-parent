package com.lincy.springbootmybatis.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Student implements Serializable {
	
	private static final long serialVersionUID = -339516038496531943L;
	private int id;
	private String sno;
	private String name;

}
