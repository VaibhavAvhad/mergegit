package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
 @Autowired
    EmployeeService employeeServiceImpl;
    @PostMapping("/savedata")
    public  String saveData(@RequestBody Employee employee){
        employeeServiceImpl.saveData(employee);
        return "Data Save Successfully";
    }

    @GetMapping ("/getalldata")
   public List<Employee> getAllData(){
        return  employeeServiceImpl.getAllData();

    }


    @PutMapping("/updatedata/{empId}")
public String updateData(@PathVariable int empId,@RequestBody Employee employee){
employeeServiceImpl.updateData(empId,employee);
return  "Data Upadated Successfully";
    }


    @DeleteMapping("/detetdata/{empId}")
    public String deletData (@PathVariable int empId, @RequestBody Employee employee){
        employeeServiceImpl.deleteData(empId);
        return "Data Deleted Succesfully";
    }


}
