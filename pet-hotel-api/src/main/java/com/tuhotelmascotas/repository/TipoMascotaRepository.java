package com.tuhotelmascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuhotelmascotas.model.*;

public interface TipoMascotaRepository extends JpaRepository<TipoMascota, Integer> {
}

