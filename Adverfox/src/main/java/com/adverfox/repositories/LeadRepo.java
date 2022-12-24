package com.adverfox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adverfox.entities.Lead;


public interface LeadRepo extends JpaRepository<Lead, Long> {

}
