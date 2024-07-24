package com.lae.dhr.lookatevet.repository;

import com.lae.dhr.lookatevet.model.ReservationEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationEventRepository extends JpaRepository<ReservationEvent, Integer> {
}
