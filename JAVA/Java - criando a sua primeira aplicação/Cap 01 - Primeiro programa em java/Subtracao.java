/*
   ==UserScript==
 @name         Cap.01 - Desafio 5
 @namespace    https://github.com/Ddavidi/ALURA
 @description  ALURA -  Java: criando a sua primeira aplicação
 @author       @ddavidi_
   ==/UserScript==
*/

import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        float total = num1 - num2;

        System.out.println("Subtracao: " + total);

        scan.close();
    }
}
