package com.mv.pojo.repositorios;
import com.mv.pojo.clientes.Cliente;
import com.mv.pojo.movimentacao.Movimentacao;

public interface RepositorioMovimentacoes {

    public void inserir(Movimentacao movimentacao);
    public Movimentacao buscar(Movimentacao movimentacao);
    public Movimentacao listar(Cliente cliente);

}
