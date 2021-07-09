package com.natwest.springsamprojectone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.natwest.springsamprojectone.domain.Stadiums;
import com.natwest.springsamprojectone.repo.StadiumsRepo;

	@Service
	public class StadiumsService {

	private StadiumsRepo repo;
		
	public StadiumsService(StadiumsRepo repo) {
	this.repo = repo;
	
	}
	
	public Stadiums create(Stadiums venue) {
	return this.repo.saveAndFlush(venue);
	}
	
	public List<Stadiums> read() {
	return this.repo.findAll();
	}
	
	public Stadiums update(Long id, Stadiums newvenue) {
	Stadiums existing = this.repo.getById(id);
	existing.setName(newvenue.getName());
	existing.setLocation(newvenue.getLocation());
	existing.setCapacity(newvenue.getCapacity());
	existing.setTeamAssociation(newvenue.getTeamAssociation());
	existing.setYearOfConstruction(newvenue.getYearOfConstruction());
	
	Stadiums updated = this.repo.save(existing);
	return updated;
	}
	
	public boolean delete(Long id) {
	this.repo.deleteById(id);
	return this.repo.existsById(id);
	}
	
}
