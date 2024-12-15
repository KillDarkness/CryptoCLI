```markdown
# Criptografia CLI em Java

Este é um projeto simples, porém completo, que implementa um sistema de criptografia via terminal (CLI).  
O projeto permite criptografar textos usando diferentes métodos, verificar a correspondência entre texto original e criptografado, além de salvar e carregar textos criptografados de arquivos.

---

## 🛠️ Funcionalidades

1. **Criptografar textos**:
   - Escolha entre três métodos diferentes de criptografia:
     - Substituição de caracteres (deslocamento de +3 posições).
     - Reversão do texto.
     - Multiplicação de valores ASCII por 2.
   
2. **Verificar criptografia**:
   - Compara o texto original com o texto criptografado, garantindo que a correspondência seja exata.

3. **Salvar em arquivo**:
   - Permite salvar textos criptografados em um arquivo.

4. **Carregar de arquivo**:
   - Permite carregar textos criptografados previamente salvos.

---

## 📂 Estrutura do Projeto

O projeto foi estruturado em três arquivos Java para manter a organização:

- **`CryptoCLI.java`**:
  - Arquivo principal que gerencia a interação com o usuário via terminal.
  - Exibe menus e executa as opções escolhidas pelo usuário.
  
- **`CryptoManager.java`**:
  - Contém a lógica de criptografia, descriptografia e verificação.
  - Implementa três métodos distintos de criptografia.

- **`Utils.java`**:
  - Fornece utilitários para salvar e carregar textos em arquivos.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

- Java Development Kit (JDK) instalado.  
  - O projeto foi desenvolvido e testado usando o **JDK 21**, mas é compatível com outras versões recentes do Java.  

### Passos

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/KillDarkness/CryptoCLI.git
   cd CryptoCLI
   ```

2. **Compile os arquivos Java**:
   ```bash
   javac CryptoCLI.java CryptoManager.java Utils.java
   ```

3. **Execute o programa**:
   ```bash
   java CryptoCLI
   ```

---

## 📝 Como Usar

### Menu Principal

Ao iniciar o programa, você verá o seguinte menu:  
```
=== Sistema de Criptografia ===
1. Escolher método e criptografar
2. Verificar criptografia
3. Salvar criptografia em arquivo
4. Carregar criptografia de arquivo
0. Sair
Escolha uma opção:
```

#### Opção 1: Escolher método e criptografar
- Permite escolher entre os métodos de criptografia disponíveis:
  1. **Substituição**: Desloca os caracteres em +3 posições.
  2. **Reversão**: Inverte a ordem dos caracteres.
  3. **ASCII**: Multiplica os valores ASCII dos caracteres por 2.

#### Opção 2: Verificar criptografia
- Compara um texto original com um texto criptografado para verificar sua correspondência.

#### Opção 3: Salvar criptografia em arquivo
- Salva o texto criptografado em um arquivo especificado pelo usuário.

#### Opção 4: Carregar criptografia de arquivo
- Carrega o conteúdo de um arquivo contendo texto criptografado.

#### Opção 0: Sair
- Encerra o programa.

---

## 🌟 Exemplos de Uso

### Criptografar texto
1. Escolha a opção 1 no menu.
2. Escolha o método de criptografia (1, 2 ou 3).
3. Digite o texto que deseja criptografar.
4. Receba o texto criptografado como saída.

### Verificar criptografia
1. Escolha a opção 2 no menu.
2. Digite o texto original.
3. Digite o texto criptografado.
4. Escolha o método usado para criptografia.
5. Receba a confirmação da correspondência.

---

## 📖 Notas sobre o Código

- O método de criptografia de substituição é uma abordagem simples, mas eficaz para fins didáticos. Pode ser expandido para suportar algoritmos mais complexos como AES ou RSA.
- O código é modular e fácil de adaptar para novos métodos de criptografia.

---

## 👨‍💻 Contribuição

Sinta-se à vontade para contribuir com melhorias ou novos recursos. Basta seguir os passos:

1. Faça um fork do projeto.
2. Crie uma nova branch:
   ```bash
   git checkout -b minha-nova-feature
   ```
3. Faça as alterações desejadas e comite:
   ```bash
   git commit -m "Adicionei nova feature"
   ```
4. Envie as alterações para o seu fork:
   ```bash
   git push origin minha-nova-feature
   ```
5. Abra um pull request.
