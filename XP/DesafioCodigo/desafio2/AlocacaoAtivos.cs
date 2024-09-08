using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DesafioCodigo
{
    public class AlocacaoAtivos
    {
        static void Main()
        {
            // Recebe a entrada do número de ativos
            int N = int.Parse(Console.ReadLine());
            
            // Receben e divide os valores de mercado em um array de strings
            string[] valoresMercadoStr = Console.ReadLine().Split(',');
            
            double[] valoresMercado = Array.ConvertAll(valoresMercadoStr, double.Parse);
            
            // Recebe o valor total investido
            double valorTotalInvestido = double.Parse(Console.ReadLine());
            
            // Recebe e divide as alocações mínimas em um array de strings
            string[] alocacoesMinimasStr = Console.ReadLine().Split(',');
            
            double[] alocacoesMinimas = Array.ConvertAll(alocacoesMinimasStr, double.Parse);
            
            // Recebendo e dividindo as alocações máximas em um array de strings
            string[] alocacoesMaximasStr = Console.ReadLine().Split(',');
            
            double[] alocacoesMaximas = Array.ConvertAll(alocacoesMaximasStr, double.Parse);
            
            // Calcula o total do mercado
            double totalMercado = 0;
            for (int i = 0; i < N; i++)
            {
                totalMercado += valoresMercado[i];
            }

            // Calcula as alocações proporcionais
            double[] alocacoesProporcionais = new double[N];
            for (int i = 0; i < N; i++)
            {
                alocacoesProporcionais[i] = (valoresMercado[i] / totalMercado) * valorTotalInvestido;
            }

            // Ajusta as alocações dentro dos limites mínimos e máximos
            double[] alocacoesFinais = new double[N];
            double somaAlocacoes = 0;

            for (int i = 0; i < N; i++)
            {
                alocacoesFinais[i] = Math.Max(alocacoesMinimas[i], Math.Min(alocacoesMaximas[i], alocacoesProporcionais[i]));
                somaAlocacoes += alocacoesFinais[i];
            }


            // Se a soma das alocações ajustadas não corresponder ao valor total investido, fazer ajustes
            if (Math.Abs(somaAlocacoes - valorTotalInvestido) > 0.01)
            {
                for (int i = 0; i < N; i++)
                {
                    double diferenca = valorTotalInvestido - somaAlocacoes;
                    double ajuste = diferenca * (valoresMercado[i] / totalMercado);
                    double novaAlocacao = alocacoesFinais[i] + ajuste;


                    if (novaAlocacao < alocacoesMinimas[i])
                    {
                        ajuste = alocacoesMinimas[i] - alocacoesFinais[i];
                    }
                    else if (novaAlocacao > alocacoesMaximas[i])
                    {
                        ajuste = alocacoesMaximas[i] - alocacoesFinais[i];
                    }


                    alocacoesFinais[i] += ajuste;
                    somaAlocacoes += ajuste;
                }
            }


            // Imprime as alocações formatadas com duas casas decimais
            for (int i = 0; i < N; i++)
            {
                Console.WriteLine($"{alocacoesFinais[i]:F2}");
            }
        }
    }
}