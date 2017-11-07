package org.okis.beans;

public class Bonos {

	private String tipoBono;

	private Integer valorBono;

	public Bonos(String tipoBono, Integer valorBono) {
		super();
		this.tipoBono = tipoBono;
		this.valorBono = valorBono;
	}

	public Bonos() {

	}

	public String getTipoBono() {
		return tipoBono;
	}

	public void setTipoBono(String tipoBono) {
		this.tipoBono = tipoBono;
	}

	public Integer getValorBono() {
		return valorBono;
	}

	public void setValorBono(Integer valorBono) {
		this.valorBono = valorBono;
	}

}
