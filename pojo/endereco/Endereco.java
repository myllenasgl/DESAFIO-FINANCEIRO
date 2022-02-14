package com.mv.pojo.endereco;

public class Endereco {
    private String logradouro;
    private String UF;
    private String estado;
    private int numero;

    public Endereco(String logradouro, String UF, String estado, int numero) {
        this.logradouro = logradouro;
        this.UF = UF;
        this.estado = estado;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
