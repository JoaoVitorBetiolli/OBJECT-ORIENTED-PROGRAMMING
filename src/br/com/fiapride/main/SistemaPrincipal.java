package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {
       
        Carro carro1 = new Carro();
        carro1.marca = "Honda";
        carro1.modelo = "Fit";
        carro1.ano = 2012;

        Carro carro2 = new Carro();
        carro2.marca = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2026;

        
        System.out.println("A marca do meu carro 1 é: " + carro1.marca);
        System.out.println("O modelo do meu carro 1 é: " + carro1.modelo);
        System.out.println("O ano do meu carro 1 é: " + carro1.ano);
        System.out.println("A marca do meu carro 1 é: " + carro1.marca);
        System.out.println("O modelo do meu carro 1 é: " + carro1.modelo);
        System.out.println("O ano do meu carro 1 é: " + carro1.ano);
          
        
        
    }
}