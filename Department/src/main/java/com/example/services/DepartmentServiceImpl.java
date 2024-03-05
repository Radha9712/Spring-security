package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.DepartmentRepository;
import com.example.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	
	}

	public Department getDepartmentById(Long id) {
		
	Optional<Department> byId = departmentRepository.findById(id);
	Department department = byId.get();
		return department;
	}

	@Override
	public List<Department> findAllDepartment() {
		List<Department> all = departmentRepository.findAll();
		return all;
	}

	

}
