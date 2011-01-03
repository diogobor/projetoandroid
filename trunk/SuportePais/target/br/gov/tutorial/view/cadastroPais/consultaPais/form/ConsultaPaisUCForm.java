package br.gov.tutorial.view.cadastroPais.consultaPais.form;

import java.util.ArrayList;
import java.util.Collection;

public class ConsultaPaisUCForm {
	private String codigo;
	private String codigoAuxiliar;
	private String valor;
	private String descricao;
	private Collection paises;
	
	public ConsultaPaisUCForm(){
		this.paises=new ArrayList();
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodigoAuxiliar() {
		return codigoAuxiliar;
	}
	public void setCodigoAuxiliar(String codigoAuxiliar) {
		this.codigoAuxiliar = codigoAuxiliar;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Collection getPaises() {
		return paises;
	}
	public void setPaises(Collection paises) {
		this.paises = paises;
	}
	
}
