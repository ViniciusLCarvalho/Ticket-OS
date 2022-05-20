package br.com.os.ticket.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb014_prioridade")
public class Prioridade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cd_prioridade;
	private String no_prioridade;
}
