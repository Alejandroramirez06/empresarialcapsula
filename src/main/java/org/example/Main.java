package org.example;

import org.example.modelos.Herramienta;
import org.example.modelos.Samurai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Samurai samurai=new Samurai();
        Herramienta herramienta=new Herramienta("escopeta", 90.0);

        Samurai samuraiDos=new Samurai();
        Herramienta herramientaDos=new Herramienta("metralleta", 20.0);
        Scanner entradaPorTeclado=new Scanner(System.in);

        samurai.setNombres("Surioon");
        System.out.println("Digita la edad del primer samurai: ");
        samurai.setEdad(entradaPorTeclado.nextInt());

        System.out.print("**********RESULTADOS*********** ");
        System.out.println("El samurai: "+samurai.getNombres()+" Tiene: "+samurai.getEdad());

    }
}