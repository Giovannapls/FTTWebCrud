# Integrantes
**Giovanna Polissici - 081180009**
**Isabela Vilas Boas - 081180016**

# Sobre o projeto:
Conta com 3 controllers: **Cliente, produto e WishList**
É necessário criar um cliente e um produto ao menos, para se adicionar um item
na wishlist de um cliente.

# Ferramentas usadas para o desenvolvimento:
|Ferramenta | Uso |
| ------------- | ------------- |
| ![](https://1.bp.blogspot.com/-F1oJ_RArUtg/Xh8YZhi-RoI/AAAAAAAABcA/BhSgIFFsA6s4xASRj5IGP-il-MWIkKouwCLcBGAsYHQ/s200/logoInteliJ.png)  |intellij - IDE  |
| ![](https://www.cursou.com.br/wp-content/uploads/2019/07/Curso-de-Spring-Boot.png)  | Spring Boot - Base para o projeto |
| ![](https://upload.wikimedia.org/wikipedia/commons/a/ab/Swagger-logo.png)  | Swagger - Documentação da Api |
| ![](http://pngimg.com/uploads/mysql/small/mysql_PNG23.png)  |Mysql - Banco de dados|
| ![](https://huongdanjava.com/wp-content/uploads/2018/01/spring-data.png)  |Spring Data JPA - conexão com o banco de dados|
| ![](https://www.chartjs.org/img/chartjs-logo.svg)  |Chart.js - Geração dos gráficos




# Api - Endpoint disponiveis
Visualização dos endpoints disponiveis via swagger:
![](https://i.ibb.co/syZNqP5/Cliente-Controller.png)
![](https://i.ibb.co/rcPQtbM/Produto-Controller.png)
![](https://i.ibb.co/Tcp0wD0/Wishlist-Controller.png)

# Web -  Algumas imagens
**Gráfico com os 5 produtos mais pedidos**
![](https://i.ibb.co/7nQzPYd/Horizontal-Chart.png)

**Gráfico com os 5 clientes com mais itens em suas WishLists**
![](https://i.ibb.co/DgxM3mg/BarChart.png)

**Cadastro de Cliente**
![](https://i.ibb.co/9qtk1QH/Cadastro-Cliente.png)

**Cadastro de Produto**
![](https://i.ibb.co/Wsd7wmq/Cadastro-Produto.png)

**Cadastro de Wish**
![](https://i.ibb.co/HghNXkX/Cadastro-Wish.png)

**Listagem de Clientes**
![](https://i.ibb.co/c8j3kmc/Listagem-Clientes.png)

# Rodando o projeto:
1.  Alterar o arquivo application.properties com as configurações adequadas do banco de dados local:
![](https://i.ibb.co/3z190T7/Banco-COnfig.png)
2. Rodar a Api
3. Trocar o endereço que a aplicação Web aponta para a url da api
4. Rodar a aplicação Web

**Obs:** É necessário criar apenas o banco de dados vazio,  o Spring Data JPA resolve a criação das tabelas sozinho quando ocorre atividade na API. :smile:
