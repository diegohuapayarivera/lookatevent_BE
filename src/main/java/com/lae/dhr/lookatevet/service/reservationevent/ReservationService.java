package com.lae.dhr.lookatevet.service.reservationevent;

import com.lae.dhr.lookatevet.dto.ReservationEventDTO;
import com.lae.dhr.lookatevet.model.ReservationEvent;

import java.util.List;

public interface ReservationService {

    List<ReservationEvent> getReservationEvents();

    ReservationEvent createReservation(ReservationEventDTO reservationEventDTO);

    ReservationEvent updateReservation(ReservationEventDTO reservationEventDTO);

    void deleteReservation(Integer id);
}
