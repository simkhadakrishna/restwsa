package com.krishna.restwsa;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.krishna.restwsa.model.Student;

@Path("/studentservice")
public interface StudentService {
	
	@Path("/students")
	@GET
	List<Student> getStudent();

}
