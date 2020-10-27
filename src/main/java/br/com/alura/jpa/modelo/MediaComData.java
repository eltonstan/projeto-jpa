package br.com.alura.jpa.modelo;

public class MediaComData {

	private Double valor;
	private Integer dia;
	private Integer mes;
	
	public MediaComData(Integer dia, Integer mes, Double valor) {
		this.valor = valor;
		this.dia = dia;
		this.mes = mes;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

}
