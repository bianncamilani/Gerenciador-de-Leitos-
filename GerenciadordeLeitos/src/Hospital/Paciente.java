package Hospital;

import java.time.LocalDate;

public class Paciente extends Pessoa {
	private String diagnostico;
	private String nomeMae;
	private String nomeMedico;
	private boolean contaminado;
	private Medico medico;
	private Enfermeira enfermeira;
	private Funcionario funcionario;
	
	public Paciente(String nome, String cpf, LocalDate dataNascimento, String telefone, String diagnostico, String nomeMae, String nomeMedico, boolean contaminado) {
        super(nome, cpf, dataNascimento, telefone);
        this.diagnostico = diagnostico;
        this.nomeMae = nomeMae;
        this.nomeMedico = nomeMedico;
        this.contaminado = contaminado;
    }
	
	public String getNomeMedico() {
		return nomeMedico;
	}


	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public String getNomeMae() {
		return nomeMae;
	}


	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	

	public boolean isContaminado() {
		return contaminado;
	}


	public void setContaminado(boolean contaminado) {
		this.contaminado = contaminado;
	}

	public void setMedico(Medico medico) { 
	   this.medico = medico; 
	} 
	
	public Medico getMedico() { 
	   return medico; 
	}

	public Enfermeira getEnfermeira() {
      return enfermeira;
   }

   public void setEnfermeira(Enfermeira enfermeira) {
      this.enfermeira = enfermeira;
   }

   public Funcionario getFuncionario() {
      return funcionario;
   }

   public void setFuncionario(Funcionario funcionario) {
      this.funcionario = funcionario;
   }

   @Override
	public String getFuncao() {
		return "Paciente";
	}

	public Paciente() { 
	   
	}
	public void configurarPaciente(String nome, String cpf, LocalDate dataNascimento, String telefone, String diagnostico, String nomeMae, String nomeMedico, boolean contaminado) { 
	   super.setNome(nome); 
	   super.setCpf(cpf); 
	   super.setDataNascimento(dataNascimento); 
	   super.setTelefone(telefone); 
	   this.diagnostico = diagnostico; 
	   this.nomeMae = nomeMae; 
	   this.nomeMedico = nomeMedico; 
	   this.contaminado = contaminado; }
}
