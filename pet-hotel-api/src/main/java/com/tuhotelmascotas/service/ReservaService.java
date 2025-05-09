package com.tuhotelmascotas.service;

import com.tuhotelmascotas.model.Reserva;
import com.tuhotelmascotas.model.Servicio;
import com.tuhotelmascotas.model.ServicioReserva;
import com.tuhotelmascotas.repository.ReservaRepository;
import com.tuhotelmascotas.repository.ServicioReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepo;

    @Autowired
    private ServicioReservaRepository srRepo;

    /** c. Crear una reserva */
    public Reserva crearReserva(Reserva reserva) {
        return reservaRepo.save(reserva);
    }

    /** e. Listar servicios de una reserva */
    public List<Servicio> listarServiciosDeReserva(Integer reservaId) {
        return srRepo.findByReservaId(reservaId).stream()
                     .map(ServicioReserva::getServicio)
                     .collect(Collectors.toList());
    }
}
