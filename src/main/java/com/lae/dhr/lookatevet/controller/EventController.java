package com.lae.dhr.lookatevet.controller;

import com.lae.dhr.lookatevet.dto.EventDTO;
import com.lae.dhr.lookatevet.model.Event;
import com.lae.dhr.lookatevet.service.event.EventService;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
@Slf4j
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public ResponseEntity<List<Event>> getEvents(){
        log.info("Event get List controller -> " + this.eventService.getEvents());
        return new ResponseEntity<>(this.eventService.getEvents(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Event> createEvent(@RequestBody @NotNull EventDTO eventDTO){
        log.info("Event create controller -> " + eventDTO.toString());
        return new ResponseEntity<>(this.eventService.createEvent(eventDTO), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Event> updateEvent(@RequestBody @NotNull EventDTO eventDTO){
        log.info("Event update controller -> "+ eventDTO.toString());
        return new ResponseEntity<>(this.eventService.updateEvent(eventDTO), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idDelete}")
    public ResponseEntity<?> deleteEvent(@PathVariable Integer idDelete){
        log.info("Event delete controller -> " + idDelete);
        this.eventService.deleteEvent(idDelete);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
