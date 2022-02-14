package com.mv.pojo.conta;

import com.mv.pojo.clientes.*;

public class Conta {
    private String numero;
    private String agencia;
    private String digito;
    private Cliente titular;
    private String dataAbertura;
    private boolean excluida;
    private double saldo;

    public Conta() {
        this.numero = null;
        this.agencia = null;
        this.digito = null;
        this.titular = null;
        this.excluida = false;

    }

    public Conta(String numero, String agencia, String digito, Cliente titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.digito = digito;
        this.titular = titular;
        this.excluida = false;

    }
//gettes e setters

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public boolean isExcluida() {
        return excluida;
    }

    public void setExcluida(boolean excluida) {
        this.excluida = excluida;
    }

}