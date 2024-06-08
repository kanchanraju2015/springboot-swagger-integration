package com.briz.springbootswaggerintegration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:8080/swagger-ui/index.html follow this URL for view no other changes required 
// dependency from springdoc.org note this 
@RestController

// springdoc.org website 
public class EmployeeController 
{
@Autowired
EmployeeRepository erepo;
@RequestMapping("/test")
public String test()
{
	return "this  is Swagger Test";
}
@RequestMapping("/save")
public Employee save(@RequestBody Employee employee)
{
	return erepo.save(employee);
}
@RequestMapping("/all")
public List<Employee> alldata()
{
	return erepo.findAll();
}
@RequestMapping("/{id}")
public Optional<Employee> byid(@PathVariable int id)
{
	return erepo.findById(id);
}
@RequestMapping("/by/{name}")
public List<Employee> byname(@PathVariable String name)
{
	return erepo.findByName(name);
}
}
