package selflearning.crm.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

import selflearning.crm.compositekey.SalaryId;

@Entity
@Table(name = "salaries")
public class Salary {
	
	
	@EmbeddedId
	private SalaryId salaryId;
	
	@Positive
	@Column(name="salary")
	private Integer salary;
	
	@Column(name="to_date")
	private LocalDate toDate;

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public Salary(Integer salary, LocalDate toDate) {
		super();
		this.salary = salary;
		this.toDate = toDate;
	}

	public Salary() {
	}

	
}
