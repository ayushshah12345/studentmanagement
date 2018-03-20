/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.studentmanagement;

import com.f1soft.studentmanagement.entities.Department;
import com.f1soft.studentmanagement.entities.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    
    @Override
    public  List<DepartmentDTO> getDepartment(){
        List<DepartmentDTO> departmentDTOs=new ArrayList<>();
        
      departmentDTOs=  departmentRepository.findAll()
                .stream()
                .map(d->convertDepartmentToDepartmentDTO(d))
                .collect(Collectors.toList());
        System.out.println("size="+departmentDTOs);
        return departmentDTOs;
    }
    DepartmentDTO convertDepartmentToDepartmentDTO(Department department){
        DepartmentDTO departmentDTO=new DepartmentDTO();
        departmentDTO.setDepartmentName(department.getDepartmentName());
        departmentDTO.setStudents(department.getStudentList()
                .stream()
                .map(s->convertStudentToStudentDTO(s))
                .collect(Collectors.toList()));
        return departmentDTO;
    }
    
    StudentDTO convertStudentToStudentDTO(Student student){
        StudentDTO studentDTO= new StudentDTO();
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setAddress(student.getAddress());
        
        return studentDTO;
        
    }
}
