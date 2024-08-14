# Aula 1: Introdução ao Quality Assurance

## BDD: Behavior Driven Development

**Behavior Driven Development (BDD)** é uma abordagem de desenvolvimento de software que se concentra na colaboração entre desenvolvedores, testers e stakeholders (partes interessadas) para definir o comportamento do sistema com base nas necessidades do usuário. O BDD utiliza uma linguagem comum para descrever o comportamento do software, facilitando a compreensão e a comunicação entre todos os envolvidos. A principal vantagem do BDD é garantir que o software atenda às expectativas do usuário e funcione corretamente em diferentes cenários.

- **Exemplo de BDD:** Usando uma linguagem comum, como "Dado que [contexto], Quando [ação], Então [resultado esperado]", as histórias de usuários e testes são escritos de forma que todos possam entender.

## TDD: Test Driven Development

**Test Driven Development (TDD)** é uma prática de desenvolvimento onde os testes são escritos antes do código funcional. O ciclo básico do TDD é composto por três etapas:

1. **Red**: Escrever um teste que falha (pois a funcionalidade ainda não foi implementada).
2. **Green**: Escrever o código necessário para que o teste passe.
3. **Refactor**: Melhorar o código, mantendo todos os testes passando.

O objetivo do TDD é garantir que o código funcione conforme o esperado e evitar a inclusão de funcionalidades indesejadas. Ele também ajuda a manter o código mais limpo e modular.

## Plano de Teste

Um **plano de teste** é um documento que descreve a abordagem e a estratégia para testar um sistema ou aplicação. Ele inclui detalhes sobre como os testes serão realizados, quem estará envolvido e quais serão os critérios de sucesso. Um plano de teste típico pode incluir os seguintes componentes:

- **Cenário:** Descrição detalhada de um contexto específico para testar uma funcionalidade. Cada cenário representa uma situação em que o sistema deve ser testado para verificar se atende aos requisitos.
  - **Exemplo:** Testar uma funcionalidade de login com um usuário válido e um usuário inválido.

- **Stakeholders:** As partes interessadas que têm interesse nos resultados dos testes. Isso pode incluir clientes, gerentes de projeto, desenvolvedores e testers. Entender as necessidades e expectativas dos stakeholders é crucial para definir o escopo e os objetivos dos testes.

- **Roteiro (script):** Sequência de passos que devem ser seguidos para executar um teste. Um roteiro de teste detalha as ações a serem tomadas e os resultados esperados para verificar se a funcionalidade está funcionando corretamente.
  - **Exemplo:** No teste de login, o roteiro pode incluir ações como inserir um nome de usuário e senha, clicar no botão de login e verificar se o usuário é redirecionado para a página principal.

- **Evidências:** Documentação ou registros que comprovam que o teste foi executado e quais foram os resultados. As evidências podem incluir capturas de tela, logs de sistema ou relatórios de falhas. Elas são essenciais para validar que os testes foram realizados e para identificar e corrigir problemas.
