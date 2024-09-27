# Projeto Perfil - API REST

Este projeto é uma API REST simples desenvolvida em Spring Boot para gerenciar perfis de usuários. A API permite a criação, leitura, atualização e exclusão de perfis, oferecendo um ponto de partida para aplicações que necessitam desse tipo de funcionalidade.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.3.4**
- **Maven**
- **Thunder Client** (para testes)

## Funcionalidades

A API oferece os seguintes endpoints:

### Endpoints

1. **Criar um novo perfil**
   - **Método:** POST
   - **URL:** `/api/perfis`
   - **Corpo da Requisição (JSON):**
     ```json
     {
       "nome": "Nome do Usuário",
       "email": "email@exemplo.com",
       "biografia": "Biografia do Usuário",
       "fotoPerfil": "URL da foto"
     }
     ```

2. **Obter todos os perfis**
   - **Método:** GET
   - **URL:** `/api/perfis`

3. **Obter perfil por ID**
   - **Método:** GET
   - **URL:** `/api/perfis/{id}`
   - **Parâmetro:** `id` - ID do perfil desejado

4. **Obter perfis por data de criação**
   - **Método:** GET
   - **URL:** `/api/perfis?dataCriacao=YYYY-MM-DD`
   - **Parâmetro:** `dataCriacao` - Data de criação no formato `YYYY-MM-DD`

5. **Atualizar um perfil**
   - **Método:** PUT
   - **URL:** `/api/perfis`
   - **Corpo da Requisição (JSON):**
     ```json
     {
       "id": 1,
       "nome": "Nome Atualizado",
       "email": "email@exemplo.com",
       "biografia": "Biografia Atualizada",
       "fotoPerfil": "Nova URL da foto"
     }
     ```

6. **Excluir um perfil**
   - **Método:** DELETE
   - **URL:** `/api/perfis/{id}`
   - **Parâmetro:** `id` - ID do perfil a ser excluído

## Instalação

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seuusuario/perfil.git
   cd perfil
   ```

2. **Compile o projeto:**
   ```bash
   mvn clean install
   ```

3. **Execute o projeto:**
   ```bash
   mvn spring-boot:run
   ```

4. **Acesse a API:**
   A API estará disponível em `http://localhost:8080/api/perfis`.

## Testando a API

Utilize o **Thunder Client** ou qualquer outra ferramenta de teste de API (como Postman ou cURL) para interagir com os endpoints descritos acima.

### Exemplo de Teste com Thunder Client

1. **Criar um novo perfil:**
   - Método: POST
   - URL: `http://localhost:8080/api/perfis`
   - Corpo:
     ```json
     {
       "nome": "John Doe",
       "email": "john.doe@example.com",
       "biografia": "Desenvolvedor de software",
       "fotoPerfil": "https://example.com/foto.jpg"
     }
     ```

2. **Obter todos os perfis:**
   - Método: GET
   - URL: `http://localhost:8080/api/perfis`

3. **Obter perfil por ID:**
   - Método: GET
   - URL: `http://localhost:8080/api/perfis/1`

4. **Obter perfis por data de criação:**
   - Método: GET
   - URL: `http://localhost:8080/api/perfis?dataCriacao=2024-09-11`

5. **Atualizar um perfil:**
   - Método: PUT
   - URL: `http://localhost:8080/api/perfis`
   - Corpo:
     ```json
     {
       "id": 1,
       "nome": "John Doe Atualizado",
       "email": "john.doe@updated.com",
       "biografia": "Desenvolvedor de software atualizado",
       "fotoPerfil": "https://example.com/nova-foto.jpg"
     }
     ```

6. **Excluir um perfil:**
   - Método: DELETE
   - URL: `http://localhost:8080/api/perfis/1`

## Contribuições

Sinta-se à vontade para fazer um fork deste repositório, fazer suas modificações e abrir um pull request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

Esse README fornece uma visão geral clara do projeto, suas funcionalidades e instruções de uso, facilitando para qualquer desenvolvedor a compreensão e a utilização da API. Se precisar de mais alguma coisa, é só avisar!
