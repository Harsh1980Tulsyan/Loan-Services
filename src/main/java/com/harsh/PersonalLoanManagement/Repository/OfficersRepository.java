package com.harsh.PersonalLoanManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harsh.PersonalLoanManagement.model.OfficersModel;


@Repository
public interface OfficersRepository extends JpaRepository<OfficersModel, Long> {

	List<OfficersModel> findAll();
}
