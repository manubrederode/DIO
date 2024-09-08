using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DesafioCodigo
{
    public class JurosSimples
    {
        public static void Main(string[] args)
        {
            // Solicita ao usuário para inserir os valores
            double P = Convert.ToDouble(Console.ReadLine()); // Lê o valor principal P

            double i = Convert.ToDouble(Console.ReadLine()); // Lê a taxa de juros i

            int n = Convert.ToInt32(Console.ReadLine()); // Lê o número de períodos n

            // Calcula o montante final utilizando a função CalcularJurosSimples
            double montanteFinal = CalcularJurosSimples(P, i, n);

            // Exibe o resultado
            Console.WriteLine(montanteFinal); // Mostra o montante final calculado
        }

        public static double CalcularJurosSimples(double P, double i, int n)
        {
            // Calcula e retorna o montante final com juros simples
            return P * (1 + i * n);
        }
    }
}