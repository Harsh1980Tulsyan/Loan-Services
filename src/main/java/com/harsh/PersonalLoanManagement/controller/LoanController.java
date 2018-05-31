package com.harsh.PersonalLoanManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.harsh.PersonalLoanManagement.model.OfficersModel;
import com.harsh.PersonalLoanManagement.model.RegistrationModel;
import com.harsh.PersonalLoanManagement.service.ServiceInterface;

@RestController
@RequestMapping("/loan")
public class LoanController {

	@Autowired
	ServiceInterface serviceInterface;

	@RequestMapping("/admin")
	public String helloUser() {
		return "Welcome to Admin Section";

	}

	@RequestMapping("/getOfficers")
	public List<OfficersModel> getOfficers() {
		return serviceInterface.getOfficer();

	}

	@RequestMapping(method = RequestMethod.POST, value = "/addOfficers")
	public String addOfficers(@RequestBody List<OfficersModel> obj) {
		String result = serviceInterface.addOfficer(obj);
		return result;
	}

	@RequestMapping("/getUsers")
	public List<RegistrationModel> getUsers() {
		return serviceInterface.getUsers();

	}

	@RequestMapping(method = RequestMethod.POST, value = "/addUsers")
	public String addUsers(@RequestBody List<RegistrationModel> obj) {
		return serviceInterface.addUsers(obj);

	}

}
