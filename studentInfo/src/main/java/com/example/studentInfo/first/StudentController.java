package com.example.studentInfo.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
   public class StudentController {
	
	@Autowired
    private StudentService studentservice;
	@RequestMapping(value="/students")
	public List<Student> getStudents(){
		return studentservice.getAllTheStudents();
	}
	@RequestMapping(value="/students/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentservice.singleStudent(id);
	}
	@RequestMapping(value="/save_studet",method=RequestMethod.POST)
	public void saveTheStudent(@RequestBody Student student) {
		 studentservice.saveStudnet(student);
	}
	@RequestMapping(value="/update_student",method=RequestMethod.PUT)
	public void updateTheStudent(@RequestBody Student student) {
		studentservice.updateStudent(student);
	}
	@RequestMapping(value="delete_student",method=RequestMethod.DELETE)
	public void deleteTheStudent(int id) {
		studentservice.deleteStudent(id);
	}
}
