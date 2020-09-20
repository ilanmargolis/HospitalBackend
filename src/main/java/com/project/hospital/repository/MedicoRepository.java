package com.project.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hospital.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {
}