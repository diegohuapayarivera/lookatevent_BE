package com.lae.dhr.lookatevet.repository;

import com.lae.dhr.lookatevet.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
}
