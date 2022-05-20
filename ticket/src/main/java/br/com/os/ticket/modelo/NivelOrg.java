package br.com.os.ticket.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb001_nivel_organizacional")
public class NivelOrg {
	
	@Id
	private int co_nivel;
	private String de_nivel;
}
