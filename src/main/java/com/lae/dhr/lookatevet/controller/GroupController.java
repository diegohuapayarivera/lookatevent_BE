package com.lae.dhr.lookatevet.controller;

import com.lae.dhr.lookatevet.dto.GroupDTO;
import com.lae.dhr.lookatevet.model.Group;
import com.lae.dhr.lookatevet.service.group.GroupService;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
@Slf4j
public class GroupController {

    private final GroupService groupService;


    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public ResponseEntity<List<Group>> getGroups(){
        log.info("Group get List controller -> " + this.groupService.getGroups());
        return new ResponseEntity<>(this.groupService.getGroups(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Group> createGroup(@RequestBody @NotNull GroupDTO groupDTO){
        log.info("Group create controller -> " + groupDTO.toString());
        return new ResponseEntity<>(this.groupService.createGroup(groupDTO), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Group> updateGroup(@RequestBody @NotNull GroupDTO groupDTO){
        log.info("Group update controller -> "+ groupDTO.toString());
        return new ResponseEntity<>(this.groupService.updateGroup(groupDTO), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idDelete}")
    public ResponseEntity<?> deleteGroup(@PathVariable Integer idDelete){
        log.info("Group delete controller -> " + idDelete);
        this.groupService.deleteGroup(idDelete);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
