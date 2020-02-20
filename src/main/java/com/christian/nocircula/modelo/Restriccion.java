package com.christian.nocircula.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;

@Entity
public class Restriccion implements Serializable {

    private static final long serialVersionUID = -9079295086628958950L;

    @Id
    @SequenceGenerator(name = "sequence_restriccion", sequenceName = "sequence_restriccion", allocationSize = 1)
    @GeneratedValue(generator = "sequence_restriccion", strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String dia;

    private String digito;

    public Restriccion() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }
}
