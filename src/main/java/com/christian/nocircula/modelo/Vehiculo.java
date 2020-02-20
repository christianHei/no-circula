package com.christian.nocircula.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;

@Entity
@NamedQueries({
        @NamedQuery(name = "Vehiculo.obtenerPorPlaca", query = "SELECT v FROM Vehiculo v WHERE v.placa = :placa")
}
)
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = -4307356211267512127L;

    @Id
    @SequenceGenerator(name = "sequence_vehiculo", sequenceName = "sequence_vehiculo", allocationSize = 1)
    @GeneratedValue(generator = "sequence_vehiculo", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String placa;

    private String color;

    private String modelo;

    private String chasis;

    @Column(name = "año")
    private Integer anio;

    public Vehiculo() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
}
