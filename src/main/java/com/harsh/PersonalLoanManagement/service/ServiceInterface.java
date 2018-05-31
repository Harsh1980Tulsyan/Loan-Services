package com.harsh.PersonalLoanManagement.service;

import java.util.List;

import com.harsh.PersonalLoanManagement.model.OfficersModel;
import com.harsh.PersonalLoanManagement.model.RegistrationModel;

public interface ServiceInterface {
	
	List<OfficersModel>  getOfficer();

	String addOfficer(List<OfficersModel> obj);

	List<RegistrationModel> getUsers();

	String addUsers(List<RegistrationModel> obj);

}
