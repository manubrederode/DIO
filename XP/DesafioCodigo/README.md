# DESAFIO DE CODIGO 1: Calculando Juros com C# 

### 1 - Calculando Juros Simples

#### Descrição
Você foi contratado por uma corretora de investimentos para criar uma função que calcula o montante final de um investimento baseado em juros simples. O objetivo é ajudar os clientes a entenderem quanto seu investimento valerá após um determinado período.

A fórmula para calcular o montante final (A) em juros simples é:

A = P + (P × i × n)

Onde:
P é o valor inicial do investimento.
i é a taxa de juros anual.
n é o número de anos.

#### Entrada
A entrada é composta por três strings, representando os parâmetros:

P: O valor inicial do investimento (principal).
i: A taxa de juros anual (expressa como um decimal). Por exemplo, 5% deve ser representado como 0.05.
n: O número de anos que o dinheiro será investido.
Esses valores serão fornecidos na seguinte ordem: P, i, n.

#### Saída
A função deverá retornar o montante final após o período de investimento, considerando a capitalização dos juros (juros compostos). O resultado deve ser um número representando o valor total após a aplicação dos juros compostos sobre o investimento inicial ao longo do tempo especificado.

### 2 - Calculando Juros Compostos

#### Descrição
Crie uma função que calcula o montante final de um investimento com base em juros compostos. Essa função ajudará os investidores a compreenderem o crescimento potencial de seus investimentos ao longo do tempo. Os juros compostos são calculados não apenas sobre o investimento inicial, mas também sobre os juros acumulados ao longo dos períodos anteriores, o que resulta em um crescimento exponencial do valor investido.

A fórmula para calcular o montante final (A) em juros compostos é:

A = P × ( 1 + i ) ^ n

Onde:
P é o valor inicial do investimento.
i é a taxa de juros anual.
n é o número de anos

#### Entrada
A entrada é composta por três strings, representando os parâmetros:

P: O valor inicial do investimento (principal).
i: A taxa de juros anual (expressa como um decimal). Por exemplo, 5% deve ser representado como 0.05.
n: O número de anos que o dinheiro será investido.
Esses valores serão fornecidos na seguinte ordem: P, i, n.

#### Saída
A função deverá retornar o montante final após o período de investimento, considerando a capitalização dos juros (juros compostos). O resultado deve ser um número representando o valor total após a aplicação dos juros compostos sobre o investimento inicial ao longo do tempo especificado. 

# DESAFIO DE CODIGO 2: Calculando Ativos com C#

### 1 - Otimização de Alocação de Ativos com Restrições

#### Descrição
Você recebeu a tarefa de ajudar um cliente a otimizar a alocação de seus ativos financeiros. Além de calcular a alocação proporcional ao valor de mercado, você deve considerar várias restrições que o cliente impôs:

Cada ativo deve ter uma alocação mínima e máxima.
O valor total a ser investido deve ser respeitado.
O número de ativos alocados deve ser igual ao número de ativos fornecido.
Seu desafio é criar um programa que receba a lista de valores de mercado dos ativos, o valor total a ser investido, e as restrições de alocação mínima e máxima para cada ativo. O programa deve então calcular a quantidade de dinheiro que deve ser alocada em cada ativo, respeitando as restrições fornecidas.

#### Entrada
A entrada deve receber cinco strings, representando os seguintes valores:

Um número inteiro N representando o número de ativos.
N números reais representando os valores de mercado atuais de cada ativo.
Um número real representando o valor total a ser investido.
N números reais representando as alocações mínimas de cada ativo.
N números reais representando as alocações máximas de cada ativo.

#### Saída
A saída deve retornar N números reais, cada um representando a quantidade de dinheiro a ser alocada em cada ativo. O valor deve ser proporcional ao valor de mercado do ativo em relação ao valor de mercado total de todos os ativos e deve respeitar as restrições de alocação mínima e máxima. Os valores devem ser arredondados para duas casas decimais.

