# 🚗 Projeto FiapRide - Classe Carro

## 📌 Objetivo da Atividade

Evoluir a classe Carro aplicando conceitos de Programação Orientada a Objetos, incluindo:

- Criação de métodos
- Implementação de regras de negócio
- Alteração e controle do estado do objeto
- Testes com valores válidos e inválidos

---

## 🧱 Estrutura da Classe

### 🔹 Atributos

- marca (String)
- modelo (String)
- ano (int)
- ligado (boolean)
- velocidade (int)

Esses atributos representam o estado do objeto Carro.

---

## ⚙️ Métodos Implementados

### ✅ ligar()

Liga o carro.

Regra de negócio:
- Não permite ligar se o carro já estiver ligado.

---

### ✅ acelerar(int valor)

Aumenta a velocidade do carro.

Regras de negócio implementadas:
- O carro precisa estar ligado.
- O valor da aceleração deve ser positivo.

---

## 🛡 Proteção do Estado

Foram implementadas validações utilizando estruturas condicionais (if) para evitar que o objeto fique em estado inconsistente.

---

## 🧪 Testes Realizados

No arquivo SistemaPrincipal.java foram testadas as seguintes situações:

- Aceleração válida
- Tentativa de acelerar com carro desligado
- Exibição dos dados

---

## 🎯 Conceitos Aplicados

- Instanciação de objetos
- Construtor
- Métodos
- Alteração de estado
- Regra de negócio com if
- Encapsulamento