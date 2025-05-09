package com.tuhotelmascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuhotelmascotas.model.*;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}

