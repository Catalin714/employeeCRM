package selflearning.crm.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import selflearning.crm.compositekey.TitleId;

@Entity
@Table(name="titles")
public class Title {

	@EmbeddedId
    TitleId titleId;
	
	
	@Column(name="to_date")
	LocalDate toDate;

	public TitleId getTitleId() {
		return titleId;
	}

	public void setTitleId(TitleId titleId) {
		this.titleId = titleId;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}



	public Title(TitleId titleId, LocalDate toDate) {
		
		this.titleId = titleId;
		this.toDate = toDate;
	}

	public Title() {
	
	}

	
	

}
