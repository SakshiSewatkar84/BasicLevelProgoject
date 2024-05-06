package com.StudetInfo.Services.IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudetInfo.Model.StudentModel;
import com.StudetInfo.Repository.StudentRepository;
import com.StudetInfo.Services.StudentServices;

@Service
public class StudentIMPL implements StudentServices {
@Autowired
StudentRepository studentRepository;
	@Override
	public StudentModel create(StudentModel studentModel) {
		return studentRepository.save(studentModel);
	}
	@Override
	public List<StudentModel> getallstudent() {
		return studentRepository.findAll();
	}
	@Override
	public StudentModel getstudentbyId(Integer id) {
		
		return studentRepository.findById(id).get();
	}
	@Override
	public StudentModel update(StudentModel studentModel) {
		return studentRepository.save(studentModel);
	}

}
