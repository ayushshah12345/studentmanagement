
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.studentmanagement;

import com.f1soft.studentmanagement.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
public class DepartmentController {
    
    @Autowired
    private DepartmentRepository departmentRepository;
    
    @Autowired
    private DepartmentService departmentService;
    
    @GetMapping("/departments")
        public ResponseEntity<?>  getDepartment(){
        return ResponseEntity.ok(departmentService.getDepartment());
    }
    
     @PostMapping("/departments")
    public ResponseEntity<?> saveDepartment(@RequestBody Department department){
        
        
            return ResponseEntity.ok(departmentRepository.save(department));
        
    }
    
    @PutMapping("/departments")
    public ResponseEntity<?> updateDepartment(@RequestBody Department department){
        
        departmentRepository.save(department);
           
            
     
        
        return ResponseEntity.ok("updated");        
    }
    
    @DeleteMapping("/departments")
    public ResponseEntity<?> deleteDepartment(@RequestParam Long id){
      departmentRepository.deleteById(id);
      return ResponseEntity.ok("Deleted!");
      
        
    }
}
    
    

