# SpamDetector 📧🔍

[![License: Unlicense](https://img.shields.io/badge/License-Unlicense-blue.svg)](https://unlicense.org/)
[![Java](https://img.shields.io/badge/Java-8%2B-orange)](https://www.java.com/)
[![Status: Completed](https://img.shields.io/badge/Status-Completed-success)](#)
[![UENP](https://img.shields.io/badge/UENP-Universidade%20Estadual%20do%20Norte%20do%20Paraná-blue)](https://uenp.edu.br/)

## 📝 Descrição

O SpamDetector é uma aplicação Java simples desenvolvida como parte da disciplina de Programação 2 na [Universidade Estadual do Norte do Paraná (UENP)](https://uenp.edu.br/). Este projeto implementa um detector de spam básico que analisa textos em busca de termos suspeitos, atribuindo pesos a cada ocorrência e classificando o texto de acordo com a pontuação total.

## 🚀 Funcionalidades

- Leitura de arquivos de texto
- Detecção de termos suspeitos com diferentes pesos
- Classificação do texto em três níveis de suspeita:
  - Fracamente suspeito (5-30 pontos)
  - Potencialmente suspeito (31-70 pontos)
  - Spam (71-100 pontos)

## 🛠️ Tecnologias Utilizadas

- Java
- Manipulação de arquivos com BufferedReader
- Tratamento de exceções

## 📋 Estrutura do Projeto

```
├── src/
│   ├── Main.java             # Ponto de entrada da aplicação
│   ├── SpamDetector.java     # Implementação do detector de spam
│   ├── LerArquivo.java       # Classe para leitura de arquivos
│   └── TermoPeso.java        # Classe que associa termos e seus pesos
└── SpamDetector.iml          # Arquivo de configuração do projeto
```

## 🔍 Como Funciona

O detector de spam funciona da seguinte forma:

1. Um arquivo de texto é lido do caminho especificado
2. O texto é convertido para minúsculas para facilitar a comparação
3. O sistema verifica a presença de termos suspeitos predefinidos
4. Cada termo encontrado adiciona seu peso associado à pontuação total
5. Com base na pontuação final, o texto é classificado em uma das três categorias de suspeita

## 📊 Termos e Pesos

| Termo | Peso |
|-------|------|
| abra agora | 1 |
| compre agora | 2 |
| leia agora | 3 |
| grátis | 4 |
| tentativa de entrega frustrada | 5 |
| faça dinheiro | 6 |
| você ganhou | 7 |
| dinehiro de graça | 8 |
| empréstimos para negativado | 9 |
| isso não é spam | 10 |

## 🚦 Classificação

- **Fracamente suspeito**: 5-30 pontos
- **Potencialmente suspeito**: 31-70 pontos
- **Spam**: 71-100 pontos

## 📥 Como Usar

1. Clone este repositório
2. Abra o projeto em sua IDE Java preferida
3. Modifique o caminho do arquivo no método `contaSpamDetector()` em `SpamDetector.java`
4. Execute a classe `Main`

```java
// Exemplo de uso
public static void main(String[] args) {
    System.out.println(SpamDetector.contaSpamDetector());
}
```

## 📝 Licença

Este projeto está licenciado sob a Licença Unlicense - veja o arquivo LICENSE para detalhes.
