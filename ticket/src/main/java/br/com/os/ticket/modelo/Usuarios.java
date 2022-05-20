package br.com.os.ticket.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb009_usuarios")
public class Usuarios {
	
	@Id
	@Column(columnDefinition="DECIMAL")
	private int nu_cpf;
	private String id_login;
	private String no_perfil;
	private String no_usuario;
	private String ed_email;
	private String nu_celular;
	private String nu_telefone_trabalho;
	private LocalDate dt_cadastramento;
	private LocalDate dt_ultima_alteracao;
	private LocalDate dt_desligamento;
	
}
