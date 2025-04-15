package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        do {
            try {
                System.out.println("\n--- Menu de Gerenciamento de Produtos ---");
                System.out.println("1. Cadastrar Produto");
                System.out.println("2. Remover Produto");
                System.out.println("3. Adicionar Quantidade");
                System.out.println("4. Listar Produtos");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do produto: ");
                        String nome = scanner.nextLine();

                        System.out.print("Digite a quantidade: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("O produto é perecível? (s/n): ");
                        String tipo = scanner.nextLine();

                        System.out.print("Digite o nome da categoria: ");
                        String catNome = scanner.nextLine();
                        Categoria categoria = new Categoria(catNome);

                        System.out.print("Digite o nome do fornecedor: ");
                        String fornecedorNome = scanner.nextLine();
                        Fornecedor fornecedor = new Fornecedor(fornecedorNome);

                        if (tipo.equalsIgnoreCase("s")) {
                            System.out.print("Digite a data de validade (dd/mm/yyyy): ");
                            String dataValidade = scanner.nextLine();
                            Produto produto = new ProdutoPerecivel(nome, quantidade, categoria, fornecedor, dataValidade);
                            gerenciador.cadastrarProduto(produto);
                        } else {
                            Produto produto = new ProdutoNaoPerecivel(nome, quantidade, categoria, fornecedor);
                            gerenciador.cadastrarProduto(produto);
                        }
                        break;

                    case 2:
                        System.out.print("Digite o nome do produto a ser removido: ");
                        String nomeRemover = scanner.nextLine();
                        try {
                            gerenciador.removerProduto(nomeRemover);
                        } catch (ProdutoNaoEncontradoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        System.out.print("Digite o nome do produto: ");
                        String nomeAdicionar = scanner.nextLine();
                        System.out.print("Digite a quantidade a ser adicionada: ");
                        int quantidadeAdicionar = scanner.nextInt();
                        scanner.nextLine();
                        try {
                            gerenciador.inserirQuantidade(nomeAdicionar, quantidadeAdicionar);
                        } catch (ProdutoNaoEncontradoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 4:
                        gerenciador.listarProdutos();
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira o valor correto.");
                scanner.nextLine();
            }
        } while (opcao != 0);

        scanner.close();
    }
}
