package main.br.com.solid.model.projeto.tarefa;

import java.time.LocalDate;

public class Impedimento {
	
	private String motivo;
	private LocalDate dataImpedimento;
	
	public Impedimento(String motivo, LocalDate dataImpedimento) {
		this.motivo = motivo;
		this.dataImpedimento = dataImpedimento;
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	public LocalDate getDataImpedimento() {
		return dataImpedimento;
	}
	
	@Override
	public String toString() {
		return "[" + motivo + " - " + dataImpedimento + "]";
	}

}
