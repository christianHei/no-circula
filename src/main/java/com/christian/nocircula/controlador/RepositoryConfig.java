package com.christian.nocircula.controlador;

import com.christian.nocircula.modelo.Restriccion;
import com.christian.nocircula.modelo.Vehiculo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Vehiculo.class);
        config.exposeIdsFor(Restriccion.class);
    }
}