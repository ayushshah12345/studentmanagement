/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.studentmanagement;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hp
 */
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}