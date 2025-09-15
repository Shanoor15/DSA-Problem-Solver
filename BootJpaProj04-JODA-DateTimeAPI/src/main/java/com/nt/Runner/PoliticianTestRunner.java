package com.nt.Runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.Politician;
import com.nt.Service.IPoliticianService;

@Component
public class PoliticianTestRunner implements CommandLineRunner {
	
	@Autowired
	private IPoliticianService polService;

	@Override
	public void run(String... args) throws Exception {
		/*Politician p2 = new Politician("Kiran", "Mumbai", 
			    LocalDateTime.of(1990, 2, 10, 12, 0), 
			    LocalTime.of(14, 0), 
			    LocalDate.of(2015, 8, 15));
		String msg=polService.savePoliticiation(p2);
		System.out.println(msg);*/
		
		/*Politician pol=polService.showPoliticianFindById(4);
		System.out.println(pol);*/
		try {
		System.out.println("Politician Age"+polService.getAgeById(3));
		}
		catch(Exception err)
		{
			err.printStackTrace();
		}
	}
	

}
