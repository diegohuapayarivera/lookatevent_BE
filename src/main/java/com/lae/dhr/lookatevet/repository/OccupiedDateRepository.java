package com.lae.dhr.lookatevet.repository;

import com.lae.dhr.lookatevet.model.OccupiedDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccupiedDateRepository extends JpaRepository<OccupiedDate, Integer> {

}
