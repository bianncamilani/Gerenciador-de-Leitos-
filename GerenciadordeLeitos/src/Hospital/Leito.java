package Hospital;

public class Leito {
	private int numero;
	private boolean ocupado;
	private String acomodacao;
	private String setor;
	private Paciente paciente;

	public Leito(int numero, String acomodacao, String setor) {
	   this.numero = numero;
	   this.ocupado = false;
	   this.acomodacao = acomodacao;
	   this.setor = setor;
	   this.paciente = null;
 }

	public int getNumero() {
	    return numero;
}

	public boolean isOcupado() {
	    return ocupado;
}

	public String getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(String acomodacao) {
		this.acomodacao = acomodacao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Paciente getPaciente() {
	    return paciente;
}

	public void ocupar(Paciente paciente) {
	    if (!ocupado) {
	    this.ocupado = true;
        this.paciente = paciente;
    } else {
        System.out.println("Leito ocupado!");
    }
}

	public void liberar() {
		if (ocupado) {
			this.ocupado = false;
			this.paciente = null;
		} else {
			System.out.println("Leito livre!");
    }
}
}
