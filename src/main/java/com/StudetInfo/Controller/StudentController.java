package com.StudetInfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudetInfo.Model.StudentModel;
import com.StudetInfo.Repository.StudentRepository;
import com.StudetInfo.Services.IMPL.StudentIMPL;
@RestController
public class StudentController {
	@Autowired
	StudentIMPL studentIMPL;
	
	@PostMapping("/student1")
	public StudentModel stop (@RequestBody StudentModel studentModel)
	{
		return studentIMPL.create(studentModel);
	}

	
	@GetMapping("/student")
	public Integer index(){
		return 123;
	}
	
	@GetMapping("/student2")
	public List<StudentModel> getstudent()
	{
		return studentIMPL.getallstudent();
	}
	
	@GetMapping("/{id}")
	public StudentModel getsingle(@PathVariable Integer id )
	{
		return studentIMPL.getstudentbyId(id);
	}
	
	@PutMapping("/update")
	public StudentModel updatestudent(@RequestBody StudentModel studentModel)
	{
	return studentIMPL.update(studentModel);	
	}

}
