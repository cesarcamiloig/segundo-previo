package com.tuhotelmascotas.model;

import java.io.Serializable;
import java.util.Objects;

public class ServicioPropiedadId implements Serializable {
    private Integer propiedadId;
    private Integer servicioId;
	public ServicioPropiedadId(Integer propiedadId2, Integer servicioId2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(propiedadId, servicioId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServicioPropiedadId other = (ServicioPropiedadId) obj;
		return Objects.equals(propiedadId, other.propiedadId) && Objects.equals(servicioId, other.servicioId);
	}
	public Integer getPropiedadId() {
		return propiedadId;
	}
	public void setPropiedadId(Integer propiedadId) {
		this.propiedadId = propiedadId;
	}
	public Integer getServicioId() {
		return servicioId;
	}
	public void setServicioId(Integer servicioId) {
		this.servicioId = servicioId;
	}

    // equals() y hashCode()
    
}
