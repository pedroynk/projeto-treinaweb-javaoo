package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo corsa = new Veiculo();
        //Corsa é uma instância de Veículo e new Veículo é um contrutor, o que garante que a JVM reservasse memória para armazenar esse objeto
        corsa.setMarca("Chevrolet");
        corsa.setNome("Corsa");
        corsa.ligar();

        Veiculo celta = new Veiculo();
        celta.setMarca("Chevrolet");
        celta.setNome("Celta");
        celta.ligar();

        System.out.println(celta.getNome());
        System.out.println(celta.getMarca());
        System.out.println("---------------------");
        System.out.println(corsa.getNome());
        System.out.println(corsa.getMarca());
    }
}
