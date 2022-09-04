package selflearning.crm.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name="employees")
@NoArgsConstructor
public class Employee {

	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="emp_no")
		private Integer id;
		
	    @NotNull
	    @Column(name="birth_date")
		private LocalDate birthDate;
		
	    @NotNull
	    @Column(name="first_name")
		private String firstName;
		
	    @NotNull
	   @Column(name="last_name")
		private String lastName;
		
	   @NotNull
	   @Column(name="gender")
		private String gender;
		
	   @NotNull
	   @Column(name="hire_date")
		private LocalDate hireDate;
	
       @OneToMany
       @JoinColumn(name="emp_no", referencedColumnName="emp_no")
       List<DepartamentManager> departamentManagers;

	public Employee(@NotNull LocalDate birthDate, @NotNull String firstName, @NotNull String lastName,
			@NotNull String gender, @NotNull LocalDate hireDate, List<DepartamentManager> departamentManagers) {
		super();
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
		this.departamentManagers = departamentManagers;
	}

	public Employee() {
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public List<DepartamentManager> getDepartamentManagers() {
		return departamentManagers;
	}

	public void setDepartamentManagers(List<DepartamentManager> departamentManagers) {
		this.departamentManagers = departamentManagers;
	}
	


	




	








	

	

	
}
