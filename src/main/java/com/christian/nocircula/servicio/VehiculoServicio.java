package com.christian.nocircula.servicio;

import com.christian.nocircula.modelo.Vehiculo;
import com.christian.nocircula.repositorio.VehiculoRepositorio;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Service
public class VehiculoServicio {

    @Autowired
    VehiculoRepositorio vehiculoRepositorio;

    @PersistenceContext
    private EntityManager em;

    public List<Vehiculo> obtenerTodo(){
        return Lists.newArrayList(vehiculoRepositorio.findAll());
    }

    public Optional<Vehiculo> obtenerPorId(Long id) {
        return vehiculoRepositorio.findById(id);
    }

    public Vehiculo obtenerPorPlaca(String placa) {
        Query q = em.createNamedQuery("Vehiculo.obtenerPorPlaca");
        q.setParameter("placa", placa);
        return (Vehiculo) q.getSingleResult();
    }
}
