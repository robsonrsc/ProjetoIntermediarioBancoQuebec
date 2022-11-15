package Cliente;

import Banco.Iconta;

public abstract class Conta implements Iconta {


     private static int SEQUENCIAL = 1;

    private static  final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int cc;
    private double saldo;




    public Conta (){

        this.agencia   = Conta.AGENCIA_PADRAO;
        this.cc= SEQUENCIAL++;

    }


    public int getAgencia() { return agencia;    }

    public int getCc() { return cc;    }

    public double getSaldo() { return saldo;  }


    @Override
    public void sacar(Double valor) {

        saldo-=valor;

    }

    @Override
    public void depositar(Double valor) {
        saldo+=valor;

    }

    @Override
    public void trasnferir(Conta contaDestino, Double valor) {
    this.sacar(valor);
    contaDestino.depositar(valor);

    }


    protected void ImprimirInfoComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Cliente.Conta: %d", this.cc));
        System.out.println(String.format("Saldo %.2f", this.getSaldo()));
    }


}