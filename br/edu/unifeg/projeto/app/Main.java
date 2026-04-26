package br.edu.unifeg.projeto.app;

import br.edu.unifeg.projeto.model.*;

public class Main {
    public static void main(String[] args){

        Double valorDiarioPopular = 150.0;
        Double valorDiarioSuv = 250.0;
        Double valorDiarioEsportivo = 1000.0;
        Double multaDiarioPopular = valorDiarioPopular * 0.2;
        Double multaDiarioSuv = valorDiarioSuv * 0.2;
        Double multaDiarioEsportivo = valorDiarioEsportivo * 0.2;

        //Aluguel de carro popular
        try{
        CarroPopular cp1 = new CarroPopular("Welington", 30, true, 3, 5, valorDiarioPopular, multaDiarioPopular, 0);
        cp1.seguro();
        cp1.relatorio();
        // a1.calcularValorTotal(5, valorDiarioPopular);
        // a1.calcularMulta(7, multaDiarioPopular);
        cp1.calculoTotal(5, 0, valorDiarioPopular, multaDiarioPopular);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Aluguel de carro suv
        try{
        CarroSuv cs1 = new CarroSuv("Welington", 30, true, 3, 5, valorDiarioSuv, multaDiarioSuv, 0);
        cs1.seguro();
        cs1.relatorio();
        cs1.calculoTotal(5, 0, valorDiarioSuv, multaDiarioSuv);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Aluguel de carro esportivo
        try{
        CarroEsportivo ce1 = new CarroEsportivo("Welington", 30, true, 3, 5, valorDiarioEsportivo, multaDiarioEsportivo, 0);
        ce1.seguro();
        ce1.relatorio();
        ce1.calculoTotal(5, 0, valorDiarioEsportivo, multaDiarioEsportivo);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}