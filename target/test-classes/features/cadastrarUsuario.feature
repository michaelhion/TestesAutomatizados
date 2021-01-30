#language: pt
#enconding: UFT-8

@cadastrarUsuario
Funcionalidade: Cadastrar usuario
	
	@cadastro
	Cenario: cadastrar usuario
		Quando acionar a aba admin
		E acionar o botao add
		E informar o campo employee name "Aaliyah Haq"
		E informar o campo username "TesteSelenium2"
		E informar o campo password "ePyLedG%"
		E informar o campo confirmar password "ePyLedG%"
		E clicar no botao save 
		Entao o sistema cadastra usuario "TesteSelenium2"
		

	