package com.target.desafio_target.desafios;

import com.target.desafio_target.model.FaturamentoModel;

import java.util.HashMap;
import java.util.Map;

public class FaturamentoEstados {
    public static void main(String[] args) {
        Map<String, FaturamentoModel> faturamentoEstados = new HashMap<>();
        faturamentoEstados.put("SP", new FaturamentoModel(67836.43));
        faturamentoEstados.put("RJ", new FaturamentoModel(36678.66));
        faturamentoEstados.put("MG", new FaturamentoModel(29229.88));
        faturamentoEstados.put("ES", new FaturamentoModel(27165.48));
        faturamentoEstados.put("Outros", new FaturamentoModel(19849.53));


        double total = faturamentoEstados.values().stream()
                .mapToDouble(FaturamentoModel::getValor)
                .sum();


        for (Map.Entry<String, FaturamentoModel> entry : faturamentoEstados.entrySet()) {
            String estado = entry.getKey();
            double percentual = (entry.getValue().getValor() / total) * 100;
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }
}
