package br.com.os.ticket.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb002_perfil")
public class Perfil {

	@Id
	private String no_perfil;
	private String de_perfil;
	//Modulos	no_modulo_inicial;
	//NivelOrg	co_nivel;
}
