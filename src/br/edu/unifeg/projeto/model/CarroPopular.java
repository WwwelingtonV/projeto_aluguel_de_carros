package br.edu.unifeg.projeto.model;

public class CarroPopular extends Aluguel {

    public CarroPopular(String nome, int idade, Boolean cnhValida, int tempoHabilitado, int diasAlugados,
            Double valorDiario,
            Double multaPorHora, int horasAtrasadas) {
        super(nome, idade, cnhValida, tempoHabilitado, diasAlugados, valorDiario, multaPorHora, horasAtrasadas);
        calculoTotal(diasAlugados, horasAtrasadas, valorDiario, multaPorHora);
    }

    @Override
    public void seguro() {
        System.out.println(" \n--- SEGURO DO VEÍCULO POPULAR --- ");
        System.out.println("Plano Padrão!\n");
    }

    // Carro popular paga o valor padrão no total e na multa
    @Override
    public Double calculoTotal(int diasAlugados, int horasAtrasadas, Double valorDiario, Double multaPorHora) {
        this.valorTotal = diasAlugados * valorDiario;
        this.valorTotalMulta = horasAtrasadas * multaPorHora;
        this.total = valorTotal + valorTotalMulta;
        return total;
    }

}