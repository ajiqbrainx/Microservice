package com.microservices.department.controller;

import com.microservices.department.entity.Department;
import com.microservices.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/departments", produces = {"application/json"})
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Saving the Department Details");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentByID(@PathVariable("id") Long departmentId) {
        log.info("Getting the department details based on ID");
        return departmentService.findDepartmentByID(departmentId);

    }

}
