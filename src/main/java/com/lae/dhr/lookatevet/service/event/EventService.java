package com.lae.dhr.lookatevet.service.event;



import com.lae.dhr.lookatevet.dto.EventDTO;
import com.lae.dhr.lookatevet.model.Event;

import java.util.List;

public interface EventService {

    List<Event> getEvents();

    Event createEvent(EventDTO eventDTO);

    Event updateEvent(EventDTO eventDTO);

    void deleteEvent(Integer id);
}
