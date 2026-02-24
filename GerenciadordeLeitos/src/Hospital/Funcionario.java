package Hospital;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
	public enum CargoEnfermagem {
		TECNICO,
		AUXILIAR
	}
	private String coren;
	private CargoEnfermagem cargo;
	
	public Funcionario (String nome, String cpf, LocalDate dataNascimento, String telefone, String coren, boolean tecnico, CargoEnfermagem cargo) {
		super(nome, cpf, dataNascimento, telefone);
		setCoren(coren);
		this.cargo = cargo;
	}

	public String getCoren() {
		return coren;
	}

	public void setCoren(String coren) {
		if (coren == null || coren.trim().isEmpty()) {
			throw new IllegalArgumentException("O COREN não pode ser vazio!");
		}
		this.coren = coren;
	}

	public CargoEnfermagem getCargo() {
		return cargo;
	}

	public void setCargo(CargoEnfermagem cargo) {
		this.cargo = cargo;
	}
	
	public boolean isTecnicoEnfermagem() {
	    return cargo == CargoEnfermagem.TECNICO;
	}

	public boolean isAuxiliarEnfermagem() {
	    return cargo == CargoEnfermagem.AUXILIAR;
	}

	public String getFuncao() {
	    switch (cargo) {
	    case TECNICO:
	    	return "Tecnico em enfermagem responsavel pelo paciente";
	    case AUXILIAR:
	    	return "Auxiliar em enfermagem responsavel pelo paciente";
	    default:
	    	return "Cargo ainda nao definido";
	    }
	}
}
	