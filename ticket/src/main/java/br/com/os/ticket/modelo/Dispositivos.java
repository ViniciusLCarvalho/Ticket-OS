package br.com.os.ticket.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb018_dispositivos")
public class Dispositivos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_dispositivo;
	private String no_dispositivo;
}
