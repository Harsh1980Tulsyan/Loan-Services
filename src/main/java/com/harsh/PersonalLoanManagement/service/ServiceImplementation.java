package com.harsh.PersonalLoanManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.PersonalLoanManagement.Repository.OfficersRepository;
import com.harsh.PersonalLoanManagement.Repository.RegistrationRepository;
import com.harsh.PersonalLoanManagement.model.OfficersModel;
import com.harsh.PersonalLoanManagement.model.RegistrationModel;

@Service
public class ServiceImplementation implements ServiceInterface {

	@Autowired
	OfficersRepository officersRepository;

	@Autowired
	RegistrationRepository registrationRepository;

	@Override
	public List<OfficersModel> getOfficer() {

		List<OfficersModel> result = officersRepository.findAll();

		return result;
	}

	@Override
	public String addOfficer(List<OfficersModel> obj) {

		officersRepository.saveAll(obj);
		return "Success";
	}

	@Override
	public List<RegistrationModel> getUsers() {

		List<RegistrationModel> result = registrationRepository.findAll();

		return result;
	}

	@Override
	public String addUsers(List<RegistrationModel> obj) {

		registrationRepository.saveAll(obj);
		return "Success";
	}

}
