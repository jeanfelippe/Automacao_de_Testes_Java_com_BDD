

	Feature: Alugar Filme
		Como um aluno
		Eu quero cadastrar alugueis de filmes
		Para controlar pre�os e datas de entregas

  Scenario: Deve alugar um filme com sucesso
    Given um filme com estoque de 2 unidades
    And que o pre�o do aluguel seja R$ 3
    When alugar
    Then o pre�o do aluguel ser� R$ 3
    And a data de entrega ser� no dia seguinte
    And o estoque do filme ser� 1 unidade
    
