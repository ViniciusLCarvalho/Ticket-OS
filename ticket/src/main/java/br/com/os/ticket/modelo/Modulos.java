package br.com.os.ticket.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb003_modulos")
public class Modulos {

	@Id
	private String no_modelo;
	private String de_modelo;
	private String no_icone_modulo;
	private int co_nivel_modulo;
	private String cr_fundo_modulo;
}
