package com.mv.pojo.clientes;
import com.mv.pojo.exceptions.*;
import com.mv.pojo.repositorios.RepositorioClientes;

public class CadastroCliente {
    private RepositorioClientes clientes;

    public CadastroCliente(RepositorioClientes clientes) {
        this.clientes = clientes;
    }

    public void cadastrar(Cliente cliente) throws CJCexception {
        if(clientes.existeCliente(cliente.getIdentificacao())) {
            throw new CJCexception();
        }else{
            clientes.adicionarCliente(cliente);
        }
    }
    public void atualizaCliente(Cliente cliente) throws CNCexception, ANPexception {
        if(clientes.existeCliente(cliente.getIdentificacao())) {
            if (cliente.getIdentificacao().equals(clientes.buscarCliente(cliente.getIdentificacao()))) {
                clientes.atualizarCliente(cliente);
            } else {
                throw new ANPexception();
            }
        }else{
                throw new CNCexception();
            }
        }


    }


