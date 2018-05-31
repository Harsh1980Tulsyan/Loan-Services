package com.harsh.PersonalLoanManagement.model;

import java.io.Serializable;

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
@Table(name="registration_remark")
public class RegistrationRemarkModel implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_reg_id",nullable = false,foreignKey = @ForeignKey(name = "FK_REGISTRATION"))
    private RegistrationModel registrationModel;
    
	
	private  String remark;

	public RegistrationRemarkModel() {
	
	}



	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}



	public RegistrationModel getRegistrationModel() {
		return registrationModel;
	}



	public void setRegistrationModel(RegistrationModel registrationModel) {
		this.registrationModel = registrationModel;
	}



	@Override
	public String toString() {
		return "RegistrationRemarkModel [registrationModel=" + registrationModel + ", remark=" + remark + "]";
	}


	
	

}
