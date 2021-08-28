package jpa_hibernate;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ClubeTecnico implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "s_ClubeTecnico")
	@SequenceGenerator(name = "s_ClubeTecnico", sequenceName = "s_ClubeTecnico", allocationSize = 1)
	private long id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "tecnico", foreignKey = @ForeignKey(name = "fk_clubetecnico_tecnico"))
	private Tecnico tecnico;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "clube", foreignKey = @ForeignKey(name = "fk_clubejogador_clube"))
	private Clube clube;
	
	
	
	public ClubeTecnico (Tecnico tecnico, Clube clube) {
		this.tecnico = tecnico;
		this.clube = clube;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
	}

	@Override
	public String toString() {
		return "ClubeTecnico [getTecnico()=" + getTecnico() + ", getClube()=" + getClube() + "]";
	}

	
}
