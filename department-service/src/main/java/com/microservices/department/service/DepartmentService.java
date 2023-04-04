//package com.microservices.department.service;
//
//import com.microservices.department.entity.Department;
//import com.microservices.department.repository.DepartmentRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@Service
//@Slf4j
//public class DepartmentService {
//    @Autowired
//    private DepartmentRepository departmentRepository;
//
//    public Department saveDepartment(@RequestBody Department department) {
//        log.info("Saved the Department Details");
//        return departmentRepository.save(department);
//    }
//
//    public Department findDepartmentByID(Long departmentId) {
//        log.info(" Getting the Department Details");
//        return departmentRepository.findByDepartmentId(departmentId);
//    }
//}
