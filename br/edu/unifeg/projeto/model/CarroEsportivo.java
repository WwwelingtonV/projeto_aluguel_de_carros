package br.edu.unifeg.projeto.model;

public class CarroEsportivo extends Aluguel{

    public CarroEsportivo(String nome, int idade, Boolean cnhValida, int tempoHabilitado, int diasAlugados, Double valorDiario,
        Double multaPorHora, int horasAtrasadas){
            super(nome, idade ,cnhValida, tempoHabilitado, diasAlugados, valorDiario, multaPorHora, horasAtrasadas);
            calculoTotal(diasAlugados, horasAtrasadas, valorDiario, multaPorHora);
        }

    @Override
    public void seguro(){
        System.out.println(" --- SEGURO DO VEÍCULO ESPORTIVO --- ");
        System.out.println("Plano Premium!\n");
    }

    //Carro esportivo paga o triplo no total e na multa
    @Override
    public Double calculoTotal(int diasAlugados, int horasAtrasadas, Double valorDiario, Double multaPorHora){
        this.valorTotal = (diasAlugados * valorDiario) * 3;
        this.valorTotalMulta = (horasAtrasadas * multaPorHora) * 3;
        this.total = valorTotal + valorTotalMulta;
        return total;
    }
}