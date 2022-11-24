/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw.jorgehernandezpuertas;

/**
 *
 * @author jorge
 */
public enum EstadoAnimal {
    
    // enums
    DESPIERTO(1, "despierto"),
    DURMIENDO(2, "durmiendo"),
    JUGANDO(3, "jugando"),
    REPOSO(4, "reposo"),
    COMIENDO(5, "comiendo");
    
    // Atributos
    private int codigoEstado;
    private String estado;
    
    // Constructor
    private EstadoAnimal(int codigoEstado, String estado){
        this.codigoEstado = codigoEstado;
        this.estado = estado;
    }
    
}
