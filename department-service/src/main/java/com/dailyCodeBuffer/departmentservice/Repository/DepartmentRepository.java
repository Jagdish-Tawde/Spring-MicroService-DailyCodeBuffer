package com.dailyCodeBuffer.departmentservice.Repository;

import com.dailyCodeBuffer.departmentservice.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentId(Long departmentId);
}
