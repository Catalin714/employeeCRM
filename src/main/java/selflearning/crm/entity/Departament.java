package selflearning.crm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="departments")

public class Departament {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dept_no")
	private String id;
    
    @Column(name="dept_name")
    private String departamentName;
    
    
    @OneToMany
    @JoinColumn(name="dept_no", referencedColumnName="dept_no")
    private List<DepartamentManager> departamentManagers;


	public Departament(String departamentName, List<DepartamentManager> departamentManagers) {
		super();
		this.departamentName = departamentName;
		this.departamentManagers = departamentManagers;
	}


	public String getDepartamentName() {
		return departamentName;
	}


	public void setDepartamentName(String departamentName) {
		this.departamentName = departamentName;
	}


	public List<DepartamentManager> getDepartamentManagers() {
		return departamentManagers;
	}


	public void setDepartamentManagers(List<DepartamentManager> departamentManagers) {
		this.departamentManagers = departamentManagers;
	}


	public Departament() {
	}
    
    
}
