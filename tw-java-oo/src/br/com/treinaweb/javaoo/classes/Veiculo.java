package br.com.treinaweb.javaoo.classes;
//Classe
public class Veiculo {
    
    //Atributos
    private String nome;
    private String marca;
    private String chassi;
    private Integer quantidadeRodas;
    private float quantidadeCombustivel;

    //Métodos Acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome; // THIS diz respeito a instância atual da classe onde o código está sendo executado. 'this.nome' refere-se à variável de instância, enquanto 'nome' refere-se ao parâmetro do método.
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

    public void setChassi(String chassi) throws Exception {
        if (chassi.length() == 5) {
            this.chassi = chassi;
        } else {
            throw new Exception("Chassi Inválido!");
        }
    }

    public Integer getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(Integer quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    //Métodos
    public void ligar() {
        System.out.println("O veículo ligou!");
    }

    public void desligar() {
        System.out.println("O veículo desligou!");
    }

    public float abastecer(float litros) {
        quantidadeCombustivel += litros;
        return quantidadeCombustivel;
    }

    public void quantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

}
