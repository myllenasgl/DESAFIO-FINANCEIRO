package com.mv.pojo.repositorios;

import com.mv.pojo.clientes.Cliente;

public class RepositorioClientesBanco implements RepositorioClientes {


    @Override
    public void adicionarCliente(Cliente cliente) {

    }

    @Override
    public Cliente buscarCliente(String cpf) {
        return null;
    }

    @Override
    public void atualizarCliente(Cliente cliente) {

    }

    @Override
    public boolean existeCliente(String cpf) {
        return false;
    }
}
