package com.lae.dhr.lookatevet.repository;

import com.lae.dhr.lookatevet.model.Orchestra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrchestraRepository extends JpaRepository<Orchestra, Integer> {

    @Transactional
    @Query(value = "{call proc_Update_Orchestra_Data(:id, :NewName, :NewEmail, :NewDescription)}", nativeQuery = true)
    Orchestra updateOrchestra(@Param("id") Integer id,
                              @Param("NewName") String newName,
                              @Param("NewEmail") String newEmail,
                              @Param("NewDescription") String newDescription);
}
