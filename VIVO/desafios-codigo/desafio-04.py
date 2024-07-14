"""
DESAFIO: Criando uma Classe de Usuário
Desafio
Vamos criar uma classe chamada UsuarioTelefone para representar um usuário de telefone. Você pode definir um método especial e depois aplicar conceitos de encapsulamento nos atributos dentro da classe. Lembre-se que, cada usuário terá um nome, um número de telefone e um plano associado, neste desafio, simulamos três planos, sendo: Plano Essencial Fibra, Plano Prata Fibra e Plano Premium Fibra.

Entrada
Nome do usuário, número de telefone e plano.

Saída
Mensagem indicando que o usuário foi criado com sucesso.

"""
# SOLUÇÃO:
# Cria uma classe UsuarioTelefone.
class UsuarioTelefone:
    # O método especial `__init__`, que é o construtor da classe.
    # O método `__init__`, irá inicializar os atributos da classe: `nome`, `numero` e `plano`.
    def __init__(self, nome, numero, plano):
        self.__nome = nome
        self.__numero = numero
        self.__plano = plano

    # A classe `UsuarioTelefone` define um método especial `__str__`, que retorna uma representação em string do objeto.
    def __str__(self):
        return f"Usuário {self.__nome} criado com sucesso."

# Entrada:
nome = input()  
numero = input()  
plano = input() 

# Criação do objeto UsuarioTelefone
usuario = UsuarioTelefone(nome, numero, plano)

# Saida:
print(usuario)