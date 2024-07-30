package com.lae.dhr.lookatevet.controller;

import com.lae.dhr.lookatevet.dto.OrchestraDTO;
import com.lae.dhr.lookatevet.model.Orchestra;
import com.lae.dhr.lookatevet.service.orchestra.OrchestraService;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/orchestras")
@Slf4j
public class OrchestraController {

    private final OrchestraService orchestraService;


    public OrchestraController(OrchestraService orchestraService) {
        this.orchestraService = orchestraService;
    }

    @GetMapping
    public ResponseEntity<List<Orchestra>> getClients() {
        log.info("Orchestras get List controller -> " + this.orchestraService.getOrchertas());
        return new ResponseEntity<>(this.orchestraService.getOrchertas(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Orchestra> createClient(@RequestBody @NotNull OrchestraDTO orchestraDTO) {
        log.info("Orchestras create controller -> " + orchestraDTO.toString());
        return new ResponseEntity<>(this.orchestraService.createOrcherta(orchestraDTO), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Orchestra> updateClient(@RequestBody @NotNull OrchestraDTO orchestraDTO) {
        log.info("Orchestras update controller -> " + orchestraDTO.toString());
        return new ResponseEntity<>(this.orchestraService.updateOrcherta(orchestraDTO), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idDelete}")
    public ResponseEntity<String> deleteClient(@PathVariable Integer idDelete) {
        log.info("Orchestras delete controller -> " + idDelete);
        this.orchestraService.deleteOrcherta(idDelete);
        return new ResponseEntity<>("Data elimination", HttpStatus.NO_CONTENT);
    }
}
