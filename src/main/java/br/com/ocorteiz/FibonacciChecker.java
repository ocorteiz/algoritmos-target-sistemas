package br.com.ocorteiz;

import java.util.Scanner;

public class FibonacciChecker {

    public static boolean pertenceFibonnaci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0, b = 1, soma;

        while (b < n) {
            soma = a + b;
            a = b;
            b = soma;
        }

        return b == n;
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        int n = 0;

        System.out.println("---VEJA SE UM NUMERO FAZ PARTE DA SEQUENCIA DE FIBONACCI---");
        System.out.print("Informe um número: ");
        entrada = sc.next();

        while (!isNumeric(entrada)) {
            System.out.println("Por favor, insira um número válido.");
            System.out.print("Informe um número: ");
            entrada = sc.next();
        }

        n = Integer.parseInt(entrada);

        if (pertenceFibonnaci(n)) {
            System.out.println("O número " + n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + n + " NÃO pertence à sequência de Fibonacci.");
        }

    }

}
