/*
   ==UserScript==
 @name         Cap.02 - Desafio: hora da prática
 @namespace    https://github.com/Ddavidi/ALURA
 @description  ALURA -  Java: Construindo o catálogo de filmes
 @author       @ddavidi_
   ==/UserScript==
*/

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Desafio 1:
        System.out.println("Desafio 1:");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;

        System.out.println("Media: " + media);


        // Desafio 2:
        System.out.println("\nDesafio 2:");
        int variavelInt = 10;
        double variavelDouble = 5.9;

        System.out.println("Casting: " + variavelInt);
        System.out.println("Casting: " + (int)(variavelDouble));


        // Desafio 3:
        System.out.println("\nDesafio 3:");
        char letra = 'X';
        String palavra = "-Men";
        String mensagem = letra + palavra;

        System.out.println(mensagem);


        // Desafio 4:
        System.out.println("\nDesafio 4:");
        double PrecoProduto = 2.50;
        int quantidade = 10;
        double total = PrecoProduto * quantidade;

        System.out.println("Total:" + total);


        // Desafio 5:
        System.out.println("\nDesafio 5:");
        double valorEmDolares = scan.nextDouble();
        double valorEmReais = valorEmDolares * 4.94;

        System.out.println(String.format("R$: %.2f", valorEmReais));


        // Desafio 6:
        System.out.println("\nDesafio 6:");
        double precoOriginal = 12.50;
        double percentualDesconto = 10.0/100.0;
        double precoNovo = precoOriginal - precoOriginal * percentualDesconto;

        System.out.println(String.format("R$: %.2f", precoNovo));

        scan.close();
    }
}
