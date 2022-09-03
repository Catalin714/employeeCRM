package selflearning.crm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="departaments")
public class Departament {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="dept_no")
  char departamentNumber;
  
  
  @Column(name = "dept_name")
  String departamentName;
}
