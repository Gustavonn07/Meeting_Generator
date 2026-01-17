# Manual de Instruções --- Sistema de Geração de Ata de Reunião

## 1. Descrição Geral

Este sistema tem como objetivo **gerar automaticamente uma ata de
reunião** a partir de informações fornecidas pelo usuário via terminal.
O projeto foi desenvolvido em **Java**, aplicando conceitos de
**Programação Orientada a Objetos (POO)**, como abstração, herança,
polimorfismo, encapsulamento e associação.

Ao final da execução, o sistema gera um arquivo de texto chamado
**meeting_minutes.txt**, contendo todas as informações da reunião.

------------------------------------------------------------------------

## 2. Funcionalidades

-   Cadastro do tema da reunião
-   Registro de participantes
-   Definição de moderador e relator
-   Cadastro de metas com metadados (prioridade, prazo e status)
-   Geração automática da ata da reunião em arquivo `.txt`

------------------------------------------------------------------------

## 3. Estrutura do Projeto

    src/
     ├── input/
     │    └── ConsoleInput.java
     ├── model/
     │    ├── AbstractPerson.java
     │    ├── Participant.java
     │    ├── Relator.java
     │    ├── Moderator.java
     │    ├── IMeta.java
     │    ├── Meta.java
     │    └── Meeting.java
     ├── output/
     │    └── DocumentGenerator.java
     └── Main.java

------------------------------------------------------------------------

## 4. Como Executar o Projeto

### 4.1 Requisitos

-   Java JDK 17 ou superior
-   Terminal ou IDE (IntelliJ, Eclipse, VS Code)

### 4.2 Execução

1.  Compile o projeto normalmente.
2.  Execute a classe `Main`.
3.  Preencha os dados solicitados no terminal.
4.  Ao final, o arquivo **meeting_minutes.txt** será gerado na pasta
    raiz do projeto.

------------------------------------------------------------------------

## 5. Exemplo de Uso

### Entrada no Terminal:

    Enter meeting theme: Planejamento Semestral
    Enter participants: Ana, João, Maria, Carlos, Fernanda
    Enter description: Discussão sobre metas do semestre
    Enter summary: Definição de prioridades
    Enter extra infos: Finalizar relatório, Revisar orçamento
    Priority for meta "Finalizar relatório": 5
    Deadline: 2026-03-10
    Priority for meta "Revisar orçamento": 4
    Deadline: 2026-03-20
    Enter moderator name: Carlos
    Enter relator name: Fernanda

### Saída Gerada:

Arquivo `meeting_minutes.txt` com todas as informações formatadas.

------------------------------------------------------------------------

## 6. Conceitos de POO Utilizados

-   **Herança**: `Participant`, `Relator` e `Moderator` herdam de
    `AbstractPerson`
-   **Abstração**: uso da classe abstrata `AbstractPerson` e da
    interface `IMeta`
-   **Polimorfismo**: tratamento de metas através da interface `IMeta`
-   **Encapsulamento**: atributos privados e acesso via métodos
-   **Associações**: relacionamento entre `Meeting` e outras classes do
    modelo
-   **Membros Estáticos**: métodos utilitários e objetos compartilhados

------------------------------------------------------------------------

## 7. Observações Finais

Este projeto foi desenvolvido com fins acadêmicos, atendendo aos
requisitos solicitados para avaliação em Programação Orientada a
Objetos.
