package com.natwest.springsamprojectone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.springsamprojectone.domain.Stadiums;
import com.natwest.springsamprojectone.service.StadiumsService;

	@RestController
	@RequestMapping("/Stadiums")
	public class StadiumsController {
		
	@Autowired
	public StadiumsController (StadiumsService service) {
	this.service = service;
	}
	
	private StadiumsService service;

	@GetMapping("/testingStadiums")
	public String test() {
	return "The Stadiums are visible from the sky";
	}
	
	@PostMapping("create")
	public ResponseEntity<Stadiums> create(@RequestBody Stadiums venue) {
	return new ResponseEntity<Stadiums>(this.service.create(venue), HttpStatus.CREATED);
	}
	
	@GetMapping("/read")
	public ResponseEntity<List<Stadiums>> read(){
	return new ResponseEntity<List<Stadiums>>(this.service.read(), HttpStatus.OK);
	}
	
	@PutMapping("/replace/{id}")
	public ResponseEntity<Stadiums> update(@PathVariable Long id, @RequestBody Stadiums venue){
	return new ResponseEntity<Stadiums>(this.service.update(id, venue), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
	return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
	}
	
}	
