package org.example;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, int quantidade, Categoria categoria, Fornecedor fornecedor, String dataValidade) {
        super(nome, quantidade, categoria, fornecedor);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de Validade: " + dataValidade;
    }
}
