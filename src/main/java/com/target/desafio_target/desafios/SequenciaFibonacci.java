package com.target.desafio_target.desafios;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        sc.close();

        boolean pertence = isFibonacci(num);
        if (pertence) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, temp;
        while (a <= num) {
            if (a == num) return true;
            temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }
}