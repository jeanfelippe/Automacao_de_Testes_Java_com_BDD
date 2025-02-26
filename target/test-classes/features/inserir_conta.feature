
Feature: Cadastro de contas
	Como um usuario 
	Gostaria de cadastrar contas
	Para que eu possa distribuir meu dinheiro de uma forma mais organizada


Background: 
	Given que estou acessando a aplicacao
	When informo o usuario "a@a"
	And a senha "a"
	And seleciono entrar
	Then visualizo a pagina inicial
	When seleciono Contas
	And seleciono Adicionar
	
	
	#Alterar o nome da conta sempre
Scenario: Deve inserir uma conta com sucesso
	And informo a conta "Conta de Testeee"
	And seleciono Salvar
	Then a conta e inserida com sucesso


Scenario: Nao deve inserir uma conta sem nome
	And seleciono Salvar
	Then sou notificado que o nome da conta e obrigatorio


Scenario: Nao deve inserir uma conta com nome ja existente
	And informo a conta "Conta de Testeee"
	And seleciono Salvar
	Then sou notificado que ja existe uma conta com esse nome