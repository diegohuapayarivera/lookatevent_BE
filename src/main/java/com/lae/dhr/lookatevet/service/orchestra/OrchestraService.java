package com.lae.dhr.lookatevet.service.orchestra;

import com.lae.dhr.lookatevet.dto.OrchestraDTO;
import com.lae.dhr.lookatevet.model.Orchestra;

import java.util.List;


public interface OrchestraService {

    List<Orchestra> getOrchertas();

    Orchestra createOrcherta(OrchestraDTO orchestraDTO);

    Orchestra updateOrcherta(OrchestraDTO orchestraDTO) ;

    void deleteOrcherta(Integer id);
}
