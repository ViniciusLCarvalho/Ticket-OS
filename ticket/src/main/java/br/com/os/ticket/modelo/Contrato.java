package br.com.os.ticket.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb013_contrato")
public class Contrato {

	//Empresa		nu_cnpj
	@Id
	private String nu_contrato;
	private String no_contrato;
}
