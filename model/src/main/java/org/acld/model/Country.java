
package org.acld.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

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
