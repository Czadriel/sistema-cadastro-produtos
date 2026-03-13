# 🧾 Sistema de Cadastro de Produtos em Java

Este projeto foi desenvolvido em **Java** com o objetivo de praticar **Programação Orientada a Objetos (POO)**.
O sistema permite cadastrar diferentes tipos de produtos e exibir suas **etiquetas de preço** de acordo com suas características.

---

## 📌 Funcionalidades

O programa permite cadastrar três tipos de produtos:

* **Produto Comum**
* **Produto Usado**
* **Produto Importado**

Cada tipo possui informações específicas:

| Tipo de Produto   | Atributos                       |
| ----------------- | ------------------------------- |
| Produto comum     | Nome, Preço                     |
| Produto importado | Nome, Preço, Taxa de importação |
| Produto usado     | Nome, Preço, Data de fabricação |

Após o cadastro, o sistema exibe as **etiquetas de preço (Price Tags)** de todos os produtos cadastrados.

---

## ⚙️ Como o programa funciona

1. O usuário informa quantos produtos deseja cadastrar.
2. Para cada produto são solicitadas as seguintes informações:

   * Tipo do produto (`c` = comum, `u` = usado, `i` = importado)
   * Nome do produto
   * Preço
3. Dependendo do tipo escolhido, o programa solicita dados adicionais:

   * **Importado:** taxa de importação
   * **Usado:** data de fabricação
4. Todos os produtos são armazenados em uma **lista (`List<Product>`)**.
5. Ao final, o programa percorre a lista e exibe as **etiquetas de preço**.

---

## 🧠 Conceitos de POO utilizados

Este projeto utiliza conceitos fundamentais da **Programação Orientada a Objetos**:

* **Herança**
  As classes `ImportedProduct` e `UsedProduct` herdam da classe `Product`.

* **Polimorfismo**
  Cada tipo de produto pode sobrescrever o método responsável por exibir a etiqueta de preço.

* **Encapsulamento**
  Os atributos das classes são protegidos e acessados por métodos apropriados.

---

## 📂 Estrutura do Projeto

```
src
 ├── application
 │   └── Program.java
 │
 └── entities
     ├── Product.java
     ├── ImportedProduct.java
     └── UsedProduct.java
```

---

## ▶️ Exemplo de execução

```
Enter the number of products: 2

Product #1 data:
Common, used or imported (c/u/i): c
Name: TV
Price: 900.00

Product #2 data:
Common, used or imported (c/u/i): i
Name: Notebook
Price: 1100.00
Customs fee: 200.00

PRICE TAGS:
TV $ 900.00
Notebook $ 1300.00 (Customs fee: $ 200.00)
```

---

## 🛠 Tecnologias utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Collections (`List`, `ArrayList`)
* `Scanner` para entrada de dados
* `SimpleDateFormat` para manipulação de datas

---

## 🎯 Objetivo do projeto

Este projeto foi criado para **praticar herança e polimorfismo em Java**, simulando um pequeno sistema de cadastro de produtos.

Ele faz parte dos meus estudos em **Análise e Desenvolvimento de Sistemas** com foco em **Desenvolvimento Back-End Java**.
