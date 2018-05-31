package com.harsh.PersonalLoanManagement.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "loan_officer_assign")
public class LoanOfficerAssignModel implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name = "application_id" ,foreignKey =@ForeignKey(name = "FK_APPLICATION"))
	private LoanApplicationModel loanApplicationModel;

     
	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name = "officer_id" ,foreignKey =@ForeignKey(name = "FK_OFFICER"))
	private OfficersModel officersModel;

	public LoanOfficerAssignModel() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LoanApplicationModel getLoanApplicationModel() {
		return loanApplicationModel;
	}

	public void setLoanApplicationModel(LoanApplicationModel loanApplicationModel) {
		this.loanApplicationModel = loanApplicationModel;
	}

	public OfficersModel getOfficersModel() {
		return officersModel;
	}

	public void setOfficersModel(OfficersModel officersModel) {
		this.officersModel = officersModel;
	}

	@Override
	public String toString() {
		return "LoanOfficerAssignModel [id=" + id + ", loanApplicationModel=" + loanApplicationModel
				+ ", officersModel=" + officersModel + "]";
	}

	

}
