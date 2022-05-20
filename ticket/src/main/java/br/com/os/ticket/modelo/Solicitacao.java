package br.com.os.ticket.modelo;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb011_solicitacao")
public class Solicitacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cd_tipo_soliciatacao;
	private String no_solicitacao;
	private LocalTime pz_resolucao;
	//Setor			cd_fksetor
	//Prioridade	cd_fk_prioridade
}
