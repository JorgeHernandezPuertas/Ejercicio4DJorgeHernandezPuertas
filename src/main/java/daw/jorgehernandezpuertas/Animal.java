/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.jorgehernandezpuertas;

import java.time.LocalDate;

/**
 *
 * @author jorge
 */
public class Animal {

    // Atributos
    private LocalDate fechaNacimiento;
    private String nombre;
    private String tipo; // Puede ser: "gato", "perro", "lagarto", "cobaya", "periquito"
    private double peso; // En gramos
    private String estado; // Puede ser: "comiendo", "durmiendo", "despierto/reposo" o "jugando"

    // Constructores
    public Animal() {
    }

    public Animal(LocalDate fechaNacimiento, String nombre, String tipo, double peso, String estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        // Si no es un tipo permitido se pone null
        this.tipo = (tipo.equals("gato") || tipo.equals("perro")
                || tipo.equals("largarto") || tipo.equals("cobaya")
                || tipo.equals("periquito")) ? tipo : null;
        this.peso = peso;
        this.estado = (estado.equals("comiendo")
                || estado.equals("durmiendo") || estado.equals("despierto")
                || estado.equals("reposo") || estado.equals("jugando"))
                ? estado : null; // Si no está permitido se pone null
    }

    // Getters
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public String getEstado() {
        return estado;
    }

    // Setters
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstado(String estado) {
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
        this.estado = "durmiendo";
    }

    // Método despertar
    public void despertar() {
        this.estado = "despierto";
    }

    // Método descansar
    public void descansar() {
        this.estado = "reposo";
    }
    
    // Método comer
    public void comer(double cantidadGramos)  {
        this.peso += cantidadGramos;
    }

    // Método jugar (El tiempo de juego serán minutos)
    public void jugar(int cantidadMinutos) {
        cantidadMinutos = Math.abs(cantidadMinutos); // Si es negativo la pongo positiva
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException();
        } else {
            this.estado = "jugando";
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
            } else {
                this.peso -= 100;
            }
        }
    }

    // Método de clase para clonar un animal
    public static Animal clonar(Animal pet) {
        Animal petAux = new Animal();
        petAux.estado = pet.estado;
        petAux.fechaNacimiento = pet.fechaNacimiento;
        petAux.nombre = pet.nombre;
        petAux.peso = pet.peso;
        petAux.tipo = pet.tipo;
        return petAux;
    }
}
