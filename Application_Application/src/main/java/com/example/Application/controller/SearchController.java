package com.example.Application.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Application.model.Employee;
import com.example.Application.repository.EmpRepository;

@RestController
@RequestMapping ("/search/")
public class SearchController {
	
	@Autowired
	private EmpRepository empRepository;

	@GetMapping ("employee")
	public List<Employee> getAllEmployees(){
		
		
		return this.empRepository.findAll();
	}
	
	@GetMapping ("employee/{occupation}")
	public List<Employee> getEmpbyOccupation ( @PathVariable (value =  "occupation") String occupation) {
		
		return this.empRepository.findByOccupation(occupation);
	}
	
	@PostMapping ("employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		
		empRepository.save(emp);
		
		return ResponseEntity.ok().body(emp);
		
	}
	
	
	@PutMapping ("employee/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable (value ="id") long id,@RequestBody Employee emp) {
		
		Employee emp1 = empRepository.findById(id).orElseThrow();
		
		emp1.setFirstName(emp.getFirstName());
		emp1.setLastName(emp.getLastName());
		emp1.setOccupation(emp.getOccupation());
		emp1.setServiceCharge(emp.getServiceCharge());
		
		return ResponseEntity.ok().body(emp1);
	}
	
	@DeleteMapping ("employee/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable (value ="id") long id){
		
		Employee emp1 = empRepository.findById(id).orElseThrow();
		empRepository.delete(emp1);
		
		Map<String, Boolean> deletedEmp = new HashMap<String, Boolean>();
		deletedEmp.put("Deleted", true);
		
		return deletedEmp;
	}

}
