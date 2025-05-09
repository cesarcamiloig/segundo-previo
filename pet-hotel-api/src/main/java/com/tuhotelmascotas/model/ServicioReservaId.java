package com.tuhotelmascotas.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Embeddable
public class ServicioReservaId implements Serializable {
    private Integer reservaId;
    private Integer servicioId;
	@Override
	public int hashCode() {
		return Objects.hash(reservaId, servicioId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServicioReservaId other = (ServicioReservaId) obj;
		return Objects.equals(reservaId, other.reservaId) && Objects.equals(servicioId, other.servicioId);
	}
	public Integer getReservaId() {
		return reservaId;
	}
	public void setReservaId(Integer reservaId) {
		this.reservaId = reservaId;
	}
	public Integer getServicioId() {
		return servicioId;
	}
	public void setServicioId(Integer servicioId) {
		this.servicioId = servicioId;
	}

    // equals() y hashCode()
    
}

