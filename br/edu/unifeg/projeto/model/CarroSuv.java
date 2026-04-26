package br.edu.unifeg.projeto.model;

public class CarroSuv extends Aluguel{
    private String nome;
    private int idade;
    private Boolean cnhValida;
    private int tempoHabilitado;
    private int diasAlugados;
    private Double valorDiario;
    private Double valorTotal;
    private Double multaPorHora;
    private int horasAtrasadas;
    private Double valorTotalMulta;
    private Double total;

    public CarroSuv(String nome, int idade, Boolean cnhValida, int tempoHabilitado, int diasAlugados, Double valorDiario,
        Double multaPorHora, int horasAtrasadas){
            super(nome, idade ,cnhValida, tempoHabilitado, diasAlugados, valorDiario, multaPorHora, horasAtrasadas);
            validarCliente(idade, cnhValida, tempoHabilitado);
            calculoTotal(diasAlugados, horasAtrasadas, valorDiario, multaPorHora);
            this.nome = nome;
            this.idade = idade;
            this.cnhValida = cnhValida;
            this.diasAlugados = diasAlugados;
            this.tempoHabilitado = tempoHabilitado;
            this.valorDiario = valorDiario;
            this.multaPorHora = multaPorHora;
            this.horasAtrasadas = horasAtrasadas;
        }

    @Override
    public void seguro(){
        System.out.println(" --- SEGURO DO VEÍCULO --- ");
        System.out.println("Plano Avançado!\n");
    }
    
    @Override
    public void validarCliente(int idade, Boolean cnhValida, int tempoHabilitado){
        if(idade < 25){
            throw new IllegalArgumentException("Erro! Só é permitido alugar veículos para maiores de 25 anos!");
        }
        if(!cnhValida){
            throw new IllegalArgumentException("Erro! Cliente não possui carteira de habilitação!");
        }
        if(tempoHabilitado < 2){
            throw new IllegalArgumentException("Erro! Cliente deve possuir 2 anos de habilitação definitiva!");
        }
    }

    @Override
    public Double calculoTotal(int diasAlugados, int horasAtrasadas, Double valorDiario, Double multaPorHora){
        this.valorTotal = diasAlugados * valorDiario;
        this.valorTotalMulta = horasAtrasadas * multaPorHora;
        this.total = valorTotal + valorTotalMulta;
        return total;
    }

    @Override
    public void relatorio() {
        System.out.println("--- RELATORIO DO CLIENTE: " + nome + " ---");
        System.out.println("Idade do Cliente: " + idade + " anos");
        System.out.println("Tempo habilitado: " + tempoHabilitado + " anos");
        System.out.println("Dias alugados: " + diasAlugados + " dias");
        System.out.println("Valor sem multa: R$" + valorTotal);
        System.out.println("Horas de Atraso: " + horasAtrasadas + " horas");
        System.out.println("Valor da Multa: R$" + valorTotalMulta);
        System.out.println("Valor Total: R$" + total);
        System.out.println("------------------------------\n");
    }
}