package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;



@Service("docService")
public class DoctorMgmtService implements IDoctorMgmtService {

	@Autowired
	private EntityManager manager;
	@Override
	public List<Doctor> showDoctorsByfeeRang(double startfee, double endfee) {
		//create StoreProcedure Object pointing to PL/SQL Procedure
		StoredProcedureQuery query=manager.createStoredProcedureQuery("P_Get_Doctor_By_Fee",Doctor.class);
		//register both IN,OUT params
		query.registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Object.class, ParameterMode.REF_CURSOR);
		//set values to IN Params
		query.setParameter(1, startfee);
		query.setParameter(2, endfee);
		//call the PL/SQL Procedure
		List<Doctor> list=query.getResultList();
		return list;
	}

}
