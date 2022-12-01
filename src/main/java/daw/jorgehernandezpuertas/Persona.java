/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.jorgehernandezpuertas;

import java.util.Objects;

/**
 *
 * @author jorge
 */
public class Persona {

    // Atributos de la persona
    private String nombre;
    private int edad;

    // Constructores
    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        if (edad < 0) {
            throw new IllegalArgumentException();
        } else {
            this.edad = edad;
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException();
        } else {
            this.edad = edad;
        }
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    // Método llamar
    public void llamar(Animal pet) {
        pet.despertar();
    }

    //Método alimentar
    public void alimentar(Animal pet, double cantidadGramos) {
        pet.comer(cantidadGramos);
    }

    // Método jugar
    public void jugar(Animal pet, int cantidadMinutos) {
        cantidadMinutos = Math.abs(cantidadMinutos);
        try {
            pet.jugar(cantidadMinutos);
        } catch (IllegalArgumentException iae) {
            pet.jugar(180); // Cantidad máxima permitida
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + this.edad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
}
