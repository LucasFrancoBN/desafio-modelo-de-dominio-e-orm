# Desafio: Modelo de Domínio e ORM
Nesse desafio foi requerido criar um projeto Spring Boot com Java e banco de dados H2 e implementar o modelo conceitual conforme a especificação. Além disso, foi feito o *seeding* do banco de dados.

## Especificação - Sistema EVENTO
Deseja-se construir um sistema para gerenciar as informações dos participantes das atividades de um
evento acadêmico. As atividades deste evento podem ser, por exemplo, palestras, cursos, oficinas
práticas, etc. Cada atividade que ocorre possui nome, descrição, preço, e pode ser dividida em vários
blocos de horários (por exemplo: um curso de HTML pode ocorrer em dois blocos, sendo necessário
armazenar o dia e os horários de início de fim do bloco daquele dia). Para cada participante, deseja-se
cadastrar seu nome e email.

Modelo Conceitual
![Diagrama de classe](/img/diagrama_classe.png)

Instância dos dados para *seeding*:
![imagem](/img/img.png)

## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 21, git e Intellij.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando:
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/desafio-modelo-de-dominio-e-orm.git
```
Agora basta você abrir o projeto na IDE Intellij, acessar o arquivo ```DesafioModeloDeDominioEOrmApplication``` e rodar o projeto.

