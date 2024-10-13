# Desafio de Estágio - Target Sistemas

Este repositório contém a solução dos problemas propostos como parte do desafio de estágio na Target Sistemas.

## Descrição dos Desafios

### 1. Desafio - FibonacciChecker (Codigo no repositorio)
O primeiro codigo verifica se o número informado pelo usuário pertence à sequência de Fibonacci. <br>
A sequência de Fibonacci é uma série de números em que cada número é a soma dos dois anteriores, começando com 0 e 1.

- **Entrada**: Um número inteiro informado pelo usuário.
- **Saída**: Uma mensagem indicando se o número pertence ou não à sequência de Fibonacci.

#### Exemplo de Execução:

```bash
Informe um número: 8
O número 8 pertence à sequência de Fibonacci.
```

### 2. Desafio - AChecker (Codigo no repositorio)
O segundo codigo verifica a existencia da letra "A", seja maiuscula ou minuscula, em uma string informada pelo, e a respectiva quantidade.

- **Entrada**: Uma Strin informada pelo usuário.
- **Saída**: Uma mensagem indicando se existe A's na string e a respectiva quantidade.
#### Exemplo de Execução:

```bash
Informe um string: carro
A letra 'a' foi encontrada 1 vez.
```

### 3. Desafio - Saida de algoritmo
Codigo:
```
int INDICE = 12, SOMA = 0, K = 1;

while (K < INDICE) {
K = K + 1;
SOMA = SOMA + K;
}

System.out.println(SOMA);
```
 
Saida: 77 <br>
A saida do sistema será o numero 77

### 4. Desafio - Descobrir a logica das sequencias

a) 1, 3, 5, 7, ___ (A sequência está somando 2 a cada termo) <br>
b) 2, 4, 8, 16, 32, 64, ____ (A sequência está multiplicando o número anterior por 2) <br>
c) 0, 1, 4, 9, 16, 25, 36, ____ (Esta sequência é formada pelos quadrados de números inteiros (n^2)) <br>
d) 4, 16, 36, 64, ____ (Esta sequência está formada pelos quadrados de números pares) <br>
e) 1, 1, 2, 3, 5, 8, ____ (Esta sequência segue a lógica da sequência de Fibonacci, onde cada número é a soma dos dois anteriores) <br>
f) 2,10, 12, 16, 17, 18, 19, ____ (Após o primeiro número 2, os próximos números são múltiplos de 2, seguidos por números consecutivos)

### 5. Desafio - Resolução de problema
```
Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. 
Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. 
Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, 
usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?
```
Resolução Passo a Passo:  <br>
1º Ligue o primeiro interruptor (A) <br>
2º Após alguns minutos desligue o primeiro (A) e ligue o segundo (B) <br>
3º Ir para sala das lampadas <br>
4º Verificação: Lampada acessa corresponde a "B", lampada apagada, porem quente, corresponde a "A" e a ultima corresponde a terceira lampada, a "C" <br>

---
Feito por Luis Felipe Cortêz
