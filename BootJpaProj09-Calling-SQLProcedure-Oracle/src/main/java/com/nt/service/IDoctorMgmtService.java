package com.nt.service;

import java.util.List;

import com.nt.entity.Doctor;

public interface IDoctorMgmtService {

	public List<Doctor> showDoctorsByfeeRang(double startfee,double endfee);
}
