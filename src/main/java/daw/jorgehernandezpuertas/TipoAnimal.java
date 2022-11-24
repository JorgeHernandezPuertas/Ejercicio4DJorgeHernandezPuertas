/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw.jorgehernandezpuertas;

/**
 *
 * @author jorge
 */
public enum TipoAnimal {
    
    // Enums
    GATO(1, "gato"), 
    PERRO(2, "perro"), 
    COBAYA(3, "cobaya"), 
    LAGARTO(4, "lagarto"), 
    PERIQUITO(5, "periquito");
    
    // Atributos
    private int codigoTipoAnimal;
    private String tipoAnimal;
    
    // Constructor privado
    private TipoAnimal(int codigoTipoAnimal, String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
        this.codigoTipoAnimal = codigoTipoAnimal;
    }

    // Getters
    public static TipoAnimal getGATO() {
        return GATO;
    }

    public static TipoAnimal getPERRO() {
        return PERRO;
    }

    public static TipoAnimal getCOBAYA() {
        return COBAYA;
    }

    public static TipoAnimal getLAGARTO() {
        return LAGARTO;
    }

    public static TipoAnimal getPERIQUITO() {
        return PERIQUITO;
    }

    public int getCodigoTipoAnimal() {
        return codigoTipoAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }
    
}
