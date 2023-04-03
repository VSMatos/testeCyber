<h1>Teste CyberSolutions</h1> 

<p align="center">
  <img src="http://img.shields.io/static/v1?label=TESTES&message=OK&color=GREEN&style=for-the-badge"/>
   <img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=RED&style=for-the-badge"/>
   <!-- <img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=GREEN&style=for-the-badge"/> -->
</p>

> Status do Projeto: :heavy_check_mark: Operante - podendo adicionar melhorias.

### Tópicos 

:small_blue_diamond: [Descrição do projeto](#descrição-do-projeto)

:small_blue_diamond: [Funcionalidades](#funcionalidades)


## Descrição do projeto 

<p align="justify">
  Desafio de automação de testes em Selenium WebDriver + Java 
</p>
<li align="justify">Nesse projeto utiliza um "core", onde a ideia foi de implementar o reuso e centralizar as chamadas e funcionalidades do projeto.<p>
<p align="justify"><a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/core/DriverFactory.java">DRIVEFACTORY</a> - Classe utilizada para inicialização e finalização das instâncias do driver.<p>
<p align="justify"><a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/core/Properties.java">PROPERTIES</a> - Classe utilizada para "setar" propriedades globais para o projeto.<p>
<p align="justify"><a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/core/DSL.java">DSL</a> - Utilizada para abstração e reuso dos métodos provindos do driver.<p>
<p align="justify"><a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/core/BaseTest.java">BASETEST</a>- Utilizado para "setar" parâmetros como, por exemplo, fechamento do driver e criação das evidencias (Screenshots)<p>
<p align="justify"><a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/core/BasePage.java">BASEPAGE</a> - Utilizada para instanciar a DSL em todas as Pages necessárias.<p>


<li>Criado um <a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/SuiteTestes.java">Suite de Testes</a> para execução de toda bateria de testes de maneira mais simples e rápida.


## Funcionalidades

:heavy_check_mark: Automação do preenchimento do formulário - Register.html :<a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/testes/RegisterTest.java"> Test </a>><a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/pages/RegisterPage.java"> Page</a>

:heavy_check_mark: Navegação entre Iframes e preenchimento de input - Frames.html :<a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/testes/FrameTest.java"> Test </a>><a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/pages/FramePage.java"> Page</a>

:heavy_check_mark: Inserção e validação de datas nos respectivos campos - Datepicker.html :<a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/testes/DatePickerTest.java"> Test </a>><a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/pages/DatePickerPage.java"> Page</a>

:heavy_check_mark: Movimentação da barra de slide - Slider.html :<a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/testes/SliderTest.java"> Test </a>><a href="https://github.com/VSMatos/testeCyber/blob/main/src/test/java/pages/SliderPage.java"> Page</a>



## Pré-requisitos

:warning: [Java](https://www.java.com/pt-BR/download/)<br>
:warning: [Selenium WebDriver](https://www.selenium.dev/downloads/)


## Tarefas em aberto

:memo: Implementar inserção de senha randomica seguindo os padrões requisitados pelo campo.


## Desenvolvedor/Candidato



| [<img src="https://avatars.githubusercontent.com/u/111292627?v=4" width=115><br><sub>Vitor Saço</sub>](https://github.com/VSMatos) | 
| :---: | 



