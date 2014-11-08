/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.acld.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * @author joseluis
 */
public class Country {

    private Long id;
    @NotNull
    private String nombre;
    @Max(value = 3)
    private String code;

    public Country(String nombre, String code) {
        this.nombre = nombre;
        this.code = code;
    }

    public Country() {
    }

    public Country(Long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
