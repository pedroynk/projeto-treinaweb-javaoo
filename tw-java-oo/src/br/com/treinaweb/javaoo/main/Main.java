package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo corsa = new Veiculo();
        //Corsa é uma instância de Veículo e new Veículo é um contrutor, o que garante que a JVM reservasse memória para armazenar esse objeto.
        corsa.setMarca("Chevrolet");
        corsa.setNome("Corsa");
        corsa.abastecer(10);

        Veiculo celta = new Veiculo();
        //Celta é uma instância de Veículo e new Veículo é um contrutor, o que garante que a JVM reservasse memória para armazenar esse objeto.
        celta.setMarca("Chevrolet");
        celta.setNome("Celta");
        celta.abastecer(15);

        System.out.println(celta.getNome());
        System.out.println(celta.getMarca());
        celta.ligar();
        System.out.println("O CELTA tem: " + celta.getQuantidadeCombustivel() + " Litros no Tanque!");
        System.out.println("---------------------");
        System.out.println(corsa.getNome());
        System.out.println(corsa.getMarca());
        corsa.ligar();
        System.out.println("O CORSA tem: " + corsa.getQuantidadeCombustivel() + " Litros no Tanque!");
    }
}
