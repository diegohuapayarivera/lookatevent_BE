package com.lae.dhr.lookatevet.service.group;

import com.lae.dhr.lookatevet.dto.GroupDTO;
import com.lae.dhr.lookatevet.exception.ResourceNotFoundException;
import com.lae.dhr.lookatevet.model.Group;
import com.lae.dhr.lookatevet.repository.GroupRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class GroupServiceImpl implements GroupService {


    @Autowired
    private GroupRepository groupRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<Group> getGroups() {
        log.info("Group getList service");
        return this.groupRepository.findAll();
    }

    @Override
    public Group createGroup(GroupDTO groupDTO) {
        Group createGroup = this.modelMapper.map(groupDTO, Group.class);
        createGroup.setDateCreated(LocalDateTime.now());
        log.info("Group create Service -> " + createGroup);
        return this.groupRepository.save(createGroup);
    }

    @Override
    public Group updateGroup(GroupDTO groupDTO) {
        Group updateGroup = this.modelMapper.map(groupDTO, Group.class);
        updateGroup.setDateUpdated(LocalDateTime.now());
        log.info("Group create Service -> " + updateGroup);
        return this.groupRepository.save(updateGroup);
    }

    @Override
    public void deleteGroup(Integer id) {
        Group deleteGroup = this.groupRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso no encontrado"));
        log.warn("Group deleteByID service -> " + deleteGroup.getId());
        this.groupRepository.deleteById(deleteGroup.getId());
    }
}
