package com.lae.dhr.lookatevet.service.orchestra;

import com.lae.dhr.lookatevet.dto.OrchestraDTO;
import com.lae.dhr.lookatevet.model.Orchestra;

import java.util.List;


public interface OrchestraService {

    List<Orchestra> getClients();

    Orchestra createClient(OrchestraDTO orchestraDTO);

    Orchestra updateClient(OrchestraDTO orchestraDTO);

    void deleteClient(Integer id);
}
