package com.mv.pojo.repositorios;
import com.mv.pojo.conta.*;

public interface RepositorioConta {
    public void inserir(Conta conta);
    public void remover(String numero);
    public Conta procurar(String numero);
    public void atualizar(Conta conta);
    public boolean existe(String numero);
    public Conta[] listar();
}

