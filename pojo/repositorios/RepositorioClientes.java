package com.mv.pojo.repositorios;

import com.mv.pojo.clientes.*;

public interface RepositorioClientes {
    public void adicionarCliente(Cliente cliente);
    public Cliente buscarCliente(String cpf);
    public void atualizarCliente(Cliente cliente);
    public boolean existeCliente(String cpf);

}
