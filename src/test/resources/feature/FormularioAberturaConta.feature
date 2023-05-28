
@tag
Feature: abertura de conta
  

  @tag1
  Scenario: abertura de conta nubank
  Given que o usuario acesse a url "https://nubank.com.br/"
  And preencher cpf
  And clicar no botao continuar
  When preencher os demais campos 
  And clicar no botao li e estao ciente
  Then clicar no botao enviar 
