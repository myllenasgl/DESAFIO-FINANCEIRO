package com.mv.pojo.movimentacao;

import com.mv.pojo.repositorios.*;


public class CadastroMovimentacao {
    private RepositorioClientes clientes;
    private RepositorioMovimentacoes movimentacoes;
    private RepositorioConta contas;

    public CadastroMovimentacao(RepositorioClientes clientes, RepositorioMovimentacoes movimentacoes, RepositorioConta repositorioConta) {
        this.clientes = clientes;
        this.movimentacoes = movimentacoes;
        this.contas =  repositorioConta;
    }

    public void cadastrar(Movimentacao movimentacao) {
        movimentacoes.inserir(movimentacao);
    }
}

