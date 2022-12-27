package com.fb.facebookapi.Repository;

import com.fb.facebookapi.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface StatusRepository extends JpaRepository<Status, UUID> {
    Status save(Status status);
    ArrayList<Status> findAll();
}
