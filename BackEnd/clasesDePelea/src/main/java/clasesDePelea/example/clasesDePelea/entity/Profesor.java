package clasesDePelea.example.clasesDePelea.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;


@Entity
public class Profesor extends Persona {
	
	private static final long serialVersionUID = 509922200530278411L;
	
	@ManyToMany(mappedBy = "profesores")
    private Set<Servicio> servicios;
	
	public Profesor() {}
	
	public Profesor(String nombre, String rut, String telefono) {
		super(nombre, rut, telefono);
	}

	public Set<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}
	
	
}
