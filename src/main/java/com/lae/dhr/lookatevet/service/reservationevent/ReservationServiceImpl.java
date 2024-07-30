package com.lae.dhr.lookatevet.service.reservationevent;

import com.lae.dhr.lookatevet.dto.ReservationEventDTO;
import com.lae.dhr.lookatevet.exception.ResourceNotFoundException;
import com.lae.dhr.lookatevet.model.ReservationEvent;
import com.lae.dhr.lookatevet.repository.ReservationEventRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    private ReservationEventRepository reservationEventRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<ReservationEvent> getReservationEvents() {
        log.info("Reservation Event getList service");
        return this.reservationEventRepository.findAll();
    }

    @Override
    public ReservationEvent createReservation(ReservationEventDTO reservationEventDTO) {
        ReservationEvent createReservation = this.modelMapper.map(reservationEventDTO, ReservationEvent.class);
        createReservation.setDateCreate(LocalDateTime.now());
        log.info("Reservation create Service -> " + createReservation);
        return createReservation;
    }

    @Override
    public ReservationEvent updateReservation(ReservationEventDTO reservationEventDTO) {
        ReservationEvent updateReservation = this.modelMapper.map(reservationEventDTO, ReservationEvent.class);
        updateReservation.setDateUpdate(LocalDateTime.now());
        log.info("Reservation update Service -> " + updateReservation);
        return updateReservation;
    }


    @Override
    public void deleteReservation(Integer id) {
        ReservationEvent deleteReservation = this.reservationEventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Recurso no encontrado"));
        log.warn("Reservation deleteByID service -> " + deleteReservation.getId());
        this.reservationEventRepository.deleteById(deleteReservation.getId());
    }
}
