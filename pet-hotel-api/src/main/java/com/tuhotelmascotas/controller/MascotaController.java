package com.tuhotelmascotas.controller;

import com.tuhotelmascotas.model.Mascota;
import com.tuhotelmascotas.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    /** GET /api/mascotas/{id} */
    @GetMapping("/{id}")
    public Optional<Mascota> obtener(@PathVariable Integer id) {
        return mascotaService.buscarPorId(id);
    }

    /** GET /api/mascotas/usuario/{usuarioId} */
    @GetMapping("/usuario/{usuarioId}")
    public List<Mascota> porUsuario(@PathVariable Integer usuarioId) {
        return mascotaService.listarPorUsuario(usuarioId);
    }
}
