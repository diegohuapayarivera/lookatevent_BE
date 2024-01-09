package com.lae.dhr.lookatevet.repository;

import com.lae.dhr.lookatevet.model.AvailabilityDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailabilityDateRepository extends JpaRepository<AvailabilityDate, Integer> {

}
