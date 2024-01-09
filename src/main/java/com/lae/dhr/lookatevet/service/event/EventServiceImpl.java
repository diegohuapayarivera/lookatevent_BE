package com.lae.dhr.lookatevet.service.event;

import com.lae.dhr.lookatevet.dto.EventDTO;
import com.lae.dhr.lookatevet.exception.ResourceNotFoundException;
import com.lae.dhr.lookatevet.model.Event;
import com.lae.dhr.lookatevet.repository.EventRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<Event> getEvents() {
        log.info("Event GetList Service");
        return this.eventRepository.findAll();
    }

    @Override
    public Event createEvent(EventDTO eventDTO) {
        Event createEvent = modelMapper.map(eventDTO, Event.class);
        createEvent.setDateCreated(LocalDateTime.now());
        log.info("Event create Service ->" + createEvent);
        return this.eventRepository.save(createEvent);
    }


    @Override
    public Event updateEvent(EventDTO eventDTO) {
        Event updateEvent = modelMapper.map(eventDTO, Event.class);
        updateEvent.setDateUpdated(LocalDateTime.now());
        log.info("Event update Service ->" + updateEvent);
        return this.eventRepository.save(updateEvent);
    }

    @Override
    public void deleteEvent(Integer id) {
        Event deleteEvent = this.eventRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso no encontrado"));
        log.warn("Event delete service -> " + deleteEvent.getId());
        this.eventRepository.deleteById(deleteEvent.getId());
    }
}
