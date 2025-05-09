package com.tuhotelmascotas.service;

import com.tuhotelmascotas.model.*;
import com.tuhotelmascotas.repository.MascotaRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MascotaService {

    private final MascotaRepository mascotaRepository;

    @Autowired
    public MascotaService(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    public Optional<Mascota> buscarMascotaPorId(int id) {
        return mascotaRepository.findById(id);
    }
}

