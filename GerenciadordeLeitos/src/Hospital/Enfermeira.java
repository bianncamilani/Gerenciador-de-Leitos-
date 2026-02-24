package Hospital;

import java.time.LocalDate;

public class Enfermeira extends Pessoa {
	private String coren;
	private String especialidade;
	
	public Enfermeira (String nome, String cpf, LocalDate dataNascimento, String telefone, String coren, String especialidade) {
		super(nome, cpf, dataNascimento, telefone);
		this.coren = coren;
		this.especialidade = especialidade;
	}

	public String getCoren() {
		return coren;
	}

	public void setCoren(String coren) {
		this.coren = coren;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String getFuncao() {
		return "Enfermeira do setor";
	}

}

