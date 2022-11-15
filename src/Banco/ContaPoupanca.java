package Banco;

import Cliente.Conta;

public class ContaPoupanca extends Conta {



    public void trasnferir(Double valor) {

    }


    public void depositar(Conta contaDestino, Double valor) {

    }


    public void imprimirExtrato (){

        System.out.println("===Extrato Cliente.Conta Poupanca ===");
        super.ImprimirInfoComuns();

    }



}