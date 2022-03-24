#language: pt
@executa
Funcionalidade: Preencher formulario

  @CT01
  Cenario: Preecher campos step vehicle
    Dado que o usuario acessou a pagina tricentis    
    E preenche todos os campos obrigatorios da aba vehicle
    Quando clicar em next da aba vehicle
    Entao a aba enter insurant data ficara habilitada

  @CT02
  Cenario: Preecher campos step insurant
    Dado que o usuario esta na aba aba enter insurant data
    E preenche todos os campos obrigatorios da aba insurant
    Quando clicar em next da aba insurant
    Entao a aba enter product data ficara habilitada

  @CT03
  Cenario: Preecher campos step product
    Dado que o usuario esta na aba aba enter product data
    E preenche todos os campos obrigatorios da aba product
    Quando clicar em next da aba product
    Entao a aba select price data ficara habilitada

  @CT04
  Cenario: Preecher campos step price
    Dado que o usuario esta na aba aba select price data
    E preenche todos os campos obrigatorios da aba price
    Quando clicar em next da aba price
    Entao a aba send quote ficara habilitada

  @CT05
  Cenario: Preecher campos step send
    Dado que o usuario esta na aba aba send quote
    E preenche todos os campos obrigatorios da aba send
    Quando clicar em send da aba send
    Entao uma mensagem de sucesso e exibida
