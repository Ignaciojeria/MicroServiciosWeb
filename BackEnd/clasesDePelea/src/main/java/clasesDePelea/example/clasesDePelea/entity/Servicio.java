package clasesDePelea.example.clasesDePelea.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Servicio {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;
	@Column
	private Clase clase;
	@Column
	private Plan plan;
	
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private Set<Profesor> profesores;
}
