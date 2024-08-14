/*
   ==UserScript==
 @name         Cap.01 - Desafio 1 e Desafio 2
 @namespace    https://github.com/Ddavidi/ALURA
 @description  ALURA -  Java: criando a sua primeira aplicação
 @author       @ddavidi_
   ==/UserScript==
*/

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = scan.nextLine();

        System.out.println("Ola, " + nome + "!");
        System.out.println("Tudo bem, " + nome + "?");

        scan.close();
    }
}