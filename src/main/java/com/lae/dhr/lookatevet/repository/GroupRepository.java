package com.lae.dhr.lookatevet.repository;

import com.lae.dhr.lookatevet.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {
}
