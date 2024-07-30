package com.lae.dhr.lookatevet.controller;

import com.lae.dhr.lookatevet.dto.ReservationEventDTO;
import com.lae.dhr.lookatevet.model.ReservationEvent;
import com.lae.dhr.lookatevet.service.reservationevent.ReservationService;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservationEvents")
@Slf4j
public class ReservationEventController {
    private final ReservationService reservationService;

    public ReservationEventController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public ResponseEntity<List<ReservationEvent>> getReversationEvents(){
        List<ReservationEvent> reservationEvents = this.reservationService.getReservationEvents();
        log.info("Reservation get List controller -> " + reservationEvents);
        return new ResponseEntity<>(reservationEvents, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ReservationEvent> createReservation(@RequestBody @NotNull ReservationEventDTO reservationEventDTO){
        log.info("Reservation create controller -> " + reservationEventDTO.toString());
        return new ResponseEntity<>(this.reservationService.createReservation(reservationEventDTO), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ReservationEvent> updateReservation(@RequestBody @NotNull ReservationEventDTO reservationEventDTO){
        log.info("Reservation update controller -> " + reservationEventDTO.toString());
        return new ResponseEntity<>(this.reservationService.updateReservation(reservationEventDTO), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idDelete}")
    public ResponseEntity<String> deleteGroup(@PathVariable Integer idDelete){
        log.info("Reservation delete controller -> " + idDelete);
        this.reservationService.deleteReservation(idDelete);
        return new ResponseEntity<>("Data elimination", HttpStatus.NO_CONTENT);
    }
}
