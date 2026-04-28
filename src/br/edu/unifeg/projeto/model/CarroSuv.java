package br.edu.unifeg.projeto.model;

public class CarroSuv extends Aluguel {

    public CarroSuv(String nome, int idade, Boolean cnhValida, int tempoHabilitado, int diasAlugados,
            Double valorDiario,
            Double multaPorHora, int horasAtrasadas) {
        super(nome, idade, cnhValida, tempoHabilitado, diasAlugados, valorDiario, multaPorHora, horasAtrasadas);
        calculoTotal(diasAlugados, horasAtrasadas, valorDiario, multaPorHora);
    }

    @Override
    public void seguro() {
        System.out.println(" \n--- SEGURO DO VEÍCULO SUV --- ");
        System.out.println("Plano Avançado!\n");
    }

    // Carro Suv paga o dobro no total e na multa
    @Override
    public Double calculoTotal(int diasAlugados, int horasAtrasadas, Double valorDiario, Double multaPorHora) {
        this.valorTotal = (diasAlugados * valorDiario) * 2;
        this.valorTotalMulta = (horasAtrasadas * multaPorHora) * 2;
        this.total = valorTotal + valorTotalMulta;
        return total;
    }

}