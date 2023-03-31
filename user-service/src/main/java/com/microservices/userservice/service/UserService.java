package com.microservices.userservice.service;

import com.microservices.userservice.VO.Department;
import com.microservices.userservice.VO.ResponseTemplateVO;
import com.microservices.userservice.entity.User;
import com.microservices.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("saved the user details");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        User user= userRepository.findByUserId(userId);
        log.info("Getting the user details with department");
        Department department =
                restTemplate.getForObject("Http://localhost:9001/departments/" + user.getDepartmentId(), Department.class);
        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);
        return responseTemplateVO;

    }
}
