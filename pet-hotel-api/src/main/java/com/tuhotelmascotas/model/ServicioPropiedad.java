package com.tuhotelmascotas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "servicios_propiedades")
public class ServicioPropiedad {
    @EmbeddedId
    private ServicioPropiedadId id;

    @ManyToOne
    @MapsId("propiedadId")
    @JoinColumn(name = "propiedad_id")
    private Propiedad propiedad;

    @ManyToOne
    @MapsId("servicioId")
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;

	public ServicioPropiedadId getId() {
		return id;
	}

	public void setId(ServicioPropiedadId id) {
		this.id = id;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
    
}

