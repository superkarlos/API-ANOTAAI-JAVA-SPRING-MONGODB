# API-ANOTAAI-JAVA-SPRING-MONGODB-PLENO

# Teste para Candidato a Analista Backend
Prezado(a) desenvolvedor(a),

Bem-vindo(a) ao Teste para Candidato a Analista Backend. Este teste tem como objetivo avaliar seu conhecimento geral e 
sua velocidade de desenvolvimento. Abaixo, você encontrará os detalhes e os requisitos para este teste.

## O Desafio
Sua tarefa é desenvolver uma API  para um sistema de gerenciamento de catálogo de produtos em uma aplicação de marketplace. Você deverá analisar e converter as seguintes histórias de usuário em rotas para a aplicação:

### Histórias de Usuário:
  - Como usuário, quero cadastrar um produto com seu proprietário, para que eu possa acessar seus dados futuramente (título, descrição, preço, categoria, ID do proprietário).

 - Como usuário, quero cadastrar uma categoria com seu proprietário, para que eu possa acessar seus dados futuramente (título, descrição, ID do proprietário).

 - Como usuário, quero associar um produto a uma categoria.

 - Como usuário, quero atualizar os dados de um produto ou categoria.

 - Como usuário, quero deletar um produto ou categoria do meu catálogo.

## Regras:

Um produto só pode estar associado a uma única categoria por vez.
Assuma que os produtos e categorias pertencem apenas a um proprietário.

## Considerações:
Este é um catálogo de produtos online, o que significa que haverá múltiplas requisições para editar itens/categorias por segundo, assim como para acessar o endpoint de busca do catálogo.
Considere o catálogo de produtos como uma compilação JSON de todas as categorias e itens disponíveis pertencentes a um usuário. Dessa forma, o endpoint de busca no catálogo não precisa buscar informações no banco de dados.
## Funcionalidades adicionais:
Sempre que houver uma alteração no catálogo de produtos, publique essa alteração no tópico "catalog-emit" no serviço AWS SQS.
Implemente um consumidor que escute as alterações do catálogo para um proprietário específico.
Quando o consumidor receber uma mensagem, busque no banco de dados o catálogo desse proprietário, gere o JSON do catálogo e publique-o em um bucket do serviço AWS S3.
## Tecnologias que devem ser utilizadas:
 - MongoDB para o banco de dados.
 - AWS SQS para notificações de alterações no catálogo.
 - AWS S3 para armazenar o JSON do catálogo.
 - Spring java para o backend.
## Diagrama representando a estrutura final do projeto:

![image](https://github.com/user-attachments/assets/1739c590-f978-4725-a7b2-aad6f2b95de9)

Use sua própria conta AWS para configurar os serviços necessários.

Atualize este arquivo README com instruções sobre como rodar sua aplicação.

Cole o nome da branch no sistema GUPY e indique a conclusão do teste.

Sinta-se à vontade para nos enviar feedback sobre o teste.

Critérios de Avaliação
Iremos avaliar os seguintes aspectos da sua solução:

- Conhecimento de JavaScript, Node.js e Express.js.
- Estrutura adequada das camadas da aplicação.
- Tratamento de chamadas externas.
- Uso eficaz de variáveis de ambiente.
- Implementação de testes unitários.
- Mecanismos de log.
- Estratégias de tratamento de erros.
- Qualidade da documentação.
- Organização do código, separação de módulos, legibilidade e comentários.
- Histórico de commits.





