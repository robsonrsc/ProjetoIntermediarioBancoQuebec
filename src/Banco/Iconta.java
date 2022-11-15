package Banco;

import Cliente.Conta;

public interface Iconta {


    public void sacar(Double valor);
    public void trasnferir(Double valor);
    public void depositar(Conta contaDestino, Double valor);

    void imprimirExtrato ();

    void depositar(Double valor);

    void trasnferir(Conta contaDestino, Double valor);
}
