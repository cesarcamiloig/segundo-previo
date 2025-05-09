package com.tuhotelmascotas.repository;

import com.tuhotelmascotas.model.ServicioReserva;
import com.tuhotelmascotas.model.ServicioReservaId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicioReservaRepository
    extends JpaRepository<ServicioReserva, ServicioReservaId> {

    // Debe devolver la entidad intermedia, no el Servicio directo
    List<ServicioReserva> findByReservaId(Integer reservaId);
}
