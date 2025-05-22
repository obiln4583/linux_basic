package com.dailycodebuffer.Springboot.tutorial.Repository;

import com.dailycodebuffer.Springboot.tutorial.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentNameIgnoreCase(String departmentName);
   //public Department findDistinctFirstByDepartmentIdOrderByDepartmentNameAsc(Long departmentId);



}
