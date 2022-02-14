package com.mv.pojo.clientes;
import com.mv.pojo.endereco.Endereco;


public abstract class Cliente {
    private String nome;
    private String telefone;
    private Endereco endereco;
    private String dataCadastro;
    private double saldo;

    public Cliente() {
        this.nome = null;
        this.telefone = null;
        this.endereco = null;
        this.dataCadastro = null;
        this.saldo = 0;
    }


    public Cliente(String nome, String telefone, Endereco endereco, String dataCadastro, double saldo) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
        this.saldo = saldo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract String getIdentificacao();
    public abstract void setIdentificacao(String id);
}
