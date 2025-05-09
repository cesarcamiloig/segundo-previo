package com.tuhotelmascotas.service;

import com.tuhotelmascotas.model.*;
import com.tuhotelmascotas.repository.MascotaRepository;
import com.tuhotelmascotas.repository.ReservaRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    @Autowired
    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public Reserva crearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
}

