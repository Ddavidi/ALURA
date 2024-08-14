/*
   ==UserScript==
 @name         Cap.01 - Desafio 3
 @namespace    https://github.com/Ddavidi/ALURA
 @description  ALURA -  Java: criando a sua primeira aplicação
 @author       @ddavidi_
   ==/UserScript==
*/

import java.util.Scanner;

public class Estudos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String anotacoes = scan.nextLine();

        System.out.println("Anotações de estudos: " + anotacoes);

        scan.close();
    }
}
