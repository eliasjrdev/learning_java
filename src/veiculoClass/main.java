package veiculoClass;

public class main {
    public static void main(String[] args){
        Carro carro = new Carro("Toyota", "Corolla", 2025, 4);

        carro.acelerar();
        carro.exibirInfo();
    }
}
