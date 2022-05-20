package br.com.os.ticket.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb006_programas")
public class Programas {
	
	@Id
	private String no_programa;
	private String de_programa;
	private boolean ic_consultar;
	private boolean ic_incluir;
	private boolean ic_alterar;
	private boolean ic_excluir;
	//Nivel				co_nivel
	//Funcionalidades	no_programa_pai
	private String de_diretorio_programa;
}
