package com.tuhotelmascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuhotelmascotas.model.*;

public interface MascotaRepository extends JpaRepository<Mascota, Integer> {
}
