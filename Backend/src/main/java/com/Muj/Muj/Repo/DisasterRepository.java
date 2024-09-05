package com.Muj.Muj.Repo;

import com.Muj.Muj.Entities.Disaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisasterRepository extends JpaRepository<Disaster, Integer> {
}
