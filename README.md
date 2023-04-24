# CRUD SIMPLES

Projeto feito para testar conhecimentos sobre persistência de dados usando as seguintes tecnologias:

Linguagem de programação: JAVA
Banco de Dados: PostgreSQL
Testes: JUnit
Gerenciador de dependências: Maven

Foi desenvolvido as quatro operações SELECT, DELETE, UPDATE e CREATE.

O projeto foi desenvoldido com a seguinte estrutura de pacotes

connection: Pacote que contém a classe ConnectionBD, responsável por abrir e fechar conexão com o banco de dados
model: Pacote que contém a classe Produto (Exemplo utilizado para desenvolvimento), contendo informações dos objetos a serem persistidos no banco
dao: Pacote que contém a classe ProdutoDAO, que fará conexão com o banco de dados, para persistência de dados.
test: Pacote que contém as classes de testes das operações.

