package Hospital;

import java.time.LocalDate;


public abstract class Pessoa {
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	private String telefone;
	
	public Pessoa (String nome, String cpf, LocalDate dataNascimento, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
	}
	public Pessoa() { 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
	    return LocalDate.now().getYear() - dataNascimento.getYear();
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public abstract String getFuncao();
	
}
