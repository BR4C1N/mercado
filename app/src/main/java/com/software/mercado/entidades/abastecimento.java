package com.software.mercado.entidades;

public class abastecimento {
    private float quilometragem;
    private float quantidadeAbastecida;
    private String data;
    private float valor;

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public float getQuantidadeAbastecida() {
        return quantidadeAbastecida;
    }

    public void setQuantidadeAbastecida(float quantidadeAbastecida) {
        this.quantidadeAbastecida = quantidadeAbastecida;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
