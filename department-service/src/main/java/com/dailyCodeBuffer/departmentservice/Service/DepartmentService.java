package com.dailyCodeBuffer.departmentservice.Service;

import com.dailyCodeBuffer.departmentservice.Entity.Department;
import com.dailyCodeBuffer.departmentservice.Repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("save department inside Service");
       return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentId) {
        log.info("getDepartmentById department inside Service");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
