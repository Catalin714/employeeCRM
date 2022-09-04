package selflearning.crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import selflearning.crm.entity.Employee;

public interface EmployeeService {

	public Page <Employee> getEmployees(PageRequest pageRequest);
	
	public Optional<Employee> getEmployee(int id);
	
	public void saveEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	
}
