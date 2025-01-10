package com.target.desafio_target.desafios;

import java.util.Scanner;

public class InversãoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = sc.nextLine();
        sc.close();

        String invertida = inverterString(input);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String str) {
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        return invertida;
    }
}