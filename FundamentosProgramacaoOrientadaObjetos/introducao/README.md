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
- **Identificador**
 (identi
 ty): Propósito existencial aos objetos que serão.
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
    -http web
    -webservices
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

## Pacotes

A linguagem Java é composta por milhares de classes com as finalidades de, por exemplo:

- Classes de tipos de dados
- Conexão com banco de dados
- Representação de texto
- números
- datas
- arquivos
- Diretório

Imagina todas estas classes existirem em único nível de documento ? E as classes desenvolvidas por nós, meros desenvolvedores de aplicações de vários os gêneros? Imagina como ficaria este diretório em ?

Para previenir este aconecimento, a linguagem dispõe de um recurso que organiza as classes padrão e criadas por nós, que conhecemos como pacote (package). Os pacotes são subdiretórios a partir da pasta src do nosso projeto onde estão localizadas as classes da linguagem e novas que forem criadas para o projeto. Existem algumas convenções para criação de pacotes já utilizados no mercado.

### Nomeclatura

Vamos imaginar que sua empresa se chamar **Power Soft** e ela está desenvolvendo softwares comercial, gonvernamentl e sum software livreou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabelea abaixo:

- **Comercial**: com.powersoft
- **Gorvernamental**: gov.powersoft
- **Codigo aberto**: org.powersoft

Bem, acima já podemos perceber que existe uma definição para o uso do nome dos pacotes. Porém, podemos organizar ainda mais um pouco as nossas classes mediante a proposta de sua existência:

- **model:** Classes que representam a camada e modelo da aplicação.
    -Cliente,
    -Pedido,
    -NotaFiscal,
    -Usuario
- **Repository:** Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository
- **Service:** Classes que contém regras de negócio e validação de nosso sistema: ClienteService possui  o método validar o CPF do cliente cadastrado.
- **Controller:** Classes que possuem a finalidade de disponibilizar os nossos recursos da aplicação para outras aplicações via padrão HTTP.
- **View**: Classes que possuem alguma interação com a interface gráfica acessada pelo usuário.
- **Util:** Classes que contém recursos comuns à toda nossa aplicação.

### Identificação

Uma das características de uma classe é a sua identificação, Cliente, NotaFiscal, TituloPagar. Porém, quando esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples (**próprio nome**) e agora o nome qualificado (**endereçamento do pacote + nome**), exemplo: Considere a classe usuario que está endereçada no pacote:

com.controle.acesso.model, o nome qualificado desta classe é **com.controle.acesso.model.Usuario**

### Package versus Import

A localização de uma calsse é definida pela palavra reservada packge, logo, uma classe só contém uma definição de pacote no arquivo, sempre na primeira linha do código. Para a utilização de uma classe existentes em outros pacotes, necessitamos realizar a importação das mesmas, seguindo a recomendação abaixo:

`  
    Exemplo:
  
    package

    import ...
    import ...

    public class MinhaClasse { 
    
    }
    
`

### Por que é tão importante compreender de pacotes ?

A linguagem Java é composta por milhares de classes internas, classes desenvolvidas em projetos disponíveis através de biblioteca e as classes do nosso projeto. Logo, existe uma enorme possibilidade da existênica de classes de mesmo nome.

## Visibilidade

### Modificadores

Em Java, utilizamos três palavras reservadas e um conceito default (sem nenhum palavra reservada) para definir os quatro tipo de visibilidade de atributos, métodos e até mesmo classes no que se refere ao acesso apor outras classes no que se refere ao acesso por outras classes. Iremos ilustrar dos mais nvisível ao mais restrito tipo de visibilidade nos arquivos em nosso projeto.

Para uma melhor ilustração, iremos representar os contceitos de visibilidade de recursos através do contexto em uma lanchonete que vende lanche natural e suco.

### Modificador public

- quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote pode svisualizar tais recursos

### Modificador defualt

O modificador **defalut** está fortemente associado a organização das classes por pacotes, algumas implementações não precisam estar disponíveis por todo o projeto, e este modificador de acesso restringe a visibilidade por pacotes.

Dentro do pacote **lanchonte**, iremos criar dois sub-pacotes para representar a divisão do estabelecimento.

### Modificador private

Depois de reestruturar nosso estabelecimento (projeto), onde, temos as divisões (pacotes) espaço do cliente e eatendiment, chegou a hora de uma reflexão sore visibilidade ou modificadores de acesso.

Conhecemos as ações disponiveis nas classses Cozinheiro, Almoxarife, Atendente e Cliente, mesmo com a organização das visibilidade por pacote, será se realimente estas classes precisam ser tão explicitas ?

- Será se o Cozinheiro precisa saber que\como o Almoxaridfe controle as entradas e saídas ?
- Que o Cliente precisa saber como o atendente recebe o pedido e servir sua mesa?
- Que o Atendente precisa saber que antes de pagar o Cliente consulta o saldo App ?

