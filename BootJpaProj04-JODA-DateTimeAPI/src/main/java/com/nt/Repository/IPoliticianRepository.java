package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.Entity.Politician;

public interface IPoliticianRepository extends JpaRepository<Politician, Integer> {

	@Query(value="SELECT TRUNC((sysdate-CAST(pdob AS DATE))/360.0,1) FROM JODA_POLITICIAN WHERE PID=:id",nativeQuery=true)
	public float calculatePoliticianAgeDiff(int id);
}
