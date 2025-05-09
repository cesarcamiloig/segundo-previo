package com.tuhotelmascotas.controller;

import com.tuhotelmascotas.model.Mascota;
import com.tuhotelmascotas.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @GetMapping("/{id}")
    public Optional<Mascota> obtenerMascota(@PathVariable int id) {
        return mascotaService.buscarMascotaPorId(id);
    }
}
