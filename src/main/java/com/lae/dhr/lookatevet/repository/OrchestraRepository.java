package com.lae.dhr.lookatevet.repository;

import com.lae.dhr.lookatevet.model.Orchestra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrchestraRepository extends JpaRepository<Orchestra, Integer> {
}
