/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.studentmanagement;

import static java.util.Collections.list;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp
 */
@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
    
    @Autowired
    private StudentRepository sr;
    
    @GetMapping("/students")
    public ResponseEntity<?>  getStudent(){
        return ResponseEntity.ok(sr.findAll());
    }
    
    @PostMapping("/students")
    public ResponseEntity<?> saveStudent(@RequestBody StudentDTO studentDTO){
        
        
            return ResponseEntity.ok(studentService.saveStudent(studentDTO));
            
            
        
    }

    
   @PutMapping("/students")
    public ResponseEntity<?> updateStudents(@RequestBody Student s1){
        
        sr.findById(s1.getId()).ifPresent((s)->{
            s.setFirstName(s1.getFirstName());
            s.setLastName(s1.getLastName());
            
            s.setAddress(s1.getAddress());
            sr.save(s);
            
        });
        
        return ResponseEntity.ok("updated");        
    }

    @DeleteMapping("/students")
    public ResponseEntity<?> deleteStudents(@RequestParam Long id){
        sr.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
    
    
    Predicate<Student> predicateObject=(s)->{
        return true;
    };
    
}
