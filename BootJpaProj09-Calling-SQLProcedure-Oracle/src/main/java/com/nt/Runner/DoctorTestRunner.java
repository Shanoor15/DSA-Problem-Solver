package com.nt.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorMgmtService;

@Component
public class DoctorTestRunner implements CommandLineRunner {

	@Autowired
	private IDoctorMgmtService docService;
	@Override
	public void run(String... args) throws Exception {
		List<Doctor> list=docService.showDoctorsByfeeRang(18000.0, 25000.0);
		list.forEach(System.out::println);
	}

}
