# Introdução a programação orientado a objetos

## Orientação a objetos

### Objetivo do curso

Abordar os conceitos do paradigma e os pilares da orientação a objetos, classes, enums, construtores, jáva bens e UML.

### Assuntos

- Conceito de POO
- Pacotes e Visibilidade de recursos
- Classes e Construtores
- Java Beans e UML
- Pilares do POO
- Enums e Interfaces

## Conceito de POO

### Programação estruturada

é um paradigma de programação que visa melhorar a clareza, a qualidade e o tempo de desenvolvimento de um programa de computador, fazendo uso extensivo das construções de fluxo de controle estruturado de seleção (if/then/else) e repetição (while e for).

### Programação orientada a objetos

POO é um paradigma de programção baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos, e códigos, na forma de procedimentos, também conhecidos como métodos.

Enquanto a programação estruturada é voltada a procedimentos e funções definidas pelo usuário, a programação orientada a objetos é voltada a conceitos como o de classes e objetos.

## Classes

Toda a estrutura de código na linguagem java é distribuído em arquivos com extensão .java denominadso de classes.

As classes existentes em nosso projeto serão composta por:

- **Classe** (class): A estrutura e ou representação que direciona a criação dos objetos de mesmo tipo.
- **Identificador** (identity): Propósito existencial aos objetos que serão.
- **Características** (states): Também conhecido como **atributos** ou **propriedade**, é toda informação que representa o estado do objeto.
- **Comportamentos** (behaviors): Também conhecido como **métodos** ou **ações**, é toda ação que o objeto pode realizar.
- **Instanciar** (new): É o ato de criar um objeto a partir de estrutura definida em uma calsse.

Seguindo algumas converções, as nossas calsses são classificadas como: 

- **Classe de modelo(model):** classes que representem estrutura de domínio da aplicação, exemplo:
    - Cliente,
    - Pedido,
    - Nota Fiscal
- **Classe de serviço (service):** classes que conteḿ regras de negócio e validação de nosso sistema.
- **Classe de repositório (repository):** classes que contém uma integraçãoc om banco de dados.
- **Classe de controle (controller):** classes que possuem a finalidade de disponibilizar alguma comunicação externa á nossa aplicação, tipo:
    - http web
    - webservices
- **Classe utilitária (util):** classe que contém recursos comuns à toda nossa aplicação.

### Exemplos

Aplicação/ Concessionária

- Classe de modelo
    - Empresa
    - Veículo (Carro)
    - Cliente
    - Nota Fiscal
    - Colaborador
    - Peça
- Classes de Serviços
    - VeiculoService
    - ClienteService
    - OficinaService
    - NotaFiscalService
- Classe de utilidades
    - FormatadorUtil
    - ValidadorUtil
    - CalculadoraUtil
    - ChaveInglesaUtil
- Classe de repositório
    - VeiculoRepository
    - ClienteRepository
    - PecaRepository
