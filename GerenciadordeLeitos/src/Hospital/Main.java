package Hospital;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GerenciadorLeitos gerenciador = new GerenciadorLeitos(15);
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
           System.out.println("======================================"); 
           System.out.println(" SISTEMA DE GERENCIAMENTO DE LEITOS "); 
           System.out.println("======================================");
           System.out.println("1 - Listar leitos");
           System.out.println("2 - Ocupar leito (escolher número)");
           System.out.println("3 - Liberar leito");
           System.out.println("4 - Internar paciente (primeiro leito disponível)");
           System.out.println("0 - Sair");
           System.out.println("\n======================================");
           System.out.print("Escolha: ");
           System.out.println("\n======================================");
           opcao = sc.nextInt();
           sc.nextLine();

            switch (opcao) {
                case 1:
                    gerenciador.listarLeitos();
                    break;
                case 2:
                    System.out.print("Número do leito: ");
                    int numOcupar = sc.nextInt();
                    sc.nextLine();
                    Paciente paciente1 = criarPaciente(sc);
                    gerenciador.ocuparLeito(numOcupar, paciente1);
                    break;
                case 3:
                    System.out.print("Número do leito: ");
                    int numLiberar = sc.nextInt();
                    gerenciador.liberarLeito(numLiberar);
                    break;
                case 4:
                    Paciente paciente2 = criarPaciente(sc);
                    gerenciador.internarPaciente(paciente2);
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static Paciente criarPaciente(Scanner sc) {
       System.out.print("Nome do paciente: ");
       String nome = sc.nextLine();

       System.out.print("CPF do paciente: ");
       String cpf = sc.nextLine();

       System.out.print("Telefone do paciente: ");
       String telefone = sc.nextLine();

       System.out.print("Diagnóstico: ");
       String diagnostico = sc.nextLine();

       System.out.print("Paciente está contaminado? (true/false): ");
       boolean contaminado = sc.nextBoolean();
       sc.nextLine();
       
       System.out.print("Nome da mãe do paciente: "); 
       String nomeMae = sc.nextLine();

       System.out.print("Nome do médico responsável: ");
       String nomeMedico = sc.nextLine();
       
       Medico medico = new Medico(nomeMedico, "000.000.000-00", LocalDate.now(), "9999-9999", "CRM123", nomeMedico);

       System.out.print("Nome da enfermeira responsável: ");
       String nomeEnfermeira = sc.nextLine();
       
       Enfermeira enfermeira = new Enfermeira( nomeEnfermeira, "111.111.111-11", LocalDate.now(), "8888-8888", "COREN123", "Enfermeira(o)" );
       
       System.out.print("Nome do funcionário responsável: ");
       String nomeFuncionario = sc.nextLine();
       
       Funcionario funcionario = new Funcionario(nomeFuncionario, "222.222.222-22", LocalDate.now(), "7777-7777", "COREN456", false, Funcionario.CargoEnfermagem.TECNICO);

       Paciente paciente = new Paciente(); 
       paciente.configurarPaciente( 
             nome, cpf, LocalDate.now(), telefone, 
             diagnostico, nomeMae, nomeMedico, contaminado ); 
       paciente.setMedico(medico);
       paciente.setEnfermeira(enfermeira);
       paciente.setFuncionario(funcionario);
       
       return paciente; 
       }
}



