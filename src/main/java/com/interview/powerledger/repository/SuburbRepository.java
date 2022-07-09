package com.interview.powerledger.repository;

import com.interview.powerledger.model.Suburb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuburbRepository extends JpaRepository<Suburb, Integer> {

}
