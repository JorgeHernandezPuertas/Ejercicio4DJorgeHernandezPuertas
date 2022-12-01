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
public class Prueba {

    public static void main(String[] args) {
        // Creo dos objetos animal
        Animal a2 = new Animal();
        Animal a1 = new Animal(LocalDate.of(2006, 2, 12),
                "milo", TipoAnimal.PERRO, 3430, EstadoAnimal.DURMIENDO);

        // Creo dos personas
        Persona p1 = new Persona("Jorge", 22);
        Persona p2 = new Persona("Cristina", 22);

        // Imprimo por consola a1 y a2
        System.out.println(a1);
        System.out.println(a2);

        // Copio a2 en a3
        Animal a3 = Animal.clonar(a2);

        // p1 despierta a todos los animales
        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);

        // p2 juega con a2 durante 120 minutos
        p2.jugar(a2, 120);

        // p1 alimenta a a1 1000 gramos e imprimo su peso
        p1.alimentar(a1, 1000);
        System.out.println("a1 pesa " + a1.getPeso() + " gramos");

        // p1 juega con a1 durante 200 minutos (no se puede y jugará 180 minutos)
        p1.jugar(a1, 200);
        System.out.println("a1 pesa " + a1.getPeso() + " gramos");
        
        
        
        
        
    }
}
