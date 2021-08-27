package jpa_hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Campeonato implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Campeonato")
	@SequenceGenerator(name = "s_Campeonato", sequenceName = "s_Campeonato", allocationSize = 1)
	private long id;
	
	@OneToMany(mappedBy = "campeonato")
	private List<Rodada> rodadas;
	
	//@Column(nullable = false, unique = true)
	//private int idCampeonato;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = false, length = 4)
	private int ano;
	
	@Column(nullable = false, length = 2)
	private int nroClubes;
	
	public Campeonato () {
		rodadas = new ArrayList<>();
	}
	
	public Campeonato (String nome, int ano, int nroClubes) {
		this.nome = nome;
		this.ano = ano;
		this.nroClubes = nroClubes;
	}
	
	public String getNome () {return this.nome;}
	
	public void setNome (String nome) {this.nome = nome;}
	
	public int getAno () {return this.ano;}
	
	public void setAno (int ano) {this.ano = ano;}
	
	public int getNroClubes () {return this.nroClubes;}
	
	public void setNroClubes (int nroClubes) {this.nroClubes = nroClubes;}
	
	public String toString () {
		return ("Nome do campeonato: "+getNome()+"%n"+"Ano: "+getAno()+"%n"+"Número de clubes: "+getNroClubes());
	}
	
}
