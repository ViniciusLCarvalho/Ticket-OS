package br.com.os.ticket.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb000_acessos")
public class Acessos {
	@Id
	private String id_login_senha;
	private String id_login;
	private LocalDate dt_cad_senha;
	private LocalDate dt_ultimo_acesso;
	private int qt_acessos;
	private LocalDate dt_revogacao;
	
	@ManyToMany
	private Perfil perfil;
	//Perfil	no_perfil
}
