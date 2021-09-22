![](https://img.shields.io/badge/Status-Page%20in%20construction-orange)
![](https://img.shields.io/badge/release-v01-green)


# Desafio

Criar um Crud Rest apenas de “CONSULTA” utilizando Spring Boot, Hibernate e JPA que liste os dados de empresa, onde: 

- [x] EndPoint: Rest Http Metodo do tipo GET com Response de um JSON conforme Model;
- [x]	Model: Com os valores de id, nome, email, empresa, cnpj. (Dados ficticios)
- [x]	Controller: Endpoint do request http://localhost:8080/listaEmpresas 
- [x]	Banco: Configurar o banco de dados h2database para armazenar os dados na memória que será    consultado em tempo de execução.

## Requisitos Técnicos

```bash
  JAVA SDK 11+
  Maven
```
## Instalação

Clonar o repositório, abrir o projeto e após instalado as dependências rodar a aplicação.

⚠ Certifique-se de ter o Java SDK 11+ e o Maven instalados na máquina antes.

## Requisição

#### Get all empresas
```http
  GET localhost:8080/listaEmpresas/
```
<details open> 
  <summary>
    Resposta
  </summary>
</details>

## Tabelas

| Parâmetro | Tipo    | Descrição |
| :-------- | :------- | :------------------------- |
| `id` | `Long` | **Chave Primária - PK** |
| `cnpj` | `Long` | **CNPJ - Not Null** |
| `email` | `String` | **E-mail** |
| `nome` | `String` | **Nome - Não pode ser em branco** |

<details open> 
  <summary>
    Sondadb
  </summary>
  
</details>

## Dependências / ferramentas utilizadas
  - IntelliJ IDEA
  - Spring Boot
  - Spring Inializr
  - Spring Data JPA
  - H2
  
## Authors

- [Renan Marques](https://www.github.com/re04nan) 🚀

