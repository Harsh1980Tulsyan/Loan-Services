package com.harsh.PersonalLoanManagement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class RegistrationModel  implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long reg_id;
	
     private String fname ;
	 
	 private String mname;
	 
	 private String lname;
	 
	 private String email_id;
	 
	 private String gender;
 	
	private Date date_of_birth;
	
	private long contact_no;
	
	private String address;
	
	private String username;
	
	private String password;
	
	private String question;
	
	private String answer;
	
	private String status;

	@OneToOne(mappedBy="registrationModel" ,cascade=CascadeType.ALL)
	private LoanApplicationModel loanApplicationModel;
	
	public LoanApplicationModel getLoanApplicationModel() {
		return loanApplicationModel;
	}

	public void setLoanApplicationModel(LoanApplicationModel loanApplicationModel) {
		this.loanApplicationModel = loanApplicationModel;
	}

	public RegistrationModel() {
		
	}

	public long getReg_id() {
		return reg_id;
	}

	public void setReg_id(long reg_id) {
		this.reg_id = reg_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public long getContact_no() {
		return contact_no;
	}

	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RegistrationModel [reg_id=" + reg_id + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname
				+ ", email_id=" + email_id + ", gender=" + gender + ", date_of_birth=" + date_of_birth + ", contact_no="
				+ contact_no + ", address=" + address + ", username=" + username + ", password=" + password
				+ ", question=" + question + ", answer=" + answer + ", status=" + status + "]";
	}
}
