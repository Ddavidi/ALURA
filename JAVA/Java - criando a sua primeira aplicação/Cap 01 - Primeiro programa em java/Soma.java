/*
   ==UserScript==
 @name         Cap.01 - Desafio 4
 @namespace    https://github.com/Ddavidi/ALURA
 @description  ALURA -  Java: criando a sua primeira aplicação
 @author       @ddavidi_
   ==/UserScript==
*/

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt(); 
        int num2 = scan.nextInt();
        int total = num1+num2;

        System.out.println("Soma: " + total);

        scan.close();
    }
}
