package com.nt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.Politician;
import com.nt.Repository.IPoliticianRepository;

@Service("polService")
public class PoliticianServiceImpl implements IPoliticianService {

	@Autowired
	private IPoliticianRepository polRepo;

	@Override
	public String savePoliticiation(Politician politician) {
		Politician pol=polRepo.save(politician);
		int idVal=pol.getPid();
		return "Politician Record is saved with this id"+idVal;
	}

	@Override
	public Politician showPoliticianFindById(int id) {
		Optional<Politician> opt=polRepo.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
		    throw new IllegalArgumentException("Invalid Id");
	}

	@Override
	public float getAgeById(int id) {
		return polRepo.calculatePoliticianAgeDiff(id);
	}
}
