package selflearning.crm.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import selflearning.crm.compositekey.DepartamentManagerId;

@Entity
@Table(name="dept_manager")
public class DepartamentManager {


	
	@EmbeddedId
	private DepartamentManagerId id;
	
	@Column(name="from_date")
    private LocalDate fromDate;
	
    @Column(name="to_date")
	private LocalDate toDate;

	public DepartamentManager(LocalDate fromDate, LocalDate toDate) {
		super();
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public DepartamentManager() {
		
	}


    
	
	
}
