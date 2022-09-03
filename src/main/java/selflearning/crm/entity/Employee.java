package selflearning.crm.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name="employees")
public class Employee {

	



		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="emp_no")
		private int id;
		
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
	

	


	public Employee(@NotNull LocalDate birthDate, @NotNull String firstName, @NotNull String lastName,
			@NotNull String gender, @NotNull LocalDate hireDate) {
		super();
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
	}





	public Employee() {

	}

	

	
}
