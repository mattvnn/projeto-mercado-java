<h2>Gerenciador de Produtos</h2>

Gerenciador de Produtos é uma aplicação em Java feita para gerenciamento básico de um estoque, permitindo cadastrar, listar, remover e atualizar a quantidade de produtos em um sistema de mercado. Os produtos podem ser perecíveis ou não perecíveis, e cada um pertence a uma categoria e tem um fornecedor associado. 

<h2>Como foi feito</h2>

Este projeto foi desenvolvido em Java, utilizando apenas a biblioteca padrão. A aplicação roda em linha de comando (CLI) e usa o paradigma de orientação a objetos.

<h2>Funcionalidades</h2>

Cadastrar produtos (perecíveis ou não)

Remover produtos

Adicionar quantidade a produtos existentes

Listar todos os produtos cadastrados (ordenados pelo nome)

<h2>Estrutura do Projeto</h2>

Produto (classe abstrata)

ProdutoPerecivel e ProdutoNaoPerecivel

Categoria, Fornecedor

GerenciadorProdutos (responsável pela lógica de controle)

ProdutoNaoEncontradoException (exceção personalizada)

Main (ponto de entrada da aplicação)
