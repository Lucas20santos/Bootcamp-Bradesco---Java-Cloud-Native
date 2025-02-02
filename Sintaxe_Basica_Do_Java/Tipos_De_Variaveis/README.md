# Tipos e Variáveis 

// Depois organizar

## Objetivo do curso

Explorar os tipos de dados numerícos interios, numériocs decimais, lóogicos, caracteres e suas aplicabilidades. Explicar a diferença entre definição de variáveis e constantes.

## Pré requisitos

- JDK instalado 
- IDE escolhida
- Diretório do projeto definido
- Integração com Github

## Tipos e Variáveis

### Assuntos

- Numericos interios e decimais
- Tipos lógicos
- Caracteres
- Objetos
- Diferença entre variável e constante.

### Descrição

No java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos(Primitive Types).

### Os tipos primitivos em Java

- int 
- Byte
- Short
- long
- float
- double
- boolean
- char

esses tipos não são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)

Os tipos primitivos que podem conter partes fracionárias podem ser representados por dois tipos: 

- float
- double

### Declarando variáveis

Variáveis é uma identificação de um espaço em memória utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuido.

A estrutura pad~rao para se declarar uma variável sempre é: 

`<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>`

Java é fortemente tipado.

### Variáveis e Constantes

Uma variável é uma área de mamória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado define um conjunto de valores e um conjunto de operações. **Java** é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

No Java utiliizamos identificadores que representam uma referência(por) a um valor em memoria e esta referencia pode ser redirecionada a outro valor sendo portanto esta a causa do nome "variável", pois o valor pode variar.

Já as **Constantes** são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra *final*, seguinda do tipo.

Por conversão, constantes são sempre em CAIXA ALTA.
