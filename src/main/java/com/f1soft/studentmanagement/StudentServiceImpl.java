/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.studentmanagement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class StudentServiceImpl implements StudentService {
    
 @Autowired
 private StudentRepository studentRepository;
 
 @Autowired
 private DepartmentRepository departmentRepository;
 
         
 

    @Override
    public Student saveStudent(StudentDTO studentDTO) {
   return studentRepository.save(convertStudentDTOToStudent(studentDTO));
   
    }
    
    public Student convertStudentDTOToStudent(StudentDTO studentDTO){
        Student student=new Student();
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setAddress(studentDTO.getAddress());
        student.setDepartment(departmentRepository.findByDepartmentName(studentDTO.getDepartmentName()));
        
        return student;
        
        
        
        
    }
}
