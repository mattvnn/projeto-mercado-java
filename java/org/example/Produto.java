package org.example;

public abstract class Produto implements Comparable<Produto> {
    protected String nome;
    protected int quantidade;
    protected Categoria categoria;
    protected Fornecedor fornecedor;

    public Produto(String nome, int quantidade, Categoria categoria, Fornecedor fornecedor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    @Override
    public int compareTo(Produto other) {
        return this.nome.compareToIgnoreCase(other.nome);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Quantidade: " + quantidade
                + ", Categoria: " + categoria
                + ", Fornecedor: " + fornecedor;
    }
}