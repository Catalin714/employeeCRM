package selflearning.crm.compositekey;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import selflearning.crm.entity.Departament;
import selflearning.crm.entity.Employee;




@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DepartamentManagerId implements Serializable {

	
	
	private static final long serialVersionUID = 1L;


	
	  @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.REMOVE, CascadeType.MERGE})
	  @JoinColumn(name="dept_no",referencedColumnName = "dept_no")
	  private Departament departament; 
	
	
	  @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.REMOVE, CascadeType.MERGE})
	  @JoinColumn(name="emp_no",referencedColumnName = "emp_no")
	 private Employee employee;


	@Override
	public int hashCode() {
		return Objects.hash(departament, employee);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartamentManagerId other = (DepartamentManagerId) obj;
		return Objects.equals(departament, other.departament) && Objects.equals(employee, other.employee);
	} 
	 


	
	
	
}