### 2 - Analisando a Volatilidade de um Ativo

#### Descrição
Você foi contratado por uma empresa de análise financeira para desenvolver uma função que calcula a volatilidade histórica de um ativo. A volatilidade é uma medida da variação dos retornos de um ativo ao longo do tempo e é fundamental para avaliar o risco associado ao investimento.

O cálculo do desvio padrão, que mede essa volatilidade, envolve os seguintes passos:

Calcular a Média: Primeiramente, é necessário calcular a média dos preços de fechamento. A média é obtida somando todos os preços e dividindo pelo número de dias.
Calcular as Diferenças Quadráticas: Para cada preço de fechamento, calcular a diferença em relação à média e elevar ao quadrado.
Calcular a Variância: A variância é a média das diferenças quadráticas calculadas.
Calcular o Desvio Padrão: Finalmente, o desvio padrão é a raiz quadrada da variância.

#### Entrada
A entrada consiste em uma string representando uma lista de preços de fechamento diários do ativo financeiro ao longo de um período. Os preços são separados por vírgula e espaço (, ).

#### Saída
Deve-se retornar o desvio padrão dos preços de fechamento, que é utilizado como medida de volatilidade do ativo para o período fornecido.

# DESAFIO DE CODIGO 3: Calculando Rendimentos com JavaScript

### 1 - Calculando o Rendimento com Dividendos

#### Descrição
Desenvolva uma função que calcula o rendimento de um portfólio com dividendos, considerando os preços de compra e os dividendos recebidos. Este cálculo é essencial para investidores que desejam entender o retorno real de seus investimentos, incluindo não apenas o ganho de capital, mas também os pagamentos de dividendos. A função permitirá uma análise mais precisa da performance do portfólio.

Considere a seguinte fórmula para calcular o rendimento: Rendimento (%) = (Dividendos Totais / Preco Total de Compra) * 100.

#### Entrada
A entrada deve receber duas strings representando:

Uma lista com os preços de compra dos ativos, separados por vírgula e espaço (, ).
Uma lista com os dividendos recebidos de cada ativo, separados por vírgula e espaço (, ).
Cada índice nos arrays corresponde ao mesmo ativo. Por exemplo, o primeiro valor no array de preços de compra corresponde ao preço de compra do mesmo ativo que o primeiro valor no array de dividendos recebidos.

#### Saída
A função deverá retornar o rendimento total do portfólio em porcentagem com duas casas decimais.

### 2 - Calculando o Rendimento de Investimentos

#### Descrição
Você foi contratado por uma corretora de investimentos para criar um programa simples que ajude os clientes a calcular o rendimento de seus investimentos. O seu desafio é criar um programa que receba o valor inicial do investimento, a taxa de juros anual e o número de anos que o dinheiro ficará investido, e retorne o valor final do investimento ao término do período. Suponha que os juros são compostos anualmente.

Considere a seguinte fórmula para calcular o valor final de um investimento com juros compostos: A = P * (1 + r / 100)^n

Onde:
𝐴 é o valor final do investimento.
𝑃 é o valor inicial do investimento.
𝑟 é a taxa de juros anual (em porcentagem).
𝑛 é o número de anos que o dinheiro ficará investido.

#### Entrada
A entrada deve receber três strings representando os seguintes valores:

O valor inicial do investimento (um número decimal).
A taxa de juros anual (um número decimal representando a porcentagem).
O número de anos que o dinheiro ficará investido (um número inteiro).

#### Saída
A saída deverá retornar o valor final do investimento após o período especificado, com duas casas decimais.

# DESAFIO DE CODIGO 4: Explorando Portfólio de Investimentos com JavaScript

### 1 - Calculando a Diversificação de Portfólio

#### Descrição
Crie uma função que calcula a porcentagem de cada investimento em relação ao total de um portfólio diversificado. Esta análise é fundamental para investidores e gestores de portfólio, pois permite avaliar como os recursos estão distribuídos entre diferentes ativos e identificar possíveis concentrações de risco.

