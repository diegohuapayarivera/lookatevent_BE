package com.lae.dhr.lookatevet.service.orchestra;

import com.lae.dhr.lookatevet.dto.OrchestraDTO;
import com.lae.dhr.lookatevet.exception.ResourceNotFoundException;
import com.lae.dhr.lookatevet.model.Orchestra;
import com.lae.dhr.lookatevet.repository.OrchestraRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class OrchestraServiceImpl implements OrchestraService {


    private final OrchestraRepository orchestraRepository;

    public OrchestraServiceImpl(OrchestraRepository orchestraRepository) {
        this.orchestraRepository = orchestraRepository;
    }

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<Orchestra> getOrchertas() {
        log.info("Orchestras getList service");
        return this.orchestraRepository.findAll();
    }

    @Override
    public Orchestra createOrcherta(OrchestraDTO orchestraDTO) {
        Orchestra createOrchestras = this.modelMapper.map(orchestraDTO, Orchestra.class);
        createOrchestras.setDateCreate(LocalDateTime.now());
        log.info("Orchestras create Service -> " + createOrchestras);
        return this.orchestraRepository.save(createOrchestras);
    }

    @Override
    public Orchestra updateOrcherta(OrchestraDTO orchestraDTO) {
        return this.orchestraRepository.updateOrchestra(orchestraDTO.getId(), orchestraDTO.getName(), orchestraDTO.getEmail(), orchestraDTO.getDescription());
    }

    @Override
    public void deleteOrcherta(Integer id) {
        Orchestra deleteOrchestras = this.orchestraRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Recurso no encontrado"));
        log.warn("Orchestras deleteByID service -> " + deleteOrchestras.getId());
        this.orchestraRepository.deleteById(deleteOrchestras.getId());
    }
}
