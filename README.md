Para rodar locamente:
- crie o banco de dados 'loja_brinquedos'
- execute a aplicação

No MYSQL-CLI execute: 
- INSERT INTO roles (id, name) VALUES (1, 'ROLE_ADMIN'), (2, 'ROLE_USER');
- insert into user_role(user_id, role_id) values (1,1), (1,2);

---
Requisitos funcionais:

1. Autenticação e autorização do usuário:
- Os usuários podem registrar uma conta
- Os usuários podem fazer login usando e-mail e senha
- Os usuários podem fazer login usando o Google OAuth2
- O sistema suporta diferentes funções de usuário (ROLE_ADMIN, ROLE_USER)

2. Gerenciamento de produtos:
- Os administradores podem adicionar, atualizar e excluir produtos
- Os produtos têm atributos como nome, preço, peso, descrição e imagem
- Os produtos são categorizados

3. Gerenciamento de categorias:
- Os administradores podem adicionar, atualizar e excluir categorias de produtos

4. Carrinho de compras:
- Os usuários podem adicionar produtos ao carrinho
- Os usuários podem visualizar o carrinho
- Os usuários podem remover itens do carrinho

5. Processo de checkout:
- Os usuários podem prosseguir para o checkout
- Os usuários podem fazer pedidos

6. Navegação de produtos:
- Os usuários podem visualizar todos os produtos
- Os usuários podem filtrar produtos por categoria
- Os usuários podem visualizar detalhes individuais do produto

Requisitos não funcionais:

1. Segurança:
- As senhas são criptografadas usando BCrypt
- O aplicativo usa Spring Security para autenticação e autorização

2. Desempenho:
- O aplicativo usa JPA e Hibernate para operações eficientes de banco de dados

3. Escalabilidade:
- O aplicativo é construído usando Spring Boot, que suporta escalabilidade

4. Usabilidade:
- A interface do usuário é construída usando Bootstrap para um design responsivo

5. Manutenibilidade:
- O código segue uma estrutura MVC clara (Controladores, Serviços, Repositórios)
- O aplicativo usa Thymeleaf para modelagem do lado do servidor, facilitando a manutenção de visualizações

6. Compatibilidade:
- O aplicativo suporta vários navegadores (implícito pelo uso de tecnologias da web padrão)

7. Internacionalização:
- O aplicativo tem algum suporte para internacionalização (como evidenciado pelo uso dos atributos th:text do Thymeleaf)

8. Persistência de dados:
- O aplicativo usa MySQL para armazenamento de dados
- Também há suporte para banco de dados H2, possivelmente para fins de desenvolvimento ou teste

9. Integração externa:
- O aplicativo se integra ao Google para OAuth2 autenticação
