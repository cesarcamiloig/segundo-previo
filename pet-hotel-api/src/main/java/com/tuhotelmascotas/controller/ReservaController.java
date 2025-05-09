package com.tuhotelmascotas.controller;

import com.tuhotelmascotas.model.Reserva;
import com.tuhotelmascotas.model.Servicio;
import com.tuhotelmascotas.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    /** POST /api/reservas */
    @PostMapping
    public Reserva crear(@RequestBody Reserva r) {
        return reservaService.crearReserva(r);
    }

    /** GET /api/reservas/{id}/servicios */
    @GetMapping("/{id}/servicios")
    public List<Servicio> servicios(@PathVariable Integer id) {
        return reservaService.listarServiciosDeReserva(id);
    }
}
