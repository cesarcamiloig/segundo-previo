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

    /** GET /api/propiedades */
    @GetMapping
    public List<Propiedad> listar() {
        return propiedadService.listarPropiedades();
    }

    /** PUT /api/propiedades/{id} */
    @PutMapping("/{id}")
    public Propiedad actualizar(@PathVariable Integer id,
                                @RequestBody Propiedad body) {
        return propiedadService.actualizarPropiedad(id, body);
    }

    /** POST /api/propiedades/{propiedadId}/servicios/{servicioId} */
    @PostMapping("/{propiedadId}/servicios/{servicioId}")
    public void añadirServicio(@PathVariable Integer propiedadId,
                               @PathVariable Integer servicioId) {
        propiedadService.agregarServicioAPropiedad(propiedadId, servicioId);
    }

    /** DELETE /api/propiedades/{propiedadId}/servicios/{servicioId} */
    @DeleteMapping("/{propiedadId}/servicios/{servicioId}")
    public void quitarServicio(@PathVariable Integer propiedadId,
                               @PathVariable Integer servicioId) {
        propiedadService.desasociarServicioDePropiedad(propiedadId, servicioId);
    }
}
