package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorProdutos {
    private List<Produto> produtos;

    public GerenciadorProdutos() {
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado.");
    }

    public void removerProduto(String nome) throws ProdutoNaoEncontradoException {
        boolean removido = produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
        if (removido) {
            System.out.println("Produto removido.");
        } else {
            throw new ProdutoNaoEncontradoException("Produto não encontrado para remoção.");
        }
    }

    public void inserirQuantidade(String nome, int quantidade) throws ProdutoNaoEncontradoException {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setQuantidade(produto.getQuantidade() + quantidade);
                System.out.println("Quantidade adicionada.");
                return;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto não encontrado para adicionar quantidade.");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            // Ordena produtos por nome
            Collections.sort(produtos);
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }
}
