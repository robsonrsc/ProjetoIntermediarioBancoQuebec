import Cliente.Conta;
import Banco.ContaCorrente;
import Banco.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100.00);
        Conta poupanca = new ContaPoupanca();


        cc.trasnferir(poupanca,50.00);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}