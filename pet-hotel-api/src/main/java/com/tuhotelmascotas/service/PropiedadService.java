package com.tuhotelmascotas.service;

import com.tuhotelmascotas.model.Propiedad;
import com.tuhotelmascotas.model.ServicioPropiedad;
import com.tuhotelmascotas.model.ServicioPropiedadId;
import com.tuhotelmascotas.repository.PropiedadRepository;
import com.tuhotelmascotas.repository.ServicioPropiedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropiedadService {

    @Autowired
    private PropiedadRepository propiedadRepo;

    @Autowired
    private ServicioPropiedadRepository spRepo;

    /** a. Listar todas las propiedades */
    public List<Propiedad> listarPropiedades() {
        return propiedadRepo.findAll();
    }

    /** d. Actualizar una propiedad */
    public Propiedad actualizarPropiedad(Integer id, Propiedad data) {
        return propiedadRepo.findById(id)
            .map(p -> {
                p.setNombre(data.getNombre());
                p.setDescripcion(data.getDescripcion());
                p.setDireccion(data.getDireccion());
                p.setCapacidad(data.getCapacidad());
                p.setPrecioPorNoche(data.getPrecioPorNoche());
                return propiedadRepo.save(p);
            })
            .orElseThrow(() -> new RuntimeException("Propiedad no encontrada"));
    }

    /** f. Agregar un servicio a una propiedad */
    public void agregarServicioAPropiedad(Integer propiedadId, Integer servicioId) {
        ServicioPropiedad rel = new ServicioPropiedad();
        rel.setId(new ServicioPropiedadId(propiedadId, servicioId));
        spRepo.save(rel);
    }

    /** h. Desasociar un servicio de una propiedad */
    public void desasociarServicioDePropiedad(Integer propiedadId, Integer servicioId) {
        spRepo.deleteById(new ServicioPropiedadId(propiedadId, servicioId));
    }
}
