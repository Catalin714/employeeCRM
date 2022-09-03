package selflearning.crm.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import selflearning.crm.entity.Employee;
import selflearning.crm.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		
		return employeeService.getEmployees();
		
	}
	
	
	@GetMapping("/employees/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable int employeeId)
	{
		
		return employeeService.getEmployee(employeeId);
		
	}
	
	@PostMapping("/employees")
	public void addEmploye(Employee employee) {
		
		employeeService.saveEmployee(employee);
		
	}
	

	
}
