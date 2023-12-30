package com.example.studentInfo.first;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	 
	private List<Student> list = new ArrayList<>();
	
      public StudentService(){
    	  System.out.println("service layer is created");
    	  list.add(new Student(1,"purna"));
    	  list.add(new Student(2,"puri"));
    	  list.add(new Student(3,"kruthiventi"));
    	  
      }
      public List<Student> getAllTheStudents(){
    	  return list;
      }
      public Student singleStudent(int id) {
    	  for(Student s:list) {
    		  if(s.getId()==id) {
    			  return s;
    		  }
    	  }
    	  return null;
      }
      public void saveStudnet(Student student) {
    	  this.list.add(student);
      }
      public void updateStudent(Student student) {
    	  for(Student s:list) {
    		  if(s.getId()==student.getId()) {
    			  s.setName(student.getName());
    		  }
    	  }
      }
      public void deleteStudent(int id) {
    	  list.remove(id);
      }
      
}
