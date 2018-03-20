/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.studentmanagement;

import java.util.List;

/**
 *
 * @author hp
 */
public class DepartmentDTO {
    private String  departmentName;
    private List<StudentDTO> students;

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * @return the students
     */
    public List<StudentDTO> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }
    
    
}
