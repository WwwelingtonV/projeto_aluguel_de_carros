package br.edu.unifeg.projeto.app;

import br.edu.unifeg.projeto.model.*;

public class Main {
    public static void main(String[] args){

        Double valorDiario = 150.0;
        Double multaDiaria = valorDiario * 0.2;

        //Aluguel de carro popular
        try{
        CarroPopular cp1 = new CarroPopular("Welington", 30, true, 3, 5, valorDiario, multaDiaria, 0);
        cp1.seguro();
        cp1.relatorio();
        cp1.calculoTotal(5, 0, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Aluguel de carro suv
        try{
        CarroSuv cs1 = new CarroSuv("Welington", 30, true, 3, 5, valorDiario, multaDiaria, 0);
        cs1.seguro();
        cs1.relatorio();
        cs1.calculoTotal(5, 0, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Aluguel de carro esportivo
        try{
        CarroEsportivo ce1 = new CarroEsportivo("Welington", 30, true, 3, 5, valorDiario, multaDiaria, 0);
        ce1.seguro();
        ce1.relatorio();
        ce1.calculoTotal(5, 0, valorDiario, multaDiaria);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}