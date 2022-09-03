package selflearning.crm.service;

import java.util.List;
import java.util.Optional;

import selflearning.crm.entity.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public Optional<Employee> getEmployee(int id);
	
	public void saveEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	
}
