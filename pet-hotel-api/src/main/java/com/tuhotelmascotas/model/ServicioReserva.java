package com.tuhotelmascotas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "servicios_reservas")
public class ServicioReserva {
    @EmbeddedId
    private ServicioReservaId id;

    @ManyToOne
    @MapsId("reservaId")
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;

    @ManyToOne
    @MapsId("servicioId")
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;

    private Boolean estado;

	public ServicioReservaId getId() {
		return id;
	}

	public void setId(ServicioReservaId id) {
		this.id = id;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
    
}


