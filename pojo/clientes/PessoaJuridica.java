package com.mv.pojo.clientes;

import com.mv.pojo.endereco.Endereco;

public class PessoaJuridica extends Cliente {
    private String CNPJ;


    public PessoaJuridica(String razao, String cnpj, String telefone, Endereco endereco, String dataCadastro, double saldo) {
        super(razao, telefone, endereco, dataCadastro, saldo);
        this.CNPJ = CNPJ;
    }

    public void setIdentificacao(String CNPJ) {

        this.CNPJ = CNPJ;
    }

    @Override
    public String getIdentificacao() {
        return CNPJ;
    }
}
