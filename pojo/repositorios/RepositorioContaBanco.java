package com.mv.pojo.repositorios;

import com.mv.pojo.conta.Conta;

public class RepositorioContaBanco implements RepositorioConta{

    private Conta[] contas;
    private int indice;

    public RepositorioContaBanco() {
        contas = new Conta[100];
        indice = 0;
    }

    public void inserir(Conta conta) {
        contas[indice] = conta;
        indice++;
    }

    public Conta procurar(String numero) {
        Conta conta = null;
        for(int i = 0; i < contas.length; i++) {
            if(contas[i] != null && contas[i].getNumero().equals(numero)) {
                conta = contas[i];
                break;
            }
        }
        return conta;
    }

    public void remover(String numero) {
        for(int i = 0; i < contas.length; i++) {
            if(contas[i] != null && contas[i].getNumero().equals(numero)) {
                contas[i] = null;
                break;
            }
        }
    }

    public void atualizar(Conta conta) {
        for(int i = 0; i < contas.length; i++) {
            if(contas[i] != null && contas[i].getNumero().equals(conta.getNumero())) {
                contas[i] = conta;
                break;
            }
        }
    }

    @Override
    public boolean existe(String numero) {
        return false;
    }

    public Conta[] listar() {
        return contas;
    }

}
