package com.mv.pojo.movimentacao;

import com.mv.pojo.clientes.*;
import com.mv.pojo.conta.Conta;

public class Movimentacao {
    private Cliente cliente;
    private Conta conta;
    private String tipo;//e = entrada, s = saida
    private double valor;
    private String data;


    public Movimentacao() {
        this.cliente = null;
        this.conta = null;
        this.tipo = null;
        this.valor = 0;
        this.data = null;

    }

    public Movimentacao(Cliente cliente, Conta conta, String tipo, double valor, String data) {
        this.cliente = cliente;
        this.conta = conta;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
