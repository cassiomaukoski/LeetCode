# LeetCode

Projeto pessoal em Java para problemas do [LeetCode](https://leetcode.com/), com
testes JUnit 5.

## Estrutura de pastas

Cada questão vive no seu próprio pacote Java, com o nome do problema em
`snake_case` (sem hífen — não é um identificador Java válido):

```
src/main/java/com/cassiomaukoski/questionN_nome_do_problema/Solution.java
src/test/java/com/cassiomaukoski/questionN_nome_do_problema/SolutionTest.java
```

Onde `N` é o número da questão no LeetCode. Exemplo:

```
question66_plus_one/Solution.java
question66_plus_one/SolutionTest.java
```

A classe da solução chama-se sempre `Solution`, e a classe de teste
sempre `SolutionTest`, no mesmo pacote.

## Testes (JUnit 5)

Toda solução nova deve vir acompanhada de um `SolutionTest` usando
JUnit 5 (Jupiter, já configurado no `pom.xml`). Diretrizes:

- Um método `@Test` por cenário, com nome descritivo no formato
  `metodo_comportamentoEsperado` (ex.: `plusOne_handlesCarryOverflow`).
- Cobrir o caso normal e os casos de borda relevantes ao problema
  (limites, overflow, entrada mínima, etc.).
- Usar as asserções de `org.junit.jupiter.api.Assertions`
  (`assertEquals`, `assertArrayEquals`, `assertTrue`, ...).
- Rodar `mvn test` antes de commitar — os testes devem passar.

## Commits (Conventional Commits)

Mensagens de commit seguem `tipo(escopo): descrição`, no imperativo:

| Tipo       | Uso                                                        |
|------------|-------------------------------------------------------------|
| `feat`     | Nova solução de questão                                     |
| `test`     | Testes novos ou ajustados                                    |
| `refactor` | Reorganização sem mudar comportamento (ex.: renomear pacote) |
| `docs`     | Documentação (README, comentários)                           |
| `chore`    | Configuração de build/tooling (pom.xml, .gitignore, etc.)    |
| `fix`      | Correção de bug em uma solução existente                     |

O escopo (entre parênteses) é o número/nome curto da questão. Exemplos:

```
feat(question66): adiciona solução 
test(question66): adiciona testes
docs: adiciona README base
```

## Progresso

| # | Título | Dificuldade | Solução | Teste | Complexidade |
|---|--------|-------------|---------|-------|--------------|

