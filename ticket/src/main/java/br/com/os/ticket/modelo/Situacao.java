package br.com.os.ticket.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb017_situacoes")
public class Situacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_situacao;
	private String no_situacao;
}
