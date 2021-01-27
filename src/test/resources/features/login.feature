#language: pt
#enconding: UFT-8

Funcionalidade: Login
	
	Cenario: usuario invalido
		Quando informar o usuario "Ad"
		E informar a senha "asd"
		E clicar no botao login
		Entao o sistema exibe a mensagem de usuario invalido

	@loginSucesso
	Cenario: Realizar Login
		Quando informar o usuario "Admin"
		E informar a senha "admin123"
		E clicar no botao login
		Entao o sistema exibe o usuario logado