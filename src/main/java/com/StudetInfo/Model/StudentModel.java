package com.StudetInfo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )

	private Integer no;
	private String name;
	private String address;
	private String sbject;
	private Integer score;
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentModel(Integer no, String name, String address, String sbject, Integer score) {
		super();
		this.no = no;
		this.name = name;
		this.address = address;
		this.sbject = sbject;
		this.score = score;
	}
	@Override
	public String toString() {
		return "StudentModel [no=" + no + ", name=" + name + ", address=" + address + ", sbject=" + sbject + ", score="
				+ score + "]";
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSbject() {
		return sbject;
	}
	public void setSbject(String sbject) {
		this.sbject = sbject;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
}
