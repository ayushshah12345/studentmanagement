/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp
 */
@RestController
public class HelloWorldController {
    @Autowired
    private SecurityConfiguration sc;
    
   @GetMapping("/hello/{name}")
    public String index(@PathVariable String name){
        
      //  return sc.getUsername()+sc.getPassword();
       return "hello"+name; 
        
    }
    
    @GetMapping("/at")
    public String name(@RequestParam String name , @RequestParam String address){
        return name + address;
        
    }
    
   
    
}
