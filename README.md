# 🧩 LAB06_SINGLETON

Implementação de uma fábrica de figuras geométricas aplicando o padrão de projeto **Singleton**.  
Projeto da disciplina de Programação Orientada a Objetos – UEPB.

---

## 📌 O que foi implementado?

Foi construída uma fábrica de figuras geométricas onde:

- Apenas um **Disco (círculo)** pode ser criado (Singleton);
- Apenas **três instâncias únicas de triângulos** (equilátero, isósceles e escaleno) podem ser criadas (Singletons);
- Vários **Quadrados** podem ser criados livremente;
- Todas as figuras podem calcular **área** e **perímetro**;
- As exceções são tratadas de forma personalizada;
- O comportamento do Singleton e os cálculos são verificados por testes com JUnit.

---

## 🧪 Explicação de cada classe

### `Disco.java`  
Classe que representa o círculo. Aplica o **Singleton** para garantir que só exista uma instância no programa. Possui métodos para calcular área e perímetro e permite atualizar o raio da instância única.

### `Triangulo.java`  
Classe que representa três tipos de triângulos: **equilátero**, **isósceles** e **escaleno**. Cada tipo tem sua própria instância Singleton. A classe valida os lados e calcula área (usando a fórmula de Heron) e perímetro. Incluímos também um método para “resetar” os singletons durante os testes.

### `Quadrado.java`  
Classe simples que representa um quadrado. **Não usa Singleton**, ou seja, permite criar várias instâncias normalmente. Calcula área e perímetro com base no lado informado.

### `FiguraPlana.java`  
Interface comum que define os métodos `obterArea()` e `obterPerimetro()`, implementada por todas as figuras do projeto.

### `MedidaInvalidaException.java`  
Classe de exceção personalizada lançada quando são fornecidas medidas inválidas (ex: lados negativos ou que não formam uma figura válida).

### `Principal.java`  
Classe `main` do projeto. Serve como cliente da fábrica: cria as figuras, invoca os métodos de cálculo e imprime um relatório formatado no console com os resultados de cada figura.

---

## ✅ Uso do padrão Singleton

- **Disco (círculo)**: Singleton aplicado.
- **Triângulo**: 3 Singletons separados (um para cada tipo).
- **Quadrado**: Sem Singleton (pode instanciar livremente).

---

## 🧪 Testes (JUnit)

Foram criados testes para verificar:

- Se as instâncias Singleton realmente funcionam (`assertSame`);
- Se os cálculos de área e perímetro estão corretos (`assertEquals`);
- Se exceções são lançadas corretamente quando necessário.

No caso de `TrianguloTest`, usamos um reset interno para garantir que os testes sejam executados corretamente mesmo em conjunto com os demais.

---

## 🖥️ Exemplo da saída do programa:

📌 RELATÓRIO DE FIGURAS GEOMÉTRICAS

Disco:
- Perímetro: 94,25
- Área: 706,86

Quadrado:
- Perímetro: 24,00
- Área: 36,00

Triângulo Equilátero:
- Perímetro: 24,00
- Área: 27,71

Triângulo Isósceles:
- Perímetro: 16,00
- Área: 11,31

Triângulo Escaleno:
- Perímetro: 18,00
- Área: 14,70

✅ Encerrado.
