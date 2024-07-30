package com.lae.dhr.lookatevet.repository;

import com.lae.dhr.lookatevet.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

    @Transactional
    @Query(value = "{call proc_Update_Event_Data(:id, :NewIdOrchestra, :NewDateEvent, :NewStateEvent)}", nativeQuery = true)
    Event updateEvent(@Param("id") Integer id,
                      @Param("NewIdOrchestra") Integer newIdOrchestra,
                      @Param("NewDateEvent") LocalDate newDateEvent,
                      @Param("NewStateEvent") String newStateEvent);
}
