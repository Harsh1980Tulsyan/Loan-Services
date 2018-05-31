package com.harsh.PersonalLoanManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.PersonalLoanManagement.model.RegistrationModel;

public interface RegistrationRepository  extends JpaRepository<RegistrationModel,Long>
{
    List<RegistrationModel> findAll();
	
}
