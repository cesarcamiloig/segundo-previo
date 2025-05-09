package com.tuhotelmascotas.controller;

import com.tuhotelmascotas.model.Propiedad;
import com.tuhotelmascotas.service.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propiedades")
public class PropiedadController {

    @Autowired
    private PropiedadService propiedadService;

    @GetMapping
    public List<Propiedad> listarPropiedades() {
        return propiedadService.listarPropiedades();
    }

    @PutMapping("/{id}")
    public Propiedad actualizarPropiedad(@PathVariable int id, @RequestBody Propiedad nuevaData) {
        return propiedadService.actualizarPropiedad(id, nuevaData);
    }
}