Considere a seguinte fórmula para calcular a porcentagem de cada investimento em relação ao total do portfólio:

Porcentagem de Investimento = (Valor do Investimento / Valor Total do Portfolio) * 100

#### Entrada
A entrada deve receber uma string representando um array com os valores de cada investimento, separados por vírgula (,).

#### Saída
A função deverá retornar um array com as porcentagens com duas casas decimais de cada investimento em relação ao total.

### 2 - Simulando uma Carteira de Investimentos

#### Descrição
Você foi contratado para desenvolver uma aplicação que simule uma carteira de investimentos. A aplicação deve permitir calcular o rendimento total de uma carteira de investimentos ao longo de um determinado período de tempo, considerando diferentes tipos de investimentos e suas respectivas taxas de rendimento.

Para cada investimento, aplique a fórmula do rendimento composto: Vf = Vi * (1 + r)^n

Onde:
Vf é o valor final do investimento.
Vi é o valor inicial do investimento.
r é a taxa de rendimento anual.
n é o número de anos.

#### Entrada
A entrada deve receber três strings representando os seguintes dados:

Uma lista com o valor inicial de cada investimento.
Uma lista com a taxa de rendimento anual para cada tipo de investimento.
Um valor inteiro representando o número de anos do período de investimento.

#### Saída
Deverá retornar o valor total com duas casas decimais da carteira de investimentos após o período especificado, levando em consideração o rendimento composto anual de cada tipo de investimento.

# DESAFIO DE CODIGO 5: Calculando Métricas de Investimento com JavaScript

### 1 - Calculando o Beta de um Ativo

#### Descrição
Você foi contratado para calcular o Beta de um ativo. O Beta é uma medida da volatilidade ou risco sistêmico de um ativo em comparação com o mercado como um todo. Ele é calculado usando a covariância entre os retornos do ativo e os retornos do mercado, dividida pela variância dos retornos do mercado.

Para calcular o Beta, considere a seguinte fórmula:

Beta = Cov(R_a, R_m) / Var(R_m)

Onde:
𝐶𝑜𝑣(𝑅𝑎,𝑅𝑚) é a covariância entre os retornos do ativo e os retornos do mercado. 𝑉𝑎𝑟(𝑅𝑚) é a variância dos retornos do mercado.

#### Entrada
A entrada receberá duas strings, representando as seguintes listas:

A primeira lista contém os retornos do ativo;
A segunda lista contém os retornos do mercado para o mesmo período.

#### Saída
A saída deve retornar o Beta do ativo, arredondado para duas casas decimais.

### 2 - Calculando o Sharpe Ratio

#### Descrição
O Sharpe Ratio é uma medida de desempenho ajustada ao risco de um investimento. Você precisa calcular o Sharpe Ratio para uma série de investimentos, considerando o retorno do investimento, o retorno livre de risco e o desvio padrão do retorno do investimento.

Para calcular o Sharpe Ratio, utilize a fórmula:

Sharpe Ratio = (Retorno do Investimento - Retorno Livre de Risco) / Desvio Padrão do Retorno

Onde:
Retorno do Investimento é o retorno total do investimento, expresso como um decimal (por exemplo, 10% é 0.10).
Retorno Livre de Risco é o retorno de um ativo sem risco, expresso como um decimal.
Desvio Padrão do Retorno é uma medida da volatilidade dos retornos do investimento, expresso como um decimal.
Todos os valores devem ser expressos como decimais.

#### Entrada
A entrada deve receber uma string representando uma lista de investimentos. Cada investimento é representado por três valores separados por vírgulas:

O retorno do investimento (em porcentagem decimal).
O retorno livre de risco (em porcentagem decimal).
O desvio padrão do retorno do investimento (em porcentagem decimal).

#### Saída
A saída deve retornar o Sharpe Ratio de cada investimento, arredondado para duas casas decimais.
