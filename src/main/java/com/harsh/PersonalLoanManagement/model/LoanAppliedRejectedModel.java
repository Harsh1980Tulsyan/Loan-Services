package com.harsh.PersonalLoanManagement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan_app_or_rej")
public class LoanAppliedRejectedModel implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loan_id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "application_id", nullable = false,foreignKey = @ForeignKey(name = "FK_APPLICATION"))
	private LoanApplicationModel loanApplicationModel;
	
	private Date approval_date;
	
	private double amount_sanctioned;
	
	private double interest_rate;
	
	private String reason;
	
	private String status;
	
	private double emi_assigned;
	
	private long loan_duration;
	
	

	public LoanAppliedRejectedModel() {
		
	}

	public long getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(long loan_id) {
		this.loan_id = loan_id;
	}


	public Date getApproval_date() {
		return approval_date;
	}

	public void setApproval_date(Date approval_date) {
		this.approval_date = approval_date;
	}

	public double getAmount_sanctioned() {
		return amount_sanctioned;
	}

	public void setAmount_sanctioned(double amount_sanctioned) {
		this.amount_sanctioned = amount_sanctioned;
	}

	public double getInterest_rate() {
		return interest_rate;
	}

	public void setInterest_rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getEmi_assigned() {
		return emi_assigned;
	}

	public void setEmi_assigned(double emi_assigned) {
		this.emi_assigned = emi_assigned;
	}

	public long getLoan_duration() {
		return loan_duration;
	}

	public void setLoan_duration(long loan_duration) {
		this.loan_duration = loan_duration;
	}

	public LoanApplicationModel getLoanApplicationModel() {
		return loanApplicationModel;
	}

	public void setLoanApplicationModel(LoanApplicationModel loanApplicationModel) {
		this.loanApplicationModel = loanApplicationModel;
	}

	@Override
	public String toString() {
		return "LoanAppliedRejectedModel [loan_id=" + loan_id + ", loanApplicationModel=" + loanApplicationModel
				+ ", approval_date=" + approval_date + ", amount_sanctioned=" + amount_sanctioned + ", interest_rate="
				+ interest_rate + ", reason=" + reason + ", status=" + status + ", emi_assigned=" + emi_assigned
				+ ", loan_duration=" + loan_duration + "]";
	}


}
