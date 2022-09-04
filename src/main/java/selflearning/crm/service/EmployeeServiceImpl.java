package selflearning.crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import selflearning.crm.dao.EmployeeRepository;
import selflearning.crm.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public Page <Employee> getEmployees(PageRequest pageRequest) {
		return employeeRepository.findAll(pageRequest);
	}

	
	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public void deleteEmployee(Integer id) {
		
		employeeRepository.deleteById(id);
		
	}


	@Override
	public Optional<Employee> getEmployee(int id) {
		
		
		   return employeeRepository.findById(id);
	}

	
	
	
	
}
