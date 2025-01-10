package com.target.desafio_target.desafios;

import com.target.desafio_target.model.FaturamentoModel;

import java.util.Arrays;
import java.util.List;

public class FaturamentoDiario {
    public static void main(String[] args) {

        List<FaturamentoModel> faturamentos = Arrays.asList(
                new FaturamentoModel(200.0),
                new FaturamentoModel(450.0),
                new FaturamentoModel(0.0),
                new FaturamentoModel(300.0),
                new FaturamentoModel(600.0)
        );

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0.0;
        int diasComFaturamento = 0;

        for (FaturamentoModel f : faturamentos) {
            double valor = f.getValor();
            if (valor > 0) {
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
                soma += valor;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;

        int diasAcimaMedia = 0;
        for (FaturamentoModel f : faturamentos) {
            if (f.getValor() > media) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menor);
        System.out.println("Maior faturamento: " + maior);
        System.out.println("Dias acima da média: " + diasAcimaMedia);
    }
}