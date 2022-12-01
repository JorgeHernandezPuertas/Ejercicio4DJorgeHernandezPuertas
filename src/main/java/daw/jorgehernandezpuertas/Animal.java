/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.jorgehernandezpuertas;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author jorge
 */
public class Animal {

    // Atributos
    private LocalDate fechaNacimiento;
    private String nombre;
    private TipoAnimal tipo; // Puede ser: "gato", "perro", "lagarto", "cobaya", "periquito"
    private double peso; // En gramos
    private EstadoAnimal estado; // Puede ser: "comiendo", "durmiendo", "despierto/reposo" o "jugando"

    // Constructores
    public Animal() {
    }

    public Animal(LocalDate fechaNacimiento, String nombre, TipoAnimal tipo, double peso, EstadoAnimal estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado; 
    }

    // Getters
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    // Setters
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal{");
        sb.append("fechaNacimiento=").append(fechaNacimiento);
        sb.append(", nombre=").append(nombre);
        sb.append(", tipo=").append(tipo);
        sb.append(", peso=").append(peso);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

    // Método dormir
    public void dormir() {
        this.estado = EstadoAnimal.DURMIENDO;
    }

    // Método despertar
    public void despertar() {
        this.estado = EstadoAnimal.DESPIERTO;
    }

    // Método descansar
    public void descansar() {
        this.estado = EstadoAnimal.REPOSO;
    }

    // Método comer
    public void comer(double cantidadGramos) {
        cantidadGramos = Math.abs(cantidadGramos);
        this.peso += cantidadGramos;
        this.estado = EstadoAnimal.COMIENDO;
    }

    // Método jugar (El tiempo de juego serán minutos)
    public void jugar(int cantidadMinutos) {
        cantidadMinutos = Math.abs(cantidadMinutos); // Si es negativo la pongo positiva
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException();
        } else {
            this.estado = EstadoAnimal.JUGANDO;
            if (cantidadMinutos < 30) {
                this.peso -= 10;
            } else if (cantidadMinutos < 60) {
                this.peso -= 20;
            } else if (cantidadMinutos < 90) {
                this.peso -= 40;
            } else if (cantidadMinutos < 120) {
                this.peso -= 60;
            } else if (cantidadMinutos < 150) {
                this.peso -= 80;
            } else if (cantidadMinutos < 180) {
                this.peso -= 100;
            } else {
                this.peso -= 120;
            }
        }
    }

    // Método de clase para clonar un animal
    public static Animal clonar(Animal pet) {
        Animal petAux = new Animal();
        if (pet != null) {
            petAux.estado = pet.estado;
            petAux.fechaNacimiento = pet.fechaNacimiento;
            petAux.nombre = pet.nombre;
            petAux.peso = pet.peso;
            petAux.tipo = pet.tipo;
        }
        return petAux;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.tipo);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
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
        final Animal other = (Animal) obj;
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return this.tipo == other.tipo;
    }
}
