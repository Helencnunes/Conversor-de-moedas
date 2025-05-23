# Conversor-de-moedas
# Conversor de Moedas 💱

Este é um projeto simples que desenvolvi em *Java* para praticar estruturas de repetição, condições e o consumo de *APIs externas. A aplicação permite converter valores entre **Real (BRL), **Dólar (USD)* e *Euro (EUR)* com base nas cotações atualizadas em tempo real.

---

## ✨ Funcionalidades

- [x] Menu interativo com 6 tipos de conversões:
  - Real → Dólar  
  - Dólar → Real  
  - Euro → Real  
  - Real → Euro  
  - Euro → Dólar  
  - Dólar → Euro  
- [x] Consulta automática das taxas de câmbio por meio de API.
- [x] Permite ao usuário escolher:
  - Repetir a conversão com o mesmo par de moedas.
  - Voltar ao menu principal.
  - Sair do programa.

---

## 🛠 Tecnologias utilizadas

- *Java* (versão 17 ou superior)
- Scanner para entrada de dados
- HttpURLConnection + BufferedReader para chamadas HTTP
- Organização do código em múltiplas classes:
  - ConversorDeMoedas.java
  - Menu.java
  - ApiResponse.java
  - ConsultaCotacao.java

---

## ▶ Como executar

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas-java.git
   cd conversor-moedas-java
   2. Compile os arquivos:

javac *.java


3. Execute a aplicação:

java ConversorDeMoedas




---

⚠ Observações

O programa depende de conexão com a internet para obter as cotações atualizadas.

As taxas de câmbio são consultadas em tempo real e podem variar entre as execuções.

A aplicação ainda pode ser melhorada com tratamento de exceções mais completo e suporte a outras moedas.



---

💡 Melhorias futuras

[ ] Suporte para mais pares de moedas

[ ] Interface gráfica (GUI)

[ ] Histórico de conversões

[ ] Suporte offline com cache local de cotações



---

Feito com carinho por Helen Estudante

Estudando, praticando e evoluindo um pouquinho a cada dia!
