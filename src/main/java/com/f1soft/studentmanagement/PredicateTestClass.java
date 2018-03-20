/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.studentmanagement;

import com.f1soft.studentmanagement.entities.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author hp
 */
public class PredicateTestClass {
    public static void main(String[] args) {
        Predicate<Student> predicateObject=(s)->{
        return s.getFirstName().startsWith("r");
    };
        
        Student s1=new Student("ram", "kscxm", "ktm");
        Student s2=new Student("sita","ncdjs","ltp");
        Student s3=new Student("gita", "kscxm", "ktm");
        Student s4=new Student("hari","ncdjs","ltp");
        Student s5=new Student("shyam", "kscxm", "ktm");
        List<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
         list.add(s3);
        list.add(s4);
         list.add(s5);
         
         list
                 .stream()
                 .filter(predicateObject)
                 .forEach((s)->{
                 
                 System.out.println(s.getFirstName());
                 });
         
         
         
        
        
        
    }
}
