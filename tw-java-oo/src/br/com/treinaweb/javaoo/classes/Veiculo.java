package br.com.treinaweb.javaoo.classes;

public class Veiculo {
    //Atributos
    private String nome;
    private String marca;
    private String chassi;
    private Integer quantidadeRodas;

    //Métodos Acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Integer getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(Integer quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    //Métodos
    public void ligar() {
        System.out.println("O veículo ligou!");
    }

    public void desligar() {
        System.out.println("O veículo desligou!");
    }

}
