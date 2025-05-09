package com.tuhotelmascotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuhotelmascotas.model.*;

public interface MascotaRepository extends JpaRepository<Mascota, Integer> {
    List<Mascota> findByClienteId(Integer clienteId);
}
