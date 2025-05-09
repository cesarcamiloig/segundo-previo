package com.tuhotelmascotas.service;

import com.tuhotelmascotas.model.Mascota;
import com.tuhotelmascotas.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepo;

    /** b. Buscar mascota por ID */
    public Optional<Mascota> buscarPorId(Integer id) {
        return mascotaRepo.findById(id);
    }

    /** g. Listar mascotas de un usuario */
    public List<Mascota> listarPorUsuario(Integer usuarioId) {
        return (List<Mascota>) mascotaRepo.findByClienteId(usuarioId);
    }
}
