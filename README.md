# App RH *versão 1.0* para estudos na UC 12
## Java com SPRING-BOOT

Sistema de RH desenvolvido no tutorial (YouTube) sobre Spring Boot.

**1ª Fase** - Criação do projeto e módulo *Vagas/Candidatos*;

**2ª Fase** - Módulo *Funcionários/Dependentes*;

**3ª Fase** - Implementação do *Formulário de Busca* na página inicial.

### Instruções de instalação e uso:

1º No MySQL criar um banco com o nome **AppRH**;

2º No Eclipse, ir em *file*, *importar*, escolher opção *Maven*, *Existing Maven Projects*, *next*, selecione a pasta do seu projeto em *browser*, marque a opção em Projects *seuProjeto.jar* e *finish*; 

4º Ainda no Eclipse, acessar o arquivo DataConfiguration.java e mudar usuário e senha de acordo com o seu banco de dados. Fazer a mesma coisa no arquivo application.properties que está na pasta src/main/resources;

5º Para executar o projeto no Eclipse, escolher *Run RhappApplication* e executar como uma aplicação Java;

6º Acessar em: http://localhost:8080/


Obs.: O projeto *não funciona* se não existir um banco (vazio) chamado AppRH no MySQL.


