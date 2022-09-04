package selflearning.crm.compositekey;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import selflearning.crm.entity.Employee;

@Embeddable
public class SalaryId implements Serializable {

	

	private static final long serialVersionUID = 1L;

	  @Column(name="from_date")
	  private LocalDate fromDate;
	  
	   @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.REMOVE, CascadeType.MERGE})
	   @JoinColumn(name="emp_no",referencedColumnName = "emp_no")
	   Employee employee; 

	@Override
	public int hashCode() {
		return Objects.hash(employee, fromDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalaryId other = (SalaryId) obj;
		return Objects.equals(employee, other.employee) && Objects.equals(fromDate, other.fromDate);
	}

	
}
