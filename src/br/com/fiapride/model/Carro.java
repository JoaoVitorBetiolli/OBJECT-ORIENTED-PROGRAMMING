package br.com.fiapride.model;

public class Carro {

    public String marca;
    public String modelo;
    public int ano;
    public boolean ligado;
    public int velocidade;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
        this.velocidade = 0;
    }

    public void ligar() {
        // Regra de negócio: não pode ligar se já estiver ligado
        if (ligado) {
            System.out.println("Erro: O carro já está ligado.");
            return;
        }

        ligado = true;
        System.out.println("Carro ligado.");
    }

    public void acelerar(int valor) {
        // Regra de negócio:
        // 1 - O carro precisa estar ligado
        // 2 - O valor deve ser positivo
        if (!ligado) {
            System.out.println("Erro: O carro precisa estar ligado para acelerar.");
            return;
        }

        if (valor <= 0) {
            System.out.println("Erro: O valor da aceleração deve ser positivo.");
            return;
        }

        velocidade += valor;
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}