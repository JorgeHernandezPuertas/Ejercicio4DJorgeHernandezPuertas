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
        this.tipo = (tipo.equals("gato") || tipo.equals("perro") || tipo.equals("largarto")
                || tipo.equals("cobaya") || tipo.equals("periquito")  ) ? tipo:null;
        this.peso = peso;
        this.estado = (estado.equals("comiendo") || estado.equals("durmiendo") || 
                estado.equals("despierto") || estado.equals("reposo") || 
                estado.equals("jugando")) ? estado:null;
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
    
    
    
}
