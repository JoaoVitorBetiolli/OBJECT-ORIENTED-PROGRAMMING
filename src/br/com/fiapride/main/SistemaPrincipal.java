package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Criando o primeiro carro
        Carro carro1 = new Carro("Honda", "Fit", 2012, "ABC-1234");

        System.out.println("Ligando carro 1");
        carro1.ligar();
        carro1.acelerar(50);

        // Criando o segundo carro
        Carro carro2 = new Carro("Toyota", "Corolla", 2020, "XYZ-9876");

        System.out.println("Tentando acelerar carro 2 sem ligar");
        carro2.acelerar(30);

        System.out.println("\n--- Sistema FiapRide ---");

        System.out.println("Carro 1: " + carro1.getMarca() +
                " | Modelo: " + carro1.getModelo() +
                " | Placa: " + carro1.getPlaca() +
                " | Ano: " + carro1.getAno() +
                " | Velocidade: " + carro1.getVelocidade());

        System.out.println("Carro 2: " + carro2.getMarca() +
                " | Modelo: " + carro2.getModelo() +
                " | Placa: " + carro2.getPlaca() +
                " | Ano: " + carro2.getAno() +
                " | Velocidade: " + carro2.getVelocidade());
    }
}