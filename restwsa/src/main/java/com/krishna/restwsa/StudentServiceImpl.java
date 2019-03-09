package com.krishna.restwsa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.krishna.restwsa.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	Map<Long, Student> students = new HashMap<>();
	long currentId = 123;
	
	public StudentServiceImpl() {
		init();
	}

	private void init() {
		Student student = new Student();
		
		student.setId(currentId);
		student.setName("David");
		students.put(student.getId(), student);
	}

	@Override
	public List<Student> getStudent() {
		Collection<Student> results = students.values();
		List<Student> response = new ArrayList<>(results);
		return response;
	}

}
