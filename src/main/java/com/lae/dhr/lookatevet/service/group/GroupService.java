package com.lae.dhr.lookatevet.service.group;

import com.lae.dhr.lookatevet.dto.GroupDTO;
import com.lae.dhr.lookatevet.model.Group;

import java.util.List;


public interface GroupService {

    List<Group> getGroups();

    Group createGroup(GroupDTO groupDTO);

    Group updateGroup(GroupDTO groupDTO);

    void deleteGroup(Integer id);
}
