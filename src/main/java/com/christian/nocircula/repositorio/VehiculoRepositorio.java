package com.christian.nocircula.repositorio;

import com.christian.nocircula.modelo.Vehiculo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "vehiculos", path = "vehiculo")
public interface VehiculoRepositorio extends PagingAndSortingRepository<Vehiculo, Long> {
}
