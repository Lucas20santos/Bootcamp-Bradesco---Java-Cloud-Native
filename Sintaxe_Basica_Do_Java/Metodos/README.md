# Métodos

## Objetivos

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
