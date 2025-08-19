//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria contaDoUsuario = new ContaBancaria();

        contaDoUsuario.depositar(1000);
        System.out.println("Saldo: " + contaDoUsuario.getSaldo());

        //contaDoUsuario.sacar(700);
        contaDoUsuario.setLimiteSaque(800);
        contaDoUsuario.sacar(700);
        System.out.println("Saldo final: " + contaDoUsuario.getSaldo());
    }
}

class ContaBancaria {
    private double saldo = 0;
    private double limiteSaque = 500;

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("O depósito tem que ser maior que 0 !");
            return;
        }
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido para saque !");
            return;
        } else if (valor > limiteSaque) {
            System.out.println("Vc ultrapassou o limite de saque !");
            return;
        } else if (valor > saldo) {
            System.out.println("Salso insuficiente !");
            return;
        }else {
            saldo = saldo - valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double novoLimite){
        if(novoLimite <= 0){
            System.out.println("Limite inválido.");
            return;
        }
        this.limiteSaque = novoLimite;
    }
}