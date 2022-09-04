package selflearning.crm.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="employees")
public class Employee {

	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="emp_no")
		private Integer id;
		
	    @NotNull
	    @Column(name="birth_date")
		private LocalDate birthDate;
		
	    @NotNull
	    @Column(name="first_name", length = 16)
		private String firstName;
		
	    @NotNull
	    @Column(name="last_name", length = 16)
		private String lastName;
		
	    @NotNull
	    @Column(name="gender")
		private String gender;
		
	    @NotNull
	    @Column(name="hire_date")
		private LocalDate hireDate;
	
        @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.MERGE})
        @JoinColumn(name="emp_no", referencedColumnName="emp_no")
        List<DepartamentManager> departamentManagers;

        @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.MERGE})
        @JoinColumn(name="emp_no", referencedColumnName="emp_no")
        List<Salary> salaries;
       
        @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.MERGE})
        @JoinColumn(name="emp_no", referencedColumnName="emp_no")
        List<Title> titles;
       

	
       
       
       




	public Employee(@NotNull LocalDate birthDate, @NotNull String firstName, @NotNull String lastName,
				@NotNull String gender, @NotNull LocalDate hireDate, List<DepartamentManager> departamentManagers,
				List<Salary> salaries, List<Title> titles) {
			super();
			this.birthDate = birthDate;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.hireDate = hireDate;
			this.departamentManagers = departamentManagers;
			this.salaries = salaries;
			this.titles = titles;
		}

	public List<Salary> getSalaries() {
		return salaries;
	}

	public void setSalaries(List<Salary> salaries) {
		this.salaries = salaries;
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

	public List<Title> getTitles() {
		return titles;
	}

	public void setTitles(List<Title> titles) {
		this.titles = titles;
	}



	




	








	

	

	
}
