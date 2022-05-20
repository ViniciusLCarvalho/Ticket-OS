package br.com.os.ticket.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb012_setor")
public class Setor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cd_setor;
	private String no_setor;
	//Usuario		nu_cpf_fk
	private String ed_email_responsavel;
	private String nu_telefone_responsavel;
}
