#language: pt

  @cadastro
  Funcionalidade: Cadastro do usuário

    @cadastro-sucesso
    Cenario: Cadastrar um novo usuário com sucesso
      Dado que estou na página de login
      E acesso o cadastro de usuário
      Quando eu preencho formulário de cadastro
      E clico em registrar
      Entao vejo cadastro realizado com sucesso
