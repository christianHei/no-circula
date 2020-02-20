package com.christian.nocircula.repositorio;

import com.christian.nocircula.modelo.Restriccion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "restrictions", path = "restriction")
public interface RestriccionRepositorio extends PagingAndSortingRepository<Restriccion, Integer> {
}
