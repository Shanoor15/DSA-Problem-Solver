package com.nt.Service;

import java.util.List;

import com.nt.Entity.Politician;

public interface IPoliticianService {

	public String savePoliticiation(Politician politician);
	public Politician showPoliticianFindById(int id);
	public float getAgeById(int id);
}
