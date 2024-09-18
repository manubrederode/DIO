# DESAFIO DE CODIGO 1: Explorando APIs e Monitoramento de Desempenho 

### 1 - Validando Endpoints de API

#### Descrição
Você está desenvolvendo um programa para validar endpoints de API. O algoritmo deve verificar se o endpoint fornecido segue o formato padrão /api/{recurso} e seus sub-recursos. O formato válido é iniciado por /api/ seguido por um ou mais segmentos separados por barras (/), onde cada segmento é uma palavra alfanumérica.

Validação com Expressão Regular:

Para validar o formato do endpoint, você deve usar uma expressão regular. A expressão regular precisa:

- Garantir que o endpoint comece com /api/.
- Seguir com um ou mais segmentos, onde cada segmento é uma palavra alfanumérica.
- Os segmentos devem ser separados por barras (/).
- O endpoint deve terminar após o último segmento.

Exemplo de Expressão Regular:

- Expressão Regular: ^/api/\w+(/\w+)*$
- ^/api/ - O endpoint deve começar com /api/.
- \w+ - Deve haver pelo menos uma palavra alfanumérica após /api/.
- (/\w+)* - Pode haver zero ou mais segmentos adicionais, cada um separado por barras (/).
- $ - O endpoint deve terminar após o último segmento.

#### Entrada
Endpoint: Uma string representando o endpoint da API a ser validado.

#### Saída
"Endpoint valido." se o endpoint está no formato correto.
"Endpoint invalido." se o endpoint não está no formato correto.

### 2 - Detector do Método HTTP Predominante

#### Descrição
Você está desenvolvendo um programa para contar e identificar o método HTTP mais frequente em uma lista fornecida. O algoritmo deve analisar uma string que contém métodos HTTP separados por vírgulas, contar quantas vezes cada método aparece e retornar o método mais frequente junto com sua descrição. O programa deve identificar o método mais frequente e fornecer uma breve descrição de sua função.

Os métodos HTTP reconhecidos são "GET", "POST", "PUT" e "DELETE". Cada método tem um propósito específico:

GET: O GET solicita a representacao de um recurso.
POST: O POST envia dados para processamento.
PUT: O PUT atualiza todos os dados de um recurso.
DELETE: O DELETE remove um recurso especifico.

Na função findMostFrequentMethod, complete o TODO que conta a ocorrência de cada método HTTP e armazena essa contagem no mapa methodCounts. Utilize um loop para iterar pelos métodos no array methods. Para cada método, remova espaços extras usando trim() e incremente a contagem no mapa methodCounts.

#### Entrada
Métodos HTTP: Uma string contendo métodos HTTP separados por vírgulas. A string pode conter espaços extras ao redor dos métodos e métodos podem estar em maiúsculas.

#### Saída
Retorna uma string no formato "Método: Contagem - Descrição", onde:

Método é o método HTTP mais frequente.
Contagem é o número de vezes que o método aparece na entrada.
Descrição é uma breve explicação do que o método faz.

Atenção
Quando um método não é reconhecido, a saída deve listar o método seguido pelo número de ocorrências e pela descrição de erro:

Entrada: DEL, DEL
Saída: DEL: 2 - Metodo nao reconhecido.

### 3 - Monitoramento de Temperatura da CPU

#### Descrição
Você está desenvolvendo um programa que simula uma API para monitorar a temperatura de uma CPU. O programa deve receber uma lista de leituras de temperatura e retornar a maior temperatura registrada. Cada leitura de temperatura é um número inteiro representando graus Celsius. Compare cada temperatura convertida com a maior temperatura encontrada até o momento e atualize a maior temperatura se a atual for maior. Após processar todas as leituras, retorne uma string formatada que exiba a maior temperatura encontrada no formato "Maior temperatura: X°C", onde X é o valor da maior temperatura. Certifique-se de que a string de saída esteja corretamente formatada e inclua o valor correto.

#### Entrada
Leituras de temperatura: Uma string contendo leituras de temperatura separadas por vírgulas. A string pode conter espaços extras ao redor das leituras.

#### Saída
Retorna uma string no formato "Maior temperatura: X°C", onde X é a maior temperatura registrada.

