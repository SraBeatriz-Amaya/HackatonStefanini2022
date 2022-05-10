#language: pt
#enconding: UTF-8

@CadastrarUsuario
Funcionalidade: Cadastrar Usuario

  @cadastro
  Cenario: cadastrar usuario
    Quando eu acionar a aba admin
    E acionar o botao add
    E informar o campo employer name "Fiona Grace"
    E informar o campo username "Beatriz Silva"
    E informar o campo password "12345678"
    E informar no campo confirmar password "12345678"
    E clicar no botao save
    Entao  o sistema cadastra o usuario "Beatriz Silva"
