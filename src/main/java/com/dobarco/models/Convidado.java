package com.dobarco.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
//Anotação de entidades.
@Entity
public class Convidado {
	//Especifica o ID da database
	@Id
	@NotEmpty
	private String rg;
	
	//Annotation para processo de validação Spring.
	@NotEmpty
	private String nomeConvidado;
	
	//Tipo de relacionamento n to n, cascade para dropar todas as tabelas em caso
	//de deleção de um item relacionado.
	@ManyToOne
	@Cascade(CascadeType.ALL)
	private Evento evento;
	
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNomeConvidado() {
		return nomeConvidado;
	}
	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}
	
	
}
