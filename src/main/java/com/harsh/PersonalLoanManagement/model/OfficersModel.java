package com.harsh.PersonalLoanManagement.model;

import java.io.Serializable;
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
@Table(name = "officers")
public class OfficersModel implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long officer_id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "officer_role_id", nullable = false, foreignKey = @ForeignKey(name = "FK_ROLE"))

	private RolesModel role;

	private String name;

	private String email_id;

	private long contact_no;

	private String username;

	private String password;

	@OneToMany(mappedBy = "officersModel", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private List<LoanOfficerAssignModel> loanOfficerAssignModelList;

	public OfficersModel() {

	}

	

	public List<LoanOfficerAssignModel> getLoanOfficerAssignModelList() {
		return loanOfficerAssignModelList;
	}



	public void setLoanOfficerAssignModelList(List<LoanOfficerAssignModel> loanOfficerAssignModelList) {
		this.loanOfficerAssignModelList = loanOfficerAssignModelList;
	}



	public long getOfficer_id() {
		return officer_id;
	}

	public void setOfficer_id(long officer_id) {
		this.officer_id = officer_id;
	}

	public RolesModel getRole() {
		return role;
	}

	public void setRole(RolesModel role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getContact_no() {
		return contact_no;
	}

	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
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

	@Override
	public String toString() {
		return "OfficersModel [officer_id=" + officer_id + ", role=" + role + ", name=" + name + ", email_id="
				+ email_id + ", contact_no=" + contact_no + ", username=" + username + ", password=" + password + "]";
	}

}
