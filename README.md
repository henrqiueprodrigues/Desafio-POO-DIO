### Desafio POO

Nesse repositoria se encontra a minha solução para o desafio do curso
Abstraindo um Bootcamp Usando Orientação a Objetos em Java, do bootcamp GFT Start#3.

## Implementações:
### BootCamp:
- Implementado método encerraBootCamp(), que checa se o dia de finalização do bootcamp chegou, caso sim ele remove os conteudos não completos de todos os devs que fazer parte dele, caso não imprime o dia de encerramento.
- Implementado método removeDev(), que serve como métod auxiliar para o método encerraBootCamp da classe Dev.
- Implemenmtado método imprimeInfoBootCamp(), que imprime o nome do bootcamp, sua descrição, seu dia de início e fim, alem dos devs participante e o conteudo dentro do bootcamp.

### DEV:
- Implementado método imprimeInfoDev(), que imprime o seu nome, sua quantidade de XP, quais conteudos ele esta inscrito e quais ele já terminou.
- Implementado método encerraBootCamp(), que conclui o bootcamp, assim removendo o dev da lista de participantes do bootcamp, e passando para concluido todos os conteudos do bootcamp.
- Implementado método removeBootCamp(), que é utilizado como uma método auxiliar do método encerraBootCamp() da classe BootCamp.

### Conteudo:
- Implementado construtor padrão.

### Mentoria:
- Ajustado construtor da classe mãe para receber a data.

### Curso:
- Ajustado construtor da classe mãe para receber a carga horaria.