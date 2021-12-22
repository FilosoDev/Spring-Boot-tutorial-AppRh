# App RH *versão 1.0* para estudos na UC 12
## Java com SPRING-BOOT

Sistema de RH desenvolvido no tutorial (YouTube) sobre Spring Boot.

**1ª Fase** - Criação do projeto e módulo *Vagas/Candidatos* :heavy_check_mark:
[Playlist da Etapa 01 no YouTube](https://youtube.com/playlist?list=PLvtOeOw_Op8k8p6vw-ADaHcKavUnZaGk8)


**2ª Fase** - Módulo *Funcionários/Dependentes* :heavy_check_mark:
[Playlist da Etapa 02 no YouTube](https://youtube.com/playlist?list=PLvtOeOw_Op8kOkDWzFNb-N4gevX4e3l5J)


**3ª Fase** - Implementação do *Formulário de Busca* na página inicial. :heavy_check_mark:
[Playlist da Etapa 03 no YouTube](https://youtube.com/playlist?list=PLvtOeOw_Op8kQfcjW0Om23Z0GWBbOMfj5)


### Instruções de instalação e uso:

1º No MySQL criar um banco com o nome **AppRH**;

2º No Eclipse, ir em *file*, *importar*, escolher opção *Maven*, *Existing Maven Projects*, *next*, selecione a pasta do seu projeto em *browser*, marque a opção em Projects *seuProjeto.jar* e *finish*; 

4º Ainda no Eclipse, acessar o arquivo DataConfiguration.java e mudar usuário e senha de acordo com o seu banco de dados. Fazer a mesma coisa no arquivo application.properties que está na pasta src/main/resources;

5º Para executar o projeto no Eclipse, escolher *Run RhappApplication* e executar como uma aplicação Java;

6º Acessar em: http://localhost:8080/


Obs.: O projeto *não funciona* se não existir um banco (vazio) chamado AppRH no MySQL.


