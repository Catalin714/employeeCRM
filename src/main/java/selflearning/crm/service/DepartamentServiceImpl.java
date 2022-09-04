package selflearning.crm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import selflearning.crm.dao.DepartamentRepository;
import selflearning.crm.entity.Departament;
import selflearning.crm.entity.Employee;


@Service
public class DepartamentServiceImpl implements DepartamentService {

	
	@Autowired
	DepartamentRepository departamentRepository;
	
	@Override
	public Page<Departament> getDepartaments(PageRequest pageRequest) {
		
		return departamentRepository.findAll(pageRequest);
	}

	@Override
	public Optional<Departament> getDepartament(int id) {
		
		  return departamentRepository.findById(id);
	}

	@Override
	public void saveDepartament(Departament departament) {
		departamentRepository.save(departament);

	}

	@Override
	public void deleteDepartament(int id) {

		
		
		departamentRepository.deleteById(id);
		
		
		
		
	}

}
