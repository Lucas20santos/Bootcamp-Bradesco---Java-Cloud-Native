# Métodos, Escopo, palavras reservadas, Java Doc e Terminal e argumentos

## Objetivos - Aula Métodos

Apresentar critérios para criação de métodos, parâmetros e visibulidade.

## Assuntos

- Qual a proposta principal do método ?
- Qual o tipo de retorno esperado após executar o método ?
- Quais os parâmetros serão necessários para execução do método ?
- O método possui o rico de apresentar alguma exceção ?
- Qual a visibilidade do método ?

## Métodos

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipso e valores. Os métodos, pr sua vez, correspondem a **funções** ou **sub-rotinas** disponíveis dentro da nossa classes.

### Critérios de nomeação de Métodos

Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos pois esseas convernções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Pra métodos, os critérios são:

- Dever ser nomeado como verbo
- Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

### Critéiro de definição de métodos

1. **Qual a proposta principal do método?** Voce deve se perguntar constantemente até compreender a real finalidade do método.
2. **Qula o tipo de retorno esperado após executar o método?** Você deve analisar se o método será responsável pr retornar algum valor ou não.

Caso o método não retorne nenhuma valor qualquer, ele sera representado pela palavra-chave *void*

1. **Quais os parãmetros serão necessários para execução do método?** Os me´tods as vezes precisão de argumentos como critéios para a execução.
2. **O método possui o rico de apresentar alguma exceção ?** Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existẽncia de uma exceção.
3.**Qual a visibilidade do método ?** Será necessário que o método seja visível a toda aplicação, somente em memso pacotes, através de herança ou somente a viel a própria classe.

## Objetivos - Aula Escopo

Identificar a localização mais conveniente para a escrita de algoritmos necessário para o nosso programa.

## Assuntos

- Escopo de classe
- Escopo de método
- Escopo de fluxo

## Escopo

O escopo pode ser entendio como o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis **vai de acordo com o bloco onde ela foi declarada**.

A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence. Portante, esta cariável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

Em uma classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto acessíveis por todos os métodos.

Caso você declare uma variáviel DENTRO DE UM MÉTODO, o escopo dessa variável está limitado apenas ao corpo do método, ou seja, dentro das chaves que limitam o método.

Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em questão. Sem um domínio sobre escopo de códigos seu projeto tende a conter falhas estruturais e compromenter a proposta principal da aplicação.

## Objetivos - Aula palavras reservadas

Apresentar as 52 palavras reservadas organizadas por classificação de usabilidade considerando as regras da linguagem.

## Assuntos

- Tipos Primitivos
- Classificações
- Escopo de uso
- Palavras "opostas"

## Palavras reservadas

São identificadores de uma linguagem que já possuem uma finalidade específica, portanto não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

A linguagem Java possui 52 palavras reeservadas. Todas essas palavras são classificadas em grupos e escritas com letra minúsculas, sendo identificadas com uma cor especial pela maioria das IDE's.

- abstract        continue        goto              package             synchronized
- assert          default         if                private             this
- boolean         do              implements        protected           throw    
- break           double          import            public              throws
- byte            extends         instanceof        return              transient
- case            final           int               short               try
- catch           finally         interface         static              void
- char            else            native            switch              volatil
- class           float           long              strictfp            while
- const           for             new               super

### Controle de pacotes

- **import**
- **packege**

### Modificadores de acesso

- **public**
- **private**
- **protected**

### Primitivos

- **boolean**
- **byte**
- **char**
- **double**
- **float**
- **int**
- **long**
- **short**
- **void**

### Modificadores de classe, variáveis ou métodos

- **abstract**
- **class**
- **extented**
- **final**
- **implements**
- **native**
- **interface**
- **new**
- **static**
- **strictfp**
- **synchronized**
- **transient**
- **volatile**

### Controle de fluxo dentro de um bloco de código

- **break**
- **case**
- **continue**

## Objetivo - Java Doc

Apresentar a ferramenta de documentação da Linguagem e explorar como adicionar comentários em nossos arquivos.

## Assuntos

- Documentação oficial
- Tags
- Tipos de comentarios
- Javadoc

## Documentação 

Podemos compreender e explorar todos os recuros organizados por pacotes e classes bem específicas sem nem mesmo escrever uma linha de código

## Tags

Java documentation é composto por tags que represntam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seu métodos e atributos conforme tabela abaixo:




