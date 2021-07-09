package com.natwest.springsamprojectone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.springsamprojectone.domain.Stadiums;

@Repository
public interface StadiumsRepo extends JpaRepository<Stadiums, Long> {

}
