package jpa_hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Tecnico implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Tecnico")
	@SequenceGenerator(name = "s_Tecnico", sequenceName = "s_Tecnico", allocationSize = 1)
	private long id;
	
	@OneToMany(mappedBy = "tecnico")
	private List<ClubeTecnico> clubetecnico;
	
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	
	public Tecnico () {
		clubetecnico = new ArrayList<>();
	}
	
	public List<ClubeTecnico> getClubeTecnico() {
		return clubetecnico;
	}

	public void setClubeTecnico(List<ClubeTecnico> clubetecnico) {
		this.clubetecnico = clubetecnico;
	}

	public Tecnico (String nome) {
		this.nome = nome;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Tecnico [getClubeTecnico()=" + getClubeTecnico() + ", getNome()=" + getNome() + "]";
	}

	

	
	
}
