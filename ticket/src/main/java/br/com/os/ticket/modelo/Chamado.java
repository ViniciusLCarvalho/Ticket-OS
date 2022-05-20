package br.com.os.ticket.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb010_chamado")
public class Chamado {
	
	@Id
	private String nu_os;
	@Column(columnDefinition="TEXT")
	private String tx_descricao;
	private String ds_dispositivo;
	private String nu_fone_contato;
	private LocalDateTime dt_criacao;
	private LocalDateTime dt_hr_inicio_atendimento;
	private LocalDateTime dt_hr_fechamento;
	private LocalDateTime dt_hr_pr_conclusao;
	//Situacoes			ic_situacao
	//Dispositivos		id_dispositivo
	//Usuarios			nu_cpf
	//Solicitacao		cd_solicitacao
	//Setor				cd_setor
	//Contrato			nu_contrato
}
