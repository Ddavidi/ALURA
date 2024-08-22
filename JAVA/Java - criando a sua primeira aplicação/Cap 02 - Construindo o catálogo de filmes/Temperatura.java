/*
   ==UserScript==
 @name         Cap.02 - Faça como eu fiz: conversão de temperaturas
 @namespace    https://github.com/Ddavidi/ALURA
 @description  ALURA -  Java: Construindo o catálogo de filmes
 @author       @ddavidi_
   ==/UserScript==
*/

import java.util.Scanner;

public class Temperatura {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temperaturaCelsius = scan.nextDouble();
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
        System.out.println("Temperatura em Fahrenheit: " + (int)(temperaturaFahrenheit));

        scan.close();
    }
}