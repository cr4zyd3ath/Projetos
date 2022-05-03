# Projetos

1. Crie as classes solicitadas de acordo com a seguinte imagem.

      ![image](https://user-images.githubusercontent.com/58996762/166504685-d45bada0-bc23-4806-ba29-a2b2e0299687.png)

2.

  Desenvolva o seguinte exercício:

  a. Crie uma classe Pessoa, contendo os atributos encapsulados, com seus
  respetivos seletores (getters) e modificadores (setters). Atributos: String
  nome; String endereço; String telefone.
  
  b. Considere, como subclasse da classe Pessoa (desenvolvida na alínea
  anterior) a classe Fornecedor. Considere que cada instância da classe
  Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa,
  os atributos valorCredito (correspondente ao crédito máximo atribuído ao
  fornecedor) e valorDivida (montante da dívida para com o fornecedor).
  
  c. Implemente na classe Fornecedor, para além dos usuais métodos seletores e
  modificadores, um método obterSaldo() que devolve a diferença entre os
  valores dos atributos valorCredito e valorDivida.
  
  d. Depois de implementada a classe Fornecedor, crie um programa de teste
  adequado que lhe permita verificar o funcionamento dos métodos
  implementados na classe Fornecedor e os herdados da classe Pessoa.
  
  e. Considere, como outra subclasse da classe Pessoa, a classe Empregado.
  Considere que cada instância da classe Empregado tem, para além dos
  atributos que caracterizam a classe Pessoa, os atributos codigoSetor
  (inteiro), salarioBase (vencimento base) e imposto (percentagem retida dos
  impostos).
  
  f. Implemente a classe Empregado com métodos seletores e modificadores e
  um método calcularSalario (salarioBase – salarioBase*imposto).
  
  g. Escreve um programa de teste adequado para a classe Empregado.
  
  h. Implemente a classe Administrador como subclasse da classe Empregado.
  Um determinado administrador tem como atributos, para além dos atributos
  da classe Pessoa e da classe Empregado, o atributo ajudaDeCusto (ajudas
  referentes a viagens, estadias, ...). Note que deverá redefinir na classe
  Administrador o método herdado calcularSalario (o salário de um
  administrador é equivalente ao salário de um empregado usual acrescido
  das ajudas de custo).
  
  i. Escreva um programa de teste adequado para esta classe.
  
  j. Implemente a classe Vendedor como subclasse da classe Empregado. Um
  determinado vendedor tem como atributos, para além dos atributos da classe
  Pessoa e da classe Empregado, o atributo valorVendas (correspondente ao
  valor monetário dos artigos vendidos) e o atributo comissao (percentagem
  do valorVendas que será adicionado ao vencimento base do Vendedor). Note
  que deverá redefinir nesta subclasse o método herdado calcularSalario (o
  salário de um vendedor é equivalente ao salário de um empregado usual
  acrescido da referida comissão).
  
  k. Escreva um programa de teste adequado para esta classe.
