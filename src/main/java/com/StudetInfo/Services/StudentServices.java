package com.StudetInfo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudetInfo.Model.StudentModel;

@Service
public interface StudentServices {
	public StudentModel create (StudentModel studentModel);
	public List<StudentModel> getallstudent();
	
	public StudentModel getstudentbyId(Integer id);
	public StudentModel update(StudentModel studentModel);

}
