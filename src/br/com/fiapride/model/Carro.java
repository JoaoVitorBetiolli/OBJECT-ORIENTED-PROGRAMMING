package br.com.fiapride.model;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    private int velocidade;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.ligado = false;
        this.velocidade = 0;
    }

    // GETTERS

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    // SETTERS (privados)

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private void setAno(int ano) {
        if (ano > 1885) {
            this.ano = ano;
        } else {
            System.out.println("Erro: ano inválido.");
        }
    }

    // MÉTODOS

    public void ligar() {

        if (ligado) {
            System.out.println("Erro: O carro já está ligado.");
            return;
        }

        ligado = true;
        System.out.println("Carro ligado.");
    }

    public void acelerar(int valor) {

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