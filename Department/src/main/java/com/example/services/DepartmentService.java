package com.example.services;

import java.util.List;

import com.example.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public Department getDepartmentById(Long id);

	public List<Department> findAllDepartment();

}
