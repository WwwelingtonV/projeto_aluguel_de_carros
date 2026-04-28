package br.edu.unifeg.projeto.model;

abstract class Aluguel implements Relatorio {
    private String nome;
    private int idade;
    private Boolean cnhValida;
    private int tempoHabilitado;
    private int diasAlugados;
    private Double valorDiario;
    protected Double valorTotal; // Protected para poder ser acessado pelas classes filhas
    private Double multaPorHora;
    private int horasAtrasadas;
    protected Double valorTotalMulta; // Protected para poder ser acessado pelas classes filhas
    protected Double total; // Protected para poder ser acessado pelas classes filhas

    // Preencher os dados do cliente que deseja alugar o veículo
    public Aluguel(String nome, int idade, Boolean cnhValida, int tempoHabilitado, int diasAlugados, Double valorDiario,
            Double multaPorHora, int horasAtrasadas) {
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

    // Método Abstrato
    public abstract void seguro();

    // Validar se os dados são aptos para alugar e retornar esses IllegalArguments
    // em um TryCatch na main
    public void validarCliente(int idade, Boolean cnhValida, int tempoHabilitado) {
        if (idade < 25) {
            throw new IllegalArgumentException("\nErro! Só é permitido alugar veículos para maiores de 25 anos!\n---------------------------------------------------------------");
        }
        if (!cnhValida) {
            throw new IllegalArgumentException("\nErro! Cliente não possui carteira de habilitação!\n---------------------------------------------------------------");
        }
        if (tempoHabilitado < 2) {
            throw new IllegalArgumentException("\nErro! Cliente deve possuir 2 anos de habilitação definitiva!\n---------------------------------------------------------------");
        }
    }

    // Construtor para calcular o valor baseado no tempo alugado
    // public Double calcularValorTotal(int diasAlugados, Double valorDiario){
    // this.valorTotal = diasAlugados * valorDiario;
    // return valorTotal;
    // }

    // //Construtor para calcular a multa
    // public Double calcularMulta(int horasAtrasadas, Double multaPorHora){
    // this.valorTotalMulta = horasAtrasadas * multaPorHora;
    // return valorTotalMulta;
    // }

    public Double calculoTotal(int diasAlugados, int horasAtrasadas, Double valorDiario, Double multaPorHora) {
        this.valorTotal = diasAlugados * valorDiario;
        this.valorTotalMulta = horasAtrasadas * multaPorHora;
        this.total = valorTotal + valorTotalMulta;
        return total;
    }

    // Construtor para imprimir um relatório
    public void gerarRelatorio() {
        System.out.println("--- RELATORIO DO CLIENTE: " + nome + " ---");
        System.out.println("Idade do Cliente: " + idade + " anos");
        System.out.println("Tempo habilitado: " + tempoHabilitado + " ano(s)");
        System.out.println("Dias alugados: " + diasAlugados + " dia(s)");
        System.out.println("Valor sem multa: R$ " + valorTotal);
        System.out.println("Horas de Atraso: " + horasAtrasadas + " hora(s)");
        System.out.println("Valor da Multa: R$ " + valorTotalMulta);
        System.out.println("Valor Total: R$ " + total);
        System.out.println("---------------------------------------------");
    }

    // GETTERS
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public Boolean getCnhValida() {
        return this.cnhValida;
    }

    public int getTempoHabilitado() {
        return this.tempoHabilitado;
    }

    public int DiasAlugados() {
        return this.diasAlugados;
    }

    public Double getValorDiario() {
        return this.valorDiario;
    }

    public Double getValorTotal() {
        return this.valorTotal;
    }

    public Double getMultaPorHora() {
        return this.multaPorHora;
    }

    public int getHorasAtrasadas() {
        return this.horasAtrasadas;
    }

    public Double getValorTotalMulta() {
        return this.valorTotalMulta;
    }

    public Double getTotal() {
        return this.total;
    }
}