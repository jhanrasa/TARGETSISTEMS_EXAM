# Solicita a string ao usuário
entrada = input("Digite uma string: ")

# Conta quantas vezes "A" ou "a" aparecem na string
contagem = entrada.count('A') + entrada.count('a')

# Exibe o resultado
print(f"A letra 'A' aparece {contagem} vezes na string.")
