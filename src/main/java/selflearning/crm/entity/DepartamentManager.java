package selflearning.crm.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentManager {

  @OneToMany
  @Id
  @JoinColumn(name="emp_no")
  private List<Employee> employees;
	
  @ManyToOne
  @JoinColumn(name="dept_no")
  private Departament departament;
  
  @Column(name = "from_date")
  private LocalDate fromDate;
  
  @Column(name="to_date")
  private LocalDate toDate;
}
