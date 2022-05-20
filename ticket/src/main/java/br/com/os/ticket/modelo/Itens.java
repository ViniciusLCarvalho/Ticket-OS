package br.com.os.ticket.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb004_itens")
public class Itens {
	
	private String no_modulo;
	private String no_item;
	private String no_icone_item;
	private int nu_ordem_item;
	private int ic_ativo_item;
}
