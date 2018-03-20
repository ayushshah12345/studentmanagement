/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.studentmanagement;

import com.f1soft.studentmanagement.entities.Student;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */

public interface StudentService {
    Student saveStudent(StudentDTO studentDTO);
    
    
}
