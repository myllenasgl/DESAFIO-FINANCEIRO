package com.mv.pojo.conta;

import com.mv.pojo.exceptions.CBJCexception;
import com.mv.pojo.exceptions.CNEexception;
import com.mv.pojo.repositorios.RepositorioClientes;
import com.mv.pojo.repositorios.RepositorioConta;

public class CadastroConta {
    private RepositorioClientes clientes;
    private RepositorioConta contas;

    public CadastroConta(RepositorioClientes repositorioClientes, RepositorioConta repositorioConta) {
        this.clientes = repositorioClientes;
        this.contas = repositorioConta;
    }

    public void cadastrar(Conta conta) throws CBJCexception {
        if(contas.existe(conta.getNumero())) {
            throw new CBJCexception();
        }else{
            contas.inserir(conta);
        }
    }
    public void atualizar(Conta conta) throws CNEexception {
        if(contas.existe(conta.getNumero())) {
            contas.atualizar(conta);
        }else{
            throw new CNEexception();
        }
    }
    public void remover(String numero) throws CNEexception {
        if(contas.existe(numero)) {
            
            contas.remover(numero);
        }else{
            throw new CNEexception();
        }
    }
}
