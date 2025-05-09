package com.tuhotelmascotas.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "propiedades")
public class Propiedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cuidador_id")
    private Usuario cuidador;

    private String nombre;
    private String descripcion;
    private String direccion;
    private Integer capacidad;
    private BigDecimal precioPorNoche;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Usuario getCuidador() {
		return cuidador;
	}
	public void setCuidador(Usuario cuidador) {
		this.cuidador = cuidador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public BigDecimal getPrecioPorNoche() {
		return precioPorNoche;
	}
	public void setPrecioPorNoche(BigDecimal precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

    // Getters y setters
    
}
