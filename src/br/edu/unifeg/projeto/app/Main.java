package br.edu.unifeg.projeto.app;

import br.edu.unifeg.projeto.model.*;

public class Main {
    public static void main(String[] args) {

        Double valorDiario = 150.0;
        Double multaDiaria = valorDiario * 0.2; //20% do valor diário



        // ALUGUEL DE CARRO POPULAR
        //1º Exemplo - Sem Erros e Sem Multa
        try {
            CarroPopular cp1 = new CarroPopular("Maria Aparecida", 30, true, 3, 5, valorDiario, multaDiaria, 0);
            cp1.seguro();
            cp1.gerarRelatorio();
            cp1.calculoTotal(5, 0, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //2º Exemplo - Sem Erros e Com Multa
        try {
            CarroPopular cp1 = new CarroPopular("Pedro Augusto", 32, true, 10, 60, valorDiario, multaDiaria, 24);
            cp1.seguro();
            cp1.gerarRelatorio();
            cp1.calculoTotal(60, 24, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //3º Exemplo - Erro Idade < 25
        try {
            CarroPopular cp1 = new CarroPopular("Antônia Pedroso", 21, true, 3, 20, valorDiario, multaDiaria, 2);
            cp1.seguro();
            cp1.gerarRelatorio();
            cp1.calculoTotal(20, 2, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //4º Exemplo - Todos os Erros - Lista o Primeiro Erro Encontrado
        try {
            CarroPopular cp1 = new CarroPopular("Ricardo Alves", 20, false, 0, 2, valorDiario, multaDiaria, 3);
            cp1.seguro();
            cp1.gerarRelatorio();
            cp1.calculoTotal(2, 3, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }



        // ALUGUEL DE CARRO SUV
        //1º Exemplo - Sem Erros e Sem Multa
        try {
            CarroSuv cs1 = new CarroSuv("João Henrique", 47, true, 26, 30, valorDiario, multaDiaria, 0);
            cs1.seguro();
            cs1.gerarRelatorio();
            cs1.calculoTotal(30, 0, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //2º Exemplo - Sem Erros e Com Multa
        try {
            CarroSuv cs1 = new CarroSuv("Amanda Pereira", 56, true, 36, 45, valorDiario, multaDiaria, 13);
            cs1.seguro();
            cs1.gerarRelatorio();
            cs1.calculoTotal(45, 13, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //3º Exemplo - CNH Inválida
        try {
            CarroSuv cs1 = new CarroSuv("Suellen dos Santos", 29, false, 5, 12, valorDiario, multaDiaria, 0);
            cs1.seguro();
            cs1.gerarRelatorio();
            cs1.calculoTotal(12, 0, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //4º Exemplo - Todos os Erros - Lista o Primeiro Erro Encontrado
        try {
            CarroSuv cs1 = new CarroSuv("Paulo Almeida", 24, false, 0, 8, valorDiario, multaDiaria, 24);
            cs1.seguro();
            cs1.gerarRelatorio();
            cs1.calculoTotal(8, 24, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }



        // ALUGUEL DE CARRO ESPORTIVO
        //1º Exemplo - Sem Erros e Sem Multa
        try {
            CarroEsportivo ce1 = new CarroEsportivo("Guilherme Borges", 25, true, 7, 13, valorDiario, multaDiaria, 0);
            ce1.seguro();
            ce1.gerarRelatorio();
            ce1.calculoTotal(13, 0, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //2º Exemplo - Sem Erros e Com Multa
        try {
            CarroEsportivo ce1 = new CarroEsportivo("Fernanda Oliveira", 29, true, 2, 3, valorDiario, multaDiaria, 36);
            ce1.seguro();
            ce1.gerarRelatorio();
            ce1.calculoTotal(3, 36, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //3º Exemplo - Tempo Habilitado < 2
        try {
            CarroEsportivo ce1 = new CarroEsportivo("Flávia Lima", 39, true, 1, 16, valorDiario, multaDiaria, 12);
            ce1.seguro();
            ce1.gerarRelatorio();
            ce1.calculoTotal(16, 12, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //4º Exemplo - Todos os Erros - Lista o Primeiro Erro Encontrado
        try {
            CarroEsportivo ce1 = new CarroEsportivo("Alan Costa", 18, false, 0, 1, valorDiario, multaDiaria, 0);
            ce1.seguro();
            ce1.gerarRelatorio();
            ce1.calculoTotal(1, 0, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}