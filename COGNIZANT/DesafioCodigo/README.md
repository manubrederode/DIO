# DESAFIO DE CODIGO: Aplicando Design Patterns em Soluções de Desafios de Códigos 

### 1 - Avaliação de Projetos de Software

#### Descrição
Você está desenvolvendo um programa para avaliar projetos de software empresariais. O objetivo é permitir registrar avaliações de projetos, calcular a média das avaliações e determinar o status do projeto com base na média. E para resolver este desafio, utilizaremos o conceito de Design Patterns, especificamente o padrão Strategy. Este padrão é utilizado para definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. O padrão Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.

TODO DETALHADO:
Crie uma interface chamada EvaluationStrategy e implemente as classes concretas para cada estratégia de avaliação (ExcellentStrategy, GoodStrategy, RegularStrategy, UnsatisfactoryStrategy). As classes concretas devem implementar o método evaluate para determinar o status do projeto com base na média das avaliações. Utilize essas estratégias no método main para calcular o status do projeto e exibir a mensagem correta.

O status do projeto será classificado como:

- "Excelente" para média >= 9
- "Bom" para média entre 7 e 8.9
- "Regular" para média entre 5 e 6.9
- "Insatisfatório" para média < 5

#### Entrada
O programa deve receber as seguintes entradas:

Registrar Avaliação: Recebe duas avaliações (notas entre 0 e 10) e adiciona à lista de avaliações.

#### Saída
O calculo da média das avaliações registradas e o status do projeto com base na média.O programa exibirá uma das seguintes mensagens:

"Media: X. Status: Excelente."

"Media: X. Status: Bom."

"Media: X. Status: Regular."

"Media: X. Status: Insatisfatorio."

### 2 - Verificação de Horários de Reuniões

#### Descrição
Você está desenvolvendo um programa para verificar os horários de reuniões empresariais. Seu algoritmo deve verificar se o horário desejado está dentro do intervalo permitido para as reuniões e exibir uma mensagem informando se a reunião pode ser agendada ou não. Um detalhe importante é que o sistema possui um horário mínimo e máximo já pré-definidos.

Neste desafio, você deverá utilizar o padrão de projeto Factory Method. Esse padrão de criação fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. Nesse caso, você implementará o padrão Factory Method na classe TimeFactory, especificamente no método createTime. Este método deve garantir que a string fornecida pelo usuário seja convertida corretamente em um objeto LocalTime.

#### Entrada
O programa deve receber as seguintes entradas:

Horário Desejado para a Reunião: Uma string representando o horário desejado para a reunião (no formato "HH:MM").

Horário Atual do Sistema: Uma string representando o horário atual do sistema (no formato "HH:MM").

#### Saída
"Reunião pode ser agendada.", se o horário desejado está dentro do intervalo permitido.

"Reunião não pode ser agendada. Horário fora do intervalo permitido.", se o horário desejado está fora do intervalo permitido.

### 3 - Calculadora de Salários

#### Descrição
Você está desenvolvendo um programa para calcular os salários de funcionários em uma empresa. Neste desafio, você implementará uma solução que permite ao usuário inserir o número de horas trabalhadas e a taxa de pagamento por hora de diferentes funcionários e calcular o salário total com base nas horas trabalhadas e na taxa de pagamento. O cálculo deve ser feito diretamente, multiplicando as horas trabalhadas pela taxa por hora. Para esta solução, aplicaremos o padrão de design Factory Method. Este padrão ajuda a promover flexibilidade e desacoplamento, facilitando a expansão e manutenção do código.

Padrão de Design - Factory Method

Objetivo: Criar objetos de forma flexível e desacoplada, permitindo que a criação dos objetos seja delegada a uma fábrica.

Como Aplicar: Em vez de criar diretamente um objeto da classe Employee, você usará uma classe fábrica EmployeeFactory para criar instâncias de Employee. A classe fábrica oferece um método estático para criar o objeto, seguindo o padrão Factory Method.

#### Entrada
O programa deve receber as seguintes entradas:

Número de horas trabalhadas: Um inteiro representando o total de horas trabalhadas por um funcionário.

Taxa de pagamento por hora: Um valor decimal representando a taxa de pagamento por hora do funcionário.

#### Saída
O programa exibirá a seguinte mensagem:

Salario total: X, onde X é o salário total calculado para o funcionário.