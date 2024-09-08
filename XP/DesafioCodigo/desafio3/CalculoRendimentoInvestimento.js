// Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

// Captura as entradas do usuário
let valorInicial = gets();
let taxaJurosAnual = gets();
let numeroAnos = gets();

// Converte os tipos das entradas
valorInicial = parseFloat(valorInicial);
taxaJurosAnual = parseFloat(taxaJurosAnual);
numeroAnos = parseInt(numeroAnos);

// Calcula o rendimento
let valorFinal = calcularRendimento(valorInicial, taxaJurosAnual, numeroAnos);

// Função para calcular o valor final do investimento com juros compostos
function calcularRendimento(valorInicial, taxaJurosAnual, numeroAnos) {
    // Converte a taxa de juros de porcentagem para decimal
    let taxaJurosDecimal = taxaJurosAnual / 100;

    // Calcula o valor final usando a fórmula dos juros compostos
    let valorFinal = (valorInicial * (1 + taxaJurosDecimal) ** numeroAnos);

    // Retorna o valor final arredondado para duas casas decimais
    return valorFinal.toFixed(2);
}

// Exibe o resultado
print(valorFinal);