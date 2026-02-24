Sistema de Gerenciamento de Leitos

Descrição:
Este projeto é um sistema simples em Java para gerenciamento de leitos hospitalares.
Ele permite:
- Listar leitos disponíveis e ocupados
- Ocupar um leito com um paciente
- Liberar leitos
- Internar pacientes automaticamente no primeiro leito disponível
- Garantir regras de isolamento (não misturar pacientes contaminados com não contaminados)
- Impedir que dois pacientes ocupem o mesmo leito

Tecnologias utilizadas:
- Java 25.0.2
- Eclipse IDE ou qualquer editor compatível
- Paradigma Orientado a Objetos (POO)

Estrutura do projeto:
- Main.java → Classe principal com menu interativo via console
- GerenciadorLeitos.java → Responsável por controlar os leitos e aplicar regras de ocupação
- Leito.java → Representa cada leito hospitalar
- Paciente.java → Classe que modela os pacientes
- Medico.java, Enfermeira.java, Funcionario.java → Classes que representam profissionais de saúde
- Pessoa.java → Classe base para herança

Como executar:
- Clone o repositório:
- git clone https://github.com/bianncamilani/Gerenciador-de-Leitos-.git
- Abra o projeto em sua IDE (Eclipse, IntelliJ ou VS Code).
- Compile e execute a classe Main.java.
- Use o menu interativo para gerenciar os leitos.

Exemplo de uso:
- Ao rodar o programa, você verá o menu:

Código
======================================
 SISTEMA DE GERENCIAMENTO DE LEITOS 
======================================
1 - Listar leitos
2 - Ocupar leito (escolher número)
3 - Liberar leito
4 - Internar paciente (primeiro leito disponível)
0 - Sair
======================================
Escolha:


Regras implementadas:
- Um leito só pode ser ocupado por um paciente.
- Pacientes contaminados não podem ser internados junto com pacientes não contaminados.
- O sistema lança mensagens de alerta e impede operações inválidas.

Próximos passos:
- Implementar quartos com múltiplos leitos.
- Adicionar persistência em banco de dados.
- Criar interface gráfica para facilitar o uso.

Autora:
- Bianca Milani
