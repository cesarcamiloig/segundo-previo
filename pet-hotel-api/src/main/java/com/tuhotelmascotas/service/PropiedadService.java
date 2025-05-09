package com.tuhotelmascotas.service;

import com.tuhotelmascotas.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuhotelmascotas.repository.PropiedadRepository;

@Service
public class PropiedadService {

    private final PropiedadRepository propiedadRepository;

    @Autowired
    public PropiedadService(PropiedadRepository propiedadRepository) {
        this.propiedadRepository = propiedadRepository;
    }

    public List<Propiedad> listarPropiedades() {
        return propiedadRepository.findAll();
    }
    
    public Propiedad actualizarPropiedad(int id, Propiedad nuevaData) {
        return propiedadRepository.findById(id).map(prop -> {
            prop.setNombre(nuevaData.getNombre());
            prop.setDescripcion(nuevaData.getDescripcion());
            prop.setDireccion(nuevaData.getDireccion());
            prop.setCapacidad(nuevaData.getCapacidad());
            prop.setPrecioPorNoche(nuevaData.getPrecioPorNoche());
            return propiedadRepository.save(prop);
        }).orElseThrow(() -> new RuntimeException("Propiedad no encontrada"));
    }

}

