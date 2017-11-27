package clasesDePelea.example.clasesDePelea.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class Persona implements Serializable {
	
	private static final long serialVersionUID = -4535742179029217814L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	@Column
	private String nombre;
	@Column
	private String rut;
	@Column
	private String telefono;
	
	public Persona(){}
	
	public Persona(String nombre, String rut, String telefono) {
		this.nombre = nombre;
		this.rut = rut;
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
