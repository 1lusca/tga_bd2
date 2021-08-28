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
public class ClubeJogador implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "s_ClubeJogador")
	@SequenceGenerator(name = "s_ClubeJogador", sequenceName = "s_ClubeJogador", allocationSize = 1)
	private long id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "jogador", foreignKey = @ForeignKey(name = "fk_clubejogador_jogador"))
	private Jogador jogador;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "clube", foreignKey = @ForeignKey(name = "fk_clubejogador_clube"))
	private Clube clube;
	
	
	
	public ClubeJogador (Jogador jogador, Clube clube) {
		this.jogador = jogador;
		this.clube = clube;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
	}

	@Override
	public String toString() {
		return "ClubeJogador [getJogador()=" + getJogador() + ", getClube()=" + getClube() + "]";
	}
	
}
