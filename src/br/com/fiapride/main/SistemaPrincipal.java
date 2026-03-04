package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Criando o primeiro carro
        Carro carro1 = new Carro("Honda", "Fit", 2012);

        System.out.println("Ligando carro 1");
        carro1.ligar();
        carro1.acelerar(50);

        // Criando o segundo carro
        Carro carro2 = new Carro("Toyota", "Corolla", 2020);

        System.out.println("Tentando acelerar carro 2 sem ligar");
        carro2.acelerar(30); // inválido

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Carro 1: " + carro1.marca + " | Modelo: " + carro1.modelo + 
                           " | Ano: " + carro1.ano + " | Velocidade: " + carro1.velocidade);

        System.out.println("Carro 2: " + carro2.marca + " | Modelo: " + carro2.modelo + 
                           " | Ano: " + carro2.ano + " | Velocidade: " + carro2.velocidade);
    }
}