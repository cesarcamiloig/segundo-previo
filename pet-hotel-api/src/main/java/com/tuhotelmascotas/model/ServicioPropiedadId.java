package com.tuhotelmascotas.model;

import java.io.Serializable;
import java.util.Objects;

public class ServicioPropiedadId implements Serializable {
    private Integer propiedadId;
    private Integer servicioId;
    
    public ServicioPropiedadId() {
    }

    // Constructor completo (opcional)
    public ServicioPropiedadId(Integer propiedadId, Integer servicioId) {
        this.propiedadId = propiedadId;
        this.servicioId = servicioId;
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
