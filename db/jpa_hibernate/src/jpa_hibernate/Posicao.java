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
public class Posicao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Posicao")
	@SequenceGenerator(name = "s_Posicao", sequenceName = "s_Posicao", allocationSize = 1)
	private long id;
	
	@OneToMany(mappedBy = "posicao")
	private List<Jogador> jogador;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	
	public Posicao() { jogador = new ArrayList<>(); }
	 
	
	public Posicao (String nome) {
		this.nome = nome;
	}
	
	public String getNome () {return this.nome;}
	
	public void setNome (String nome) {this.nome = nome;}
	
	public String toString () {
		return ("Nome: "+getNome());
	}
	
}