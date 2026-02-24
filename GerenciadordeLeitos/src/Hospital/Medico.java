package Hospital;

import java.time.LocalDate;

public class Medico extends Pessoa {
	private String crm;
	private String rqe;

	public Medico (String nome, String cpf, LocalDate dataNascimento, String telefone, String crm, String rqe) {
		super(nome, cpf, dataNascimento, telefone);
		this.crm = crm;
		this.rqe = rqe;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getRqe() {
		return rqe;
	}

	public void setRqe(String rqe) {
		this.rqe = rqe;
	}

	@Override
	public String getFuncao() {
		return "Medico";
	}
	
	
}
