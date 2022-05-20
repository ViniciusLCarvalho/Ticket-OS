package br.com.os.ticket.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb005_funcionalidades")
public class Funcionalidades {
	
	private String no_modulo;
	private String no_item;
	private String no_funcionalidade;
	private int	nu_ordem_funcionalidade;
	private int ic_ativo_funcionalidade;
	private String no_programa_pai;
	private String de_funcionalidade;
	
	
}
