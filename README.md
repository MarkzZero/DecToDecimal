# DecToDecimal

Este é um projeto simples em Java que realiza a conversão de números decimais para binários utilizando **recursividade** e a estrutura de dados **pilha**. A ideia é empilhar os restos da divisão por 2 e, ao final, formar corretamente o número binário.

## 🧠 Propósito

Este projeto foi criado com fins educacionais, para demonstrar de forma prática como aplicar:

- Recursão
- Estrutura de dados Pilha
- Manipulação de números inteiros

É ideal para quem está aprendendo lógica de programação ou estruturas de dados em Java.

## ⚙️ Como funciona

A conversão de decimal para binário acontece da seguinte forma:

1. O número decimal é dividido por 2 recursivamente.
2. A cada chamada recursiva, o **resto da divisão** (0 ou 1) é armazenado em uma pilha.
3. Ao final, os valores são desempilhados para formar o número binário na ordem correta.