# DESAFIO DE CODIGO 2: Aplicando Fundamentos de Dados: Inclusão, Exclusão e Atualização

### 1 - Inserção de Elementos

#### Descrição
Implemente um programa onde o usuário informa a quantidade de elementos que deseja inserir em uma tabela. Em seguida, o usuário deve inserir o ID e o nome de cada elemento. A tabela deve armazenar esses elementos e, ao final, o programa deve exibir todos os nomes armazenados na tabela, um abaixo do outro.

Instrução:
Implementar o Método insert
Você deve completar o método insert que insere um par (ID, nome) na tabela.
Utilize o método put do HashMap para adicionar o par chave-valor ao mapa.

#### Entrada
Um inteiro n representando a quantidade de elementos a serem inseridos.
Seguido por n pares de entradas onde cada par contém um inteiro (ID) e uma string (nome).

#### Saída
A lista de nomes armazenados na tabela, um abaixo do outro.

### 2 - Deletando Elementos

#### Descrição
Implemente um programa que permita ao usuário remover elementos da tabela. O usuário deve informar o ID do elemento que deseja remover. O programa deve exibir os nomes restantes na tabela após a remoção.

Instrução:
Completar o Método de Remoção:
Implemente o método delete para remover um elemento da tabela usando a chave (ID) fornecida.

#### Entrada
Um inteiro n representando a quantidade de elementos a serem removidos.
Seguido por n IDs de elementos a serem removidos.

#### Saída
A lista de nomes restantes na tabela, um abaixo do outro.

### 3 - Atualizando Elementos

#### Descrição
Implemente o método update na classe Table que permita ao usuário atualizar o nome de um elemento na tabela. O usuário deve informar o ID do elemento e o novo nome. O método deve verificar se a chave (ID) existe na tabela. Se existir, o valor associado a essa chave deve ser atualizado com o novo nome. Caso contrário, exiba a mensagem "ID nao encontrado.".

Após todas as atualizações, o programa deve exibir a tabela atualizada com todos os nomes.

#### Entrada
Um inteiro n representando a quantidade de atualizações a serem feitas.

Seguido por n pares de entradas onde cada par contém:
Um inteiro (ID) que representa a chave do elemento na tabela.
Uma string (novo nome) que representa o novo valor a ser associado à chave.

#### Saída
A lista de nomes atualizados na tabela, um abaixo do outro.

# DESAFIO DE CODIGO 3: Dominando Dados: Explorando a Administração de Funcionários

### 1 - Gerenciamento de Funcionários

#### Descrição
Você está desenvolvendo um sistema de banco de dados para gerenciar funcionários de uma empresa. Cada funcionário tem um ID, nome e cargo. Crie um programa que adicione funcionários a uma "tabela" (lista) e liste todos os funcionários ordenados pelo ID.

#### Entrada
1. Um número inteiro n representando a quantidade de funcionários.
2. Para cada funcionário, serão fornecidos dois dados:

nome (uma string representando o nome do funcionário)
cargo (uma string representando o cargo do funcionário)

#### Saída
String contendo todos os funcionários listados em ordem crescente de ID, cada um em uma linha no formato: "ID: Nome - Cargo"

### 2 - Consulta de Funcionários por Departamento

#### Descrição
Você está desenvolvendo um sistema de recursos humanos para uma empresa. O sistema precisa consultar os funcionários de um determinado departamento. Cada funcionário tem um nome, departamento e salário. Crie um programa que leia os dados dos funcionários e retorne a lista de funcionários de um departamento específico.

#### Entrada
1. Um número inteiro n representando a quantidade de funcionários.

2. Para cada funcionário, serão fornecidos:
nome (uma string representando o nome do funcionário)
departamento (uma string representando o departamento do funcionário)
salario (um número decimal representando o salário do funcionário)

3. Uma string departamento_consulta representando o departamento a ser consultado.

#### Saída
`String` contendo todos os funcionários do departamento consultado, cada um em uma linha no formato: "Nome: - Salario"

### 3 - Atualização de Salários

#### Descrição
Você está desenvolvendo um sistema de recursos humanos para uma empresa. O sistema precisa atualizar os salários dos funcionários aplicando um aumento percentual. Cada funcionário tem um nome, departamento e salário. Crie um programa que leia os dados dos funcionários e aplique um aumento percentual a todos os salários, listando os novos salários.

