# Java e a arte da abstração com classe e encapsulamento

## static

- Indica que o método ou atributo pertence a classe e não a um objeto.
- Quando está sendo usando métodos estáticos, não é necessário instanciar um objeto.
- É possível acessar um método estático de uma classe.
- É possível acessar um atributo estático de uma classe.

## Exercicios

1. Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:

- Consultar saldo
- consultar cheque especial
- Depositar dinheiro;
- Sacar dinheiro;
- Pagar um boleto.
- Verificar se a conta está usando cheque especial.

Siga as seguintes regras para implementar

- A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
- O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
- Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
- Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
- Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
