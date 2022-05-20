package br.com.os.ticket.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb016_pendemcias")
public class Pendencias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pend;
	//Chamado	fk_nuos
	private boolean ic_pendencia;
	@Column(columnDefinition="TEXT")
	private String tx_pendencia;
	@Column(columnDefinition="TEXT")
	private String tx_resposta;
	private LocalDateTime dt_criacao;
	private LocalDateTime dt_resposta;
}
