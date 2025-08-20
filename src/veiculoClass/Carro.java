package veiculoClass;

public class Carro extends Veiculo {
    private int quantPortas;

    public Carro(String marca, String modelo, int ano, int quantPortas){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quantPortas = quantPortas;
    }

    public void exibirInfo(){
        System.out.println("Marca" + marca);
        System.out.println("Modelo" + modelo);
        System.out.println("Ano" + ano);
        System.out.println("Portas" + quantPortas);
    }
}
