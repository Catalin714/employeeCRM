package selflearning.crm.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import selflearning.crm.entity.Departament;
import selflearning.crm.entity.Employee;

public interface DepartamentService {
	
	
    public Page <Departament> getDepartaments(PageRequest pageRequest);
	
	public Optional<Departament> getDepartament(int id);
	
	public void saveDepartament(Departament departament);
	
	public void deleteDepartament(int id);

}
