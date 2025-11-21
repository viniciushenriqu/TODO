# Lista de Tarefas - Projeto Completo

Este repositório contém uma aplicação completa de lista de tarefas (TODO list) composta por um backend em Java com Spring Boot e um frontend em Angular. O backend fornece uma API REST para gerenciamento de tarefas, armazenadas em memória (sem banco de dados persistente). O frontend é uma interface web responsiva que consome essa API.

## Tecnologias Utilizadas

### Backend
- Java 17
- Spring Boot 3.2.5
- Maven
- API RESTful

### Frontend
- Angular 20
- TypeScript
- HTML / CSS
- RxJS

## Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- **Java 17** ou superior
- **Maven** (para o backend)
- **Node.js** e **Angular CLI** (para o frontend)

## Estrutura do Projeto

```
TODO-master/
├── backend/                    # API REST em Spring Boot
│   ├── src/
│   │   ├── main/java/com/example/todoapi/
│   │   │   ├── Task.java              # Modelo de dados da tarefa
│   │   │   ├── TaskController.java    # Controlador REST
│   │   │   └── TodoBackendMemoryApplication.java  # Classe principal
│   │   └── main/resources/
│   │       ├── application.properties
│   │       └── data.sql
│   └── pom.xml                 # Configuração Maven
├── lista-tarefas-web/          # Frontend Angular
│   ├── src/
│   │   ├── app/
│   │   │   ├── components/
│   │   │   │   ├── task-list/         # Componente de lista de tarefas
│   │   │   │   └── footer/            # Componente de rodapé
│   │   │   ├── models/
│   │   │   │   └── tarefa.ts          # Interface da tarefa
│   │   │   ├── services/
│   │   │   │   └── tarefa.service.ts  # Serviço para consumir a API
│   │   │   └── app.component.*        # Componente principal
│   │   └── index.html
│   ├── package.json             # Dependências Node.js
│   └── angular.json             # Configuração Angular
└── README.md                   # Este arquivo
```

## Instalação e Configuração

### Backend
1. Navegue até a pasta do backend:
   ```
   cd backend
   ```

2. Execute o projeto com Maven:
   ```
   mvn spring-boot:run
   ```

   A API estará disponível em `http://localhost:8080`.

### Frontend
1. Navegue até a pasta do frontend:
   ```
   cd lista-tarefas-web
   ```

2. Instale as dependências:
   ```
   npm install
   ```

3. Execute a aplicação:
   ```
   ng serve --open
   ```

   A aplicação web estará disponível em `http://localhost:4200`.

## Executando a Aplicação Completa

1. Inicie o backend primeiro (porta 8080).
2. Em outro terminal, inicie o frontend (porta 4200).
3. Abra o navegador em `http://localhost:4200` para usar a aplicação.

**Nota:** O backend deve estar rodando para que o frontend funcione corretamente.

## API Endpoints

A API REST fornece os seguintes endpoints para gerenciamento de tarefas:

- `GET /api/tasks` - Lista todas as tarefas
- `POST /api/tasks` - Cria uma nova tarefa
- `PUT /api/tasks/{id}` - Atualiza uma tarefa existente
- `DELETE /api/tasks/{id}` - Remove uma tarefa

### Exemplo de Payload

```json
{
  "title": "Minha tarefa",
  "completed": false
}
```

## Funcionalidades

- ✅ Adicionar novas tarefas
- ✅ Listar tarefas existentes
- ✅ Marcar tarefas como concluídas
- ✅ Editar tarefas
- ✅ Remover tarefas
- ✅ Interface responsiva

## Desenvolvimento

### Backend
- O backend usa armazenamento em memória, ou seja, os dados são perdidos ao reiniciar a aplicação.
- Para adicionar persistência, considere integrar com um banco de dados como H2, PostgreSQL ou MySQL.

### Frontend
- O frontend consome a API via HTTP usando o serviço `TarefaService`.
- A interface é construída com componentes Angular reutilizáveis.

## Testes

### Backend
Execute os testes com Maven:
```
cd backend
mvn test
```

### Frontend
Execute os testes com Angular CLI:
```
cd lista-tarefas-web
ng test
```

## Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## Licença

Este projeto é distribuído sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
