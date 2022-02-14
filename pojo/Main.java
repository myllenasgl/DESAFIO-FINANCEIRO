package com.mv.pojo;
import com.mv.pojo.clientes.*;;
import com.mv.pojo.conta.*;
import com.mv.pojo.endereco.*;
import com.mv.pojo.exceptions.CJCexception;
import com.mv.pojo.movimentacao.*;
import com.mv.pojo.repositorios.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;




public class Main {
    public static void main(String[] args) throws CJCexception {
        RepositorioConta repositorioConta = new RepositorioContaBanco();
        RepositorioClientes repositorioClientes = new RepositorioClientesBanco();
        RepositorioMovimentacoes repositorioMovimentacoes = new RepositorioMovimentacoesBanco();
        CadastroMovimentacao cadastroMovimentacao = new CadastroMovimentacao(repositorioClientes, repositorioMovimentacoes, repositorioConta);
        CadastroConta cadastroConta = new CadastroConta( repositorioClientes, repositorioConta);
        CadastroCliente cadastroCliente = new CadastroCliente(repositorioClientes);

        PessoaFisica pessoaFisica;
        pessoaFisica = new PessoaFisica("João", "123.456.789-00", new Endereco("Rua da Paz", "PE", "Recife", 99), "26/01/2022", 0, "123.456.789-00", "123.456.789-00");
        cadastroCliente.cadastrar(pessoaFisica);
        PessoaJuridica pessoaJuridica;
        pessoaJuridica = new PessoaJuridica ("Lelis lTDA", "12.345.678/0001-96", new Endereco("Rua 13", "PE", "Recife", 355 ), "15/01/2022", 1, "12.345.678/0001-96", "12.345.678/0001-96");
        cadastroCliente.cadastrar(pessoaJuridica);


    }
}
