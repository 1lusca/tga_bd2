package jpa_hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Jogador implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Jogador")
	@SequenceGenerator(name = "s_Jogador", sequenceName = "s_Jogador", allocationSize = 1)
	private long id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "posicao", foreignKey = @ForeignKey(name = "fk_jogador_posicao"))
	private Posicao posicao;
	
	
	@OneToMany(mappedBy = "jogador")
	private List<ClubeJogador> clubejogador;
	 
	
	@Column(nullable = false, length = 50)
	private String nome;

	
	public Jogador () { clubejogador = new ArrayList<>(); }
	 
	
	public Jogador (Posicao posicao, String nome) {
		this.posicao = posicao;
		this.nome = nome;
	}
	
	public Posicao getPosicao () {return this.posicao;}
	
	public void setPosicao (Posicao posicao) {this.posicao = posicao;}
	
	public String getNome () {return this.nome;}
	
	public void setNome (String nome) {this.nome = nome;}
	
	public String toString () {
		return ("Posicao: "+getPosicao()+"%n"+"Nome: "+getNome());
	}
	
}