Diante destes questionamentos é que nossas classes precisam scontinuar antendo suas ações (métodos) mas nem todas precisam ser vistas por ninguém.

## Getter e Setter

Seguindo a conversão Java Beans

Os métodos "Getters" e "Setters" são utilizados para buscar valores de atributos ou definir novas valores de atributos de instâncias de classes.

O método **Getter** retorna o valor do atributo especificado.

O método **Setter** define outro novo valor para o atributo especificado.

Vemos o código abaixo da criação de um objeto Aluno com nome e idade:

Seguindo a conversão Java Beans, uma classe que contém esta estrutura de estados deverá seguir as regras abaixo:

- Os atributos precisam ter o modificador de acesso *private*. Ex.: private string nome.
- Como agora os atributos estarão somente a nível de calsse, precisaremos dos métodos getX e setX, Ex.: getNome() e setNeme(String novoNome).
- O método é responsável por obter o valor atual do atributo, logo ele precisa ser **public** retornar um tipo correspondente ao valor.
- O método **set** é responsável por definir ou modificar o valor de um atributo em um objeto logo el também precisa ser **public**.

## Construtores

Sabemos que para criar um objeto na linguagem Java utilizamos a seguinte estrutura de código:

Classe novoObjeto = new Classe();

Desta forma será criado um novo objeto na memória, este recuro também é conhecido como instanciar um novo objeto.

Muitas das vezes já queremos que anacriação(intanciação) de um onbjeto, a linguagem já solicite para quem for criar este novo objeto defina algumas propriedades essenciais. Abaixo iremos ilustrar uma classe Pessoa onde a mesma teŕa os atributos: Nome, CPF, Endereço.

## Enums

Enum é um tipo especial de classe onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.

Usamos Enum quando o nosso modleo de negócio contém objetos de mesmo contexto que já existem de pŕe-estabelecida com a certeza de não haver tanta alteração de valores.

- Exemplos:
  - **Grau de Escolaridade**: Analfabeto, Fundamentea, Méido, Superior
  - **Estado Civil**: Soltero, Casado, DIvorcidado, Viúvo
  - **Estados Brasileiros**: São Paulo, Rio de Janeiro, Piauí, Maranhão.

## UML

Linguagem de Modelagem Unificada ou UML é uma notação que possibilita a representação gráfica do projeto.

Na UML temos três conceitos necessários para compreendermos inicialmente:

- **Diagrama**
- **Elementos**

- **Relacionamentos**

As notações UML são distribuidas em duas categorias de diagramas, a estrutural e comportamental conforme listagem abaixo:

- **Diagrama de classe:** O Diagrama de classes é utilizado para fazer representação de estruturas de classes de negócio, interfaces e outros componentes do sistema. Por esta característica, este diagrama é considerado o mais importante para a UML, pois auxilia a maioria dos demais diagramas.
- **Diagrama de objetos:** Este diagrama representa os objetos existentes em um determinado instante ou fato na aplicação. Assim conseguimos ter uma perspectiva do estado de nossos objetos mediante a interação dos usuários com o sistema.

### Diagrama de classes

O diagrama de classes ilustra **graficamente** como classes serão estruturadas e interligadas entre si diante da proposta do nosso software.

Em diagrama a estrutura das classes é constituída por:

- **Identificação:** Nome e/ou finalidade da classe.
- **Atributos:** Propriedades e/ou características.
- **Operações:** Ações e/ou comportamentos.

### Relacionamentos

Em um diagrama as classes podem existir de forma independente, mas obviamente haverá em alguma etapa da aplicação a necessidade de algumas se relacionarem, o que devem compreender é o nível de dependência entre elas:

- **Associação:** É uma relação entre duas classes, onde uma classe depende da outra.
  - Associação simples - Navegação de A para B
  - Associação Bidirecional
  - Agregação - Em uma agregação a classe principal contém uma relação com outra classe, mas ela pode existir sem a classe agregadora. Imagina em um cadastro de candidatos, podemos encontrar candidatos que ainda não possuam uma Profissão.
  - Composição - A composição já caracteriza uma dependência existencial entre a classe principal e a classe associada. Imaginamos que uma Admissão só poderá existir contendo suas informações básicas e a composição do Candidato selecionado.

### Multiplicidade

Nem sempre o relacionamento entre as classes será de **um para um**, um determinado cenário poderá exigir multiplicidades específicas conforme opções abaixo:

- '1' -> Representa uma associação **contendo um elemento.**
- '*' -> Representa uma associação **contendo um ou mais elementos.**
- '0..1' -> Representa uma associação **contendo zero ou um elemento.**
- '1..*' -> Representa uma associação **contendo um ou mais elementos.**

### Níveis de Visibilidade

Os atributos e métodos de uma classe podem receber níveis de visibilidade, e na UML existem símbolos que representam cada um deles:

- (+) Visibilidade pública.
- (-) Visibilidade privada.
- (#) Visibilidade protegida.