Cálculo do Novo Salário:

O novo salário de cada funcionário é calculado usando a fórmula: novoSalario = salario * (1 + aumento / 100)

Onde:
salario é o salário atual do funcionário.
salario é o salário atual do funcionário.
aumento é o percentual de aumento fornecido.
aumento / 100 converte o percentual em uma fração decimal.
1 + aumento / 100 calcula o fator de multiplicação para o aumento.
Multiplicar o salario pelo fator de multiplicação ajusta o valor para incluir o aumento.

#### Entrada
1. Um número inteiro n representando a quantidade de funcionários.

2. Para cada funcionário, serão fornecidos:
nome (uma string representando o nome do funcionário)
departamento (uma string representando o departamento do funcionário)
salario (um número decimal representando o salário do funcionário)

3. Um número decimal aumento representando o percentual de aumento.

#### Saída
`String` contendo todos os funcionários com seus novos salários, cada um em uma linha no formato: "Nome: X -  Novo Salario: Y". Onde, X representa o nome e Y o salário atualizado com duas casas decimais.

# DESAFIO DE CODIGO 4: Otimização de Inventário: Consulta, Filtragem e Duplicatas

### 1 - Consulta de Produtos em Estoque

#### Descrição
Você está desenvolvendo um sistema básico de gerenciamento de inventário para uma loja. No sistema, os produtos e suas quantidades são armazenados em um HashMap. Você precisa criar uma função que, dado o nome de um produto digitado pelo usuário, verifique a quantidade disponível em estoque e retorne uma mensagem apropriada.

A função deve:
Receber o nome de um produto do usuário.
Consultar um HashMap de produtos com suas quantidades.
Se o produto estiver no estoque e a quantidade for maior que zero, retornar "Produto disponivel: X em estoque.", onde, X é a quantidade em estoque.
Se o produto estiver no estoque, mas a quantidade for zero, retornar "Produto indisponivel.".
Se o produto não estiver no estoque, retornar "Produto nao encontrado.".

#### Entrada
String: Nome do produto.

#### Saída
String: "Produto disponivel: X em estoque.", "Produto indisponivel." ou "Produto nao encontrado".

### 2 - Filtro de Produtos por Faixa de Preço

#### Descrição
Você está desenvolvendo um sistema de inventário para uma loja. O sistema precisa filtrar produtos por faixa de preço. Cada produto tem um nome, categoria e preço. Crie um programa que leia os dados dos produtos e retorne a lista de produtos dentro de uma faixa de preço específica.

#### Entrada
1. Um número inteiro n representando a quantidade de produtos.

2. Para cada produto, serão fornecidos:
nome (uma string representando o nome do produto)
categoria (uma string representando a categoria do produto)
preco (um número decimal representando o preço do produto)

3. Dois números decimais preco_min e preco_max representando a faixa de preço.

#### Saída
String contendo todos os produtos dentro da faixa de preço, cada um em uma linha no formato: "Nome: Preco"

### 3 - Remoção de Duplicatas de Produtos de TI

#### Descrição
Você está trabalhando em um sistema de gerenciamento de inventário para uma empresa de tecnologia e precisa de uma função que recebe uma lista de produtos de TI e remove quaisquer duplicados. A lista pode conter produtos com o mesmo nome, e você precisa garantir que cada produto apareça apenas uma vez na lista final.  Escreva uma função que receba uma lista de produtos e retorne uma nova lista com os produtos únicos, mantendo a ordem de sua primeira ocorrência.

Objetivo do Desafio:
Você deve completar o método main para chamar a função removerDuplicados e armazenar o resultado. Em seguida, deve imprimir a lista de produtos únicos. A função deve ser capaz de lidar com produtos que diferem apenas em letras maiúsculas e minúsculas, ou seja, "USB Drive" e "usb drive" devem ser considerados duplicados.

#### Entrada
A função receberá uma lista de strings produtos onde cada string representa o nome de um produto de TI. A lista pode conter produtos duplicados.

#### Saída
A função deve retornar uma lista de strings onde cada string representa o nome de um produto de TI, sem duplicatas e na mesma ordem em que apareceram pela primeira vez na lista de entrada.