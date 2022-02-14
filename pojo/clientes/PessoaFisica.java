package com.mv.pojo.clientes;

import com.mv.pojo.endereco.Endereco;

public class PessoaFisica extends Cliente {
    private String RG;
    private String CPF;

    public PessoaFisica(String nome, String telefone, Endereco endereco, String dataCadastro, double saldo, String rg, String cpf) {
        super(nome, telefone, endereco, dataCadastro, saldo);
        this.RG = rg;
        this.CPF = cpf;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getIdentificacao() {
        return CPF;
    }

    public void setIdentificacao(String CPF) {
        this.CPF = CPF;
    }
}

