package com.harsh.PersonalLoanManagement.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "loan_application")
public class LoanApplicationModel implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long application_id;

	private String fname;

	private String mname;

	private String lname;

	private String email_id;

	private String gender;

	private Date date_of_birth;

	private long age;

	private long contact_no;

	private String address;

	private String pan_no;

	private double loan_amount;

	private double monthly_income;

	private String company_name;

	private String designation;

	private String office_address;

	private long office_contact_no;

	private String office_email;

	private String existing_loan;

	private String photo;

	private String address_document;

	private String identity_document;

	private String status;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_reg_id", nullable = false, foreignKey = @ForeignKey(name = "FK_REGISTRATION"))
	private RegistrationModel registrationModel;

	private long accountno;

	private String salutation;

	private String residential_owner;

	private String plan;

	@OneToOne(mappedBy = "loanApplicationModel", cascade = CascadeType.ALL)
	private LoanAppliedRejectedModel loanAppliedRejectedModel;
	
	
	@OneToMany(mappedBy="loanApplicationModel", cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<LoanOfficerAssignModel> loanOfficerAssignModelList;

	public LoanApplicationModel() {

	}

	public LoanAppliedRejectedModel getLoanAppliedRejectedModel() {
		return loanAppliedRejectedModel;
	}

	public void setLoanAppliedRejectedModel(LoanAppliedRejectedModel loanAppliedRejectedModel) {
		this.loanAppliedRejectedModel = loanAppliedRejectedModel;
	}

	public long getApplication_id() {
		return application_id;
	}

	public void setApplication_id(long application_id) {
		this.application_id = application_id;
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

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public List<LoanOfficerAssignModel> getLoanOfficerAssignModelList() {
		return loanOfficerAssignModelList;
	}

	public void setLoanOfficerAssignModelList(List<LoanOfficerAssignModel> loanOfficerAssignModelList) {
		this.loanOfficerAssignModelList = loanOfficerAssignModelList;
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

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public double getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}

	public double getMonthly_income() {
		return monthly_income;
	}

	public void setMonthly_income(double monthly_income) {
		this.monthly_income = monthly_income;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getOffice_address() {
		return office_address;
	}

	public void setOffice_address(String office_address) {
		this.office_address = office_address;
	}

	public long getOffice_contact_no() {
		return office_contact_no;
	}

	public void setOffice_contact_no(long office_contact_no) {
		this.office_contact_no = office_contact_no;
	}

	public String getOffice_email() {
		return office_email;
	}

	public void setOffice_email(String office_email) {
		this.office_email = office_email;
	}

	public String getExisting_loan() {
		return existing_loan;
	}

	public void setExisting_loan(String existing_loan) {
		this.existing_loan = existing_loan;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getAddress_document() {
		return address_document;
	}

	public void setAddress_document(String address_document) {
		this.address_document = address_document;
	}

	public String getIdentity_document() {
		return identity_document;
	}

	public void setIdentity_document(String identity_document) {
		this.identity_document = identity_document;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getAccountno() {
		return accountno;
	}

	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getResidential_owner() {
		return residential_owner;
	}

	public void setResidential_owner(String residential_owner) {
		this.residential_owner = residential_owner;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public RegistrationModel getRegistrationModel() {
		return registrationModel;
	}

	public void setRegistrationModel(RegistrationModel registrationModel) {
		this.registrationModel = registrationModel;
	}

	@Override
	public String toString() {
		return "LoanApplicationModel [application_id=" + application_id + ", fname=" + fname + ", mname=" + mname
				+ ", lname=" + lname + ", email_id=" + email_id + ", gender=" + gender + ", date_of_birth="
				+ date_of_birth + ", age=" + age + ", contact_no=" + contact_no + ", address=" + address + ", pan_no="
				+ pan_no + ", loan_amount=" + loan_amount + ", monthly_income=" + monthly_income + ", company_name="
				+ company_name + ", designation=" + designation + ", office_address=" + office_address
				+ ", office_contact_no=" + office_contact_no + ", office_email=" + office_email + ", existing_loan="
				+ existing_loan + ", photo=" + photo + ", address_document=" + address_document + ", identity_document="
				+ identity_document + ", status=" + status + ", registrationModel=" + registrationModel + ", accountno="
				+ accountno + ", salutation=" + salutation + ", residential_owner=" + residential_owner + ", plan="
				+ plan + "]";
	}

}
