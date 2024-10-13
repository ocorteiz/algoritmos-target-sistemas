package br.com.ocorteiz;

import java.util.Scanner;

public class AChecker {

    public static int contarOcorrenciasDeA(String texto) {
        int cont = 0;

        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'A') {
                cont++;
            }
        }

        return cont;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---VEJA A QUANTIDADE DE LETRAS 'A' NA SUA STRING");
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        int quantidadeDeA = contarOcorrenciasDeA(texto);

        if (quantidadeDeA > 0) {
            System.out.println("A letra 'a' foi encontrada " + quantidadeDeA + " vez(es).");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        scanner.close();
    }

}
