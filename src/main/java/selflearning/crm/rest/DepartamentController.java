package selflearning.crm.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import selflearning.crm.entity.Departament;
import selflearning.crm.entity.Employee;
import selflearning.crm.service.DepartamentService;
import selflearning.crm.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class DepartamentController {

	
	
	@Autowired
	DepartamentService departamentService;
	
	@GetMapping("/departaments")
	public Page<Departament> getDepartaments(@RequestParam int page, @RequestParam int size) {
		PageRequest pr = PageRequest.of(page, size);
		return departamentService.getDepartaments(pr);
		
	}
	
	
	@GetMapping("/departaments/{departamentId}")
	public Optional<Departament> getEmployee(@PathVariable int departamentId)
	{
		
		return departamentService.getDepartament(departamentId);
		
	}
	
	@PostMapping("/departaments")
	public void addEmploye(Departament departament) {
		
		departamentService.saveDepartament(departament);
		
	}
	
	
	
}
