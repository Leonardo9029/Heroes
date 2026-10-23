package com.argandona.heroes.dto;

public class HeroeDto {
    private long id;
    private String nombre ;

    public HeroeDto(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Heroe{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
